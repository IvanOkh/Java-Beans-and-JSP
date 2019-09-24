/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Models.Note;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
/**
 *
 * @author 797462
 */
public class NoteServlet extends HttpServlet 
{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
               
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        // to read files
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
  
        Note record = new Note();
          
        String lineOne = br.readLine();
        String lineTwo = br.readLine();
       
        record.setTitle(lineOne);
        record.setContext(lineTwo);
        request.setAttribute("Note", record ); 
        
        String editNote = request.getParameter("edit");
        //The edit link can be written as <a href="note?edit"> 
        //and the edit parameter can be used to determine which JSP to display.
        if (editNote == null)
        {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
               .forward(request, response);
        }
        else
        {       
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
               .forward(request, response);
        }

        br.close();

        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);
 
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        
        String firstText = request.getParameter("inputOne");
        String secondText = request.getParameter("inputTwo");
        
        pw.println(firstText);
        pw.println(secondText);
        pw.close();

        Note record = new Note();
        record.setTitle(firstText);
        record.setContext(secondText);
        request.setAttribute("Note", record );
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
       
    }

}

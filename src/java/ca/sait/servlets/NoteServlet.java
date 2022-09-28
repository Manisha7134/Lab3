/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.servlets;

import ca.sait.models.Note;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author manisha
 */
public class NoteServlet extends HttpServlet {

   

  
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          String path = getServletContext().getRealPath("/WEB-INF/note.txt");
            // to read files
           BufferedReader br = new BufferedReader(new FileReader(new File(path)));

        String tittle = br.readLine();
        String contents = br.readLine();
        
        
       Note note = new Note (tittle, contents);
        
       request.setAttribute("note", note);
       
        String edit = request.getParameter("edit");
        
        if (edit != null){
            this.getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        } else {
            this.getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }
        
        
        
        
       //this.getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
       //this.getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String tittle = request.getParameter("tittle");
       String contents = request.getParameter("contents");
       
       String path = getServletContext().getRealPath("/WEB-INF/note.txt");
         
          BufferedReader br = new BufferedReader(new FileReader(new File(path)));
          
          PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
       
       pw.println(tittle);
        pw.println(contents);
        pw.close();
        
        response.sendRedirect("note");
       
       
       
       
       
       
       
       
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

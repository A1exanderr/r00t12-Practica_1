package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SRMD", urlPatterns = {"/SRMD"})
public class SRMD extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SRMD</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Operaciones Aritmeticas </h1>");
            out.println("<form action='' method='post'>");
                out.println("Numero: ");
                out.println("<input type='number' name='num1' required> ");
                out.println("<br>");
                out.println("Numero2: ");
                out.println("<input type='number' name='num2' required>");
                out.println("<br>");
                out.println("<input type='submit' value='Enviar'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        processRequest(request, response);
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
        //processRequest(request, response);
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SRMD</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Operaciones Aritmeticas </h1>");
            out.println("<form>");
                out.println("<datalist id='res'>");
                    out.println("<option value='2'>Suma</option>");
                    out.println("<option value='3'>Resta</option>");
                out.println("</datalist>");
                out.println("<label>El resultado es:</label>");
                out.println("<input type='text' name='resultado' list='res' disabled>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
        finally{out.close();}
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

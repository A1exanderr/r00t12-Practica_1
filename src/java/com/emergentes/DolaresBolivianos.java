package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jin
 */
@WebServlet(name = "DolaresBolivianos", urlPatterns = {"/DolaresBolivianos"})
public class DolaresBolivianos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DolaresBolivianos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DolaresBolivianos at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet DolaresBolivianos</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Dolares a Bolivianos</h1>");
        out.println("<form action='' method='post'>");
            out.println("Dolares: ");
            out.println("<input type='number' name='dolar' value='0'>");
            out.println("<br>");
            out.println("<h1>Bolivianos a Dolares</h1>");
            out.println("Bolivianos");
            out.println("<input type='number' name='boliviano' value='0'>");
            out.println("<br>");
            out.println("<input type='submit' value='Enviar'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
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
       // processRequest(request, response);
        int dolar = Integer.parseInt(request.getParameter("dolar"));
        int bo = Integer.parseInt(request.getParameter("boliviano"));
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            if(dolar != 0)
            {
                double dol=dolar*6.9;
                out.println("Dolares en bolivianos es: "+dol+"<br>");
            }
            if(bo != 0)
            {
                double bol=bo/6.9;
                out.println("Bolivianos en dolares es: "+bol+"<br>");
            }
        }
        finally{out.close();}
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

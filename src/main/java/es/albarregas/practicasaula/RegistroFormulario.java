/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.practicasaula;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author David
 */
@WebServlet(name = "registroFormulario", urlPatterns = {"/registroFormulario"})
public class RegistroFormulario extends HttpServlet {

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
            out.println("<title>Servlet registroFormulario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet registroFormulario at " + request.getContextPath() + "</h1>");
           
            out.println("<table border=\"1\" align=\"center\" style=\"background-color:#D2D68D\" cellpadding = \"5\"" + 
                " cellspacing = \"5\">");
            Map<String, String[]> map = request.getParameterMap();
             Set set = map.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String[]> entry = (Map.Entry<String, String[]>) it.next();
            String paramName = entry.getKey();
            out.print("<tr><td>" + paramName + "</td><td>");
            String[] paramValues = entry.getValue();
            if (paramValues.length == 1) {
                String paramValue = paramValues[0];
                if (paramValue.length() == 0)
                    out.println("<td><b></b><img src=\"HTML\\error.png\">");
                else{
                    out.println(paramValue);}
            } else {
                out.println("<ul>");
                for (int i = 0; i < paramValues.length; i++) {
                    if(paramValues[i].equals("Nombre")||paramValues[i].equals("Usuario")||paramValues[i].equals("Contraseña")){
                    out.println("<td><b></b><img src=\"HTML\\check.png\">");
                    }else{
                    out.println("<li>" + paramValues[i]+ "Esto que es" + "</li>");}
                }
                out.println("</ul>");
            }
        }
           
             out.println("</table>");
         
            
            
            
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
        processRequest(request, response);
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

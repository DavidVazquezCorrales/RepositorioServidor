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
@WebServlet(name = "RegistroFormularioo", urlPatterns = {"/RegistroFormularioo"})
public class RegistroFormularioo extends HttpServlet {

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
            out.println("<title>Registro Usuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align=\"center\">Registro de usuario</h1>");
           
            out.println("<table  align=\"center\" style=\"background-color:#D2D68D\" cellpadding = \"5\"" + 
                " cellspacing = \"5\">");
            String cadenaFecha="";
            Map<String, String[]> map = request.getParameterMap();
             Set set = map.entrySet();
        Iterator it = set.iterator();
        String cadenaFec="";
            
        while (it.hasNext()) {
            Map.Entry<String, String[]> entry = (Map.Entry<String, String[]>) it.next();
            String paramName = entry.getKey();
                        if(paramName.equals("Dia")){
                            
                        }else if(paramName.equals("Mes")){
                            
                        }else if(paramName.equals("Anio")){
                            
                            out.println("<tr><td>" +"Fecha de nacimiento" + "</td><td>");
                        }else{
            out.print("<tr><td>" + paramName + "</td><td>");}
            String[] paramValues = entry.getValue();
            if (paramValues.length == 1) {
                String paramValue = paramValues[0];
                if (paramValue.length() == 0 && paramName.equals("Nombre")){
                    out.println("<form id='form' name='form' method=\"POST\" action=\"registroFormulario\">");
                    out.println("<input type=\"text\" name=\"Nombre\"/><br/>  ");
                    out.println("<td><b></b><img src=\"HTML\\error.png\" width=\"20\" height=\"20\">");
                }else if(paramValue.length()==0 && paramName.equals("Password")){
                    out.println("<input type=\"text\" name=\"Password\"/><br/>  ");
                    out.println("<td><b></b><img src=\"HTML\\error.png\" width=\"20\" height=\"20\">");
                }else if(paramValue.length()==0 && paramName.equals("Usuario")){
                    out.println("<input type=\"text\" name=\"Usuario\"/><br/>  ");
                    out.println("<td><b></b><img src=\"HTML\\error.png\" width=\"20\" height=\"20\">");
                }
                else{
                    if(paramValues.length>0 && paramName.equals("Nombre") ){
                        
                         out.println(paramValue);
                         out.println("<td><b></b><img src=\"HTML\\check.png\" width=\"20\" height=\"20\">");
                        
                         
                    }else if(paramValues.length>0 && paramName.equals("Password")){
                         out.println(paramValue);
                         out.println("<td><b></b><img src=\"HTML\\check.png\" width=\"20\" height=\"20\">");
                    }else if(paramValues.length>0 && paramName.equals("Usuario")){
                        out.println(paramValue);
                        out.println("<td><b></b><img src=\"HTML\\check.png\" width=\"20\" height=\"20\">");
                    }
                    if(paramName.equals("Nombre")||paramName.equals("Password")||paramName.equals("Usuario")){
                }else{ //codigo que sobra
                        if(paramName.equals("Dia")){
                            cadenaFec=cadenaFec+paramValue;
                        }else if(paramName.equals("Mes")){
                            cadenaFec=cadenaFec+"/"+paramValue;
                        }else if(paramName.equals("Anio")){
                            cadenaFec=cadenaFec+"/"+paramValue;
                            out.println(cadenaFec);
                        }else{
                     out.println(paramValue);}
                    if(paramName.equals("Apellidos")){
                        
                    out.println("<input type='hidden' name='Apellidos' value='"+paramValue+"'>");
                    } else if(paramName.equals("Estado")){
                    out.println("<input type='hidden' name='Estado' value='"+paramValue+"'>");   
                    }else if(paramName.equals("Anio")){
                    out.println("<input type='hidden' name='Anio' value='"+paramValue+"'>");   
                    }else if(paramName.equals("Dia")){
                    out.println("<input type='hidden' name='Dia' value='"+paramValue+"'>");   
                    }else if(paramName.equals("Mes")){
                    out.println("<input type='hidden' name='Mes' value='"+paramValue+"'>");   
                    }else if(paramName.equals("Deporte")){
                    out.println("<input type='hidden' name='Deporte' value='"+paramValue+"'>");   
                    }else if(paramName.equals("Lectura")){
                    out.println("<input type='hidden' name='Lectura' value='"+paramValue+"'>");   
                    }else if(paramName.equals("Cine")){
                    out.println("<input type='hidden' name='Cine' value='"+paramValue+"'>");   
                    }else if(paramName.equals("Viajes")){
                    out.println("<input type='hidden' name='Viajes' value='"+paramValue+"'>");   
                    }
                    
                    }
                    }
            } else {
                
                 
            }
        }   out.println("<td><td><button type=\"submit\" id=\"boton\">Enviar</button>");  
            out.println("<br><a href=\"index.html\">Menú incial</a>");
            out.println(" </form>");
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

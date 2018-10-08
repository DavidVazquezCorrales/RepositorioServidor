<%-- 
    Document   : contadorVisitasCookies
    Created on : 05-oct-2018, 16:17:39
    Author     : David
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="../HTML/estilo.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Controlador de visitas con Cookies</title>
    </head>
    <body>
        <%! int contador=0;
        int contador2=0;%>
        <%    
            
            if(contador2==0){
                 contador2++;
                Cookie miCookie=new Cookie("IDSESSION","001");
                response.addCookie(miCookie);
                miCookie.setMaxAge(-1);
                Cookie[] cook=request.getCookies();
               
            }else if(request.getParameter("submit").equals("Recargar")){
                  contador++;
            }else if(request.getParameter("submit").equals("Eliminar")){
                contador=0;
                
            }
                
                
        %>
        <div>
        <p>Has visitado la página <% if(contador>1){ %> <%= contador%> veces<%}else{%> <%= contador%> vez <%}  %> </p>
        <p>Información de la Cookie</p>
        <p>Caducidad: Hata que se cierre el navegador </p>
        <form name="formulario" method="post" action="contadorVisitasCookies.jsp">
             <input type="submit" name="submit" value="Recargar">
            <input type="submit" name="submit" value="Eliminar">
            <input type="submit" name="submit" value="Menú principal" >
            
            </form
            <br>
        </div>
    </body>
</html>

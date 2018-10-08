<%-- 
    Document   : menuCookies
    Created on : 05-oct-2018, 16:30:12
    Author     : David
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../HTML/estilo.css" rel="stylesheet" type="text/css">
        <title>Menú Cookies</title>
    </head>
    
    <body>
        <div>
        <form name="formulario" method="post" action="controlDeCookies.jsp">
            <label name="Nombre">Nombre: </label>
            <input type="text" name="Nombre">
            <br>
            <label name="Valor">Valor: </label>
            <input type="text" name="Valor">
            <br>
            <br>
            <input type="submit" name="submit" value="Crear">
            <input type="submit" name="submit" value="Visualizar">
            <input type="submit" name="submit" value="Modificar">
            <input type="submit" name="submit" value="Eliminar">
            <br>
       <% String mensaje=request.getParameter("menu");
    if(mensaje !=null && mensaje!=""){
    %><%= mensaje %> <% } %>
        </form >
   </div>
    
    
    </body>
</html>

<%-- 
    Document   : menuDeSesiones
    Created on : 08-oct-2018, 17:46:43
    Author     : David
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../HTML/estilo.css" rel="stylesheet" type="text/css">
        <title>JSP Page</title>
    </head>
    <body>
     <div>
        <form name="formulario" method="post" action="controlDeSesiones.jsp">
            <label name="Nombre">Nombre del atributo sesión: </label>
            <input type="text" name="Nombre">
            <br>
            <label name="Valor">Valor del atributo: </label>
            <input type="text" name="Valor">
            <br>
            <br>
            <input type="submit" name="submit" value="Crear">
            <input type="submit" name="submit" value="Visualizar">
            <input type="submit" name="submit" value="Modificar">
            <input type="submit" name="submit" value="Eliminar">
            <input type="submit" name="submit" value="Menú inicial">
            <br>
       <% String mensaje=request.getParameter("mensaje");
        if(mensaje !=null && mensaje!=""){
            %><%= mensaje %> <% } %>
        </form >
    </div>
    </body>
</html>

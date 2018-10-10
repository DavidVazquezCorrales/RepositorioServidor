<%-- 
    Document   : controlDeSesiones
    Created on : 08-oct-2018, 17:29:51
    Author     : David
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="../HTML/estilo.css" rel="stylesheet" type="text/css">
        <title>Control de Sesiones</title>
    </head>
    <body>
        <% 
            if(request.getParameter("submit").equals("Crear")){
                HttpSession sesion = request.getSession();
                String nombreSesion=request.getParameter("Nombre");
                String valorSesion=request.getParameter("Valor");
                
            }
        
       
%>    
</body>
</html>

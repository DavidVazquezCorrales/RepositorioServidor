<%-- 
    Document   : Saludo
    Created on : 01-oct-2018, 17:00:59
    Author     : David
--%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Date" import="java.time.LocalTime" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Saludo</title>
    </head>
    <body>
    <% String tratamiento=null;
    String nombre=request.getParameter("Nombre");
    tratamiento=request.getParameter("Sexo".equals("Hombre") ? "señor":"señora");
    int hora= LocalTime.now().getHour();
    String saludo=null;
    if(hora>=8 && hora<13){
    saludo="os dias";
    }else if(hora>= 13 && hora<19){
    saludo="as tardes";
    }else{
    saludo="as noches";}
    
%>
<h1> Buen<%= saludo %>, <%= tratamiento %> <%= nombre %></h1>

    </body>
</html>


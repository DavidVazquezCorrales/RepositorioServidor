<%-- 
    Document   : FechaNacimiento
    Created on : 03-oct-2018, 17:44:15
    Author     : David
--%>


<%@page import="java.lang.*"%>
<%@page import="java.time.Period"%>
<%@page import="java.time.LocalDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <% String nombre=request.getParameter("nombre");
        String fechaNac= request.getParameter("fecha");
        String[] array="";
        array[1]="antonio";
        
    int anio=Integer.parseInt(array[1]);
    int mes=Integer.parseInt(array[2]);
    int dia=Integer.parseInt(array[0]);
    LocalDate fechaN= LocalDate.of(anio,mes,dia);
    LocalDate fechaActual = LocalDate.now();
     Period comparando=Period.between(fechaN, fechaActual); %>
 
  <h1> Hola <%= nombre %>,Te quedan <%= comparando %> días para tu cumpleaños</h1>
   
        <h1>Hola</h1>
    </body>
</html>

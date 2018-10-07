<%-- 
    Document   : controlDeCookies
    Created on : 05-oct-2018, 16:28:33
    Author     : David
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% if(request.getParameter("submit").equals("Crear")){
                Cookie[] cook=request.getCookies();
                String nombreCookie=request.getParameter("Nombre");
                String valorCookie=request.getParameter("Valor");
                for(int i=0;i<cook.length;i++){
                if(cook[i].getName().equals(nombreCookie)){
                    String mensaje="Ya existe la cookie"; 
                    response.sendRedirect("menuCookies.jsp?men="+mensaje);
                    break; }else{
                
                Cookie cookNueva=new Cookie(nombreCookie,valorCookie);
                cookNueva.setMaxAge(-1);//Expira cuando cerremos el navegador.
                cookNueva.setPath("/");
                response.addCookie(cookNueva);
                String mensaje="Cookie "+nombreCookie+" creada, con valor "+valorCookie; 
                response.sendRedirect("menuCookies.jsp?men="+mensaje);
                break;}}
        }else if(request.getParameter("submit").equals("Visualizar")){
        %><html>
             <head>  </head>
             <body>
                 <p>Visualizacion de Cookie</p>
             </body>                
        <%      String nombreCookie=request.getParameter("Nombre");
                String valorCookie=request.getParameter("Valor");
                boolean entrada=true;
                Cookie[] cook=request.getCookies();
            
            for(int i=0;i<cook.length;i++){
                if(cook[i].getName().equals(nombreCookie)){
                %> <p> Cookie con nombre  <%= cook[i].getName()%> y valor <%= cook[i].getValue() %> </p> 
                <% entrada=false; }
             }if(entrada==true){
                %>  <p> Cookie con ese nombre no existe  </p>   <%}

                 //Eliminar   
        }else if (request.getParameter("submit").equals("Eliminar")){
                String mensaje="No ha podido eliminarse la cookie porque no existe";
                String nombreCookie=request.getParameter("Nombre");
                Cookie[] cook=request.getCookies();
                Cookie cookieB=new Cookie(nombreCookie,"");
                cookieB.setMaxAge(0);//Expira cuand cerremos el navegador
                cookieB.setPath("/");
                for(int i=0; i<cook.length;i++){
                    if(cook[i].getName().equals(nombreCookie)){
                        mensaje="Eliminada la cookie"+cook[i].getName();
                        cook[i].setMaxAge(0);
                        cook[i].setValue("");
                        cook[i].setPath("/");
                        response.addCookie(cookieB);//Sobreescribimos cookie por nada ""
                        

                        break;
                    }
                }
                
                response.sendRedirect("menuCookies.jsp?men="+mensaje);
        }else if(request.getParameter("submit").equals("Modificar")){
                String mensaje="No ha podido modificarse la cookie porque no existe";
                String nombreCookie=request.getParameter("Nombre");
                String valorCookie=request.getParameter("Valor");
                Cookie[] cook=request.getCookies();
                Cookie cookieNueva=new Cookie(nombreCookie,valorCookie);
                cookieNueva.setMaxAge(-1);
                cookieNueva.setPath("/");
                for(int i=0; i<cook.length;i++){
                    if(cook[i].getName().equals(nombreCookie)){
                        response.addCookie(cookieNueva);
                        mensaje="Modificada la cookie: "+cook[i].getName();
                        break;

}
}                           response.sendRedirect("menuCookies.jsp?men="+mensaje);

}
        %>
    </body>
</html>

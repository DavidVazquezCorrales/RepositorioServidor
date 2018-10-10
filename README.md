Registro de usuario:
En el servlet: Utilizamos un map, para recoger los datos del form.(registro.html)
Con un while recorremos el map.
Preguntamos si, los datos Password,Usuario y Nombre tiene contenido o no. if (paramValues.length == 1)
Si no tiene pintamos en el servlet un <input type=\"text\" name=\"El dato que falte\"/><br/>, ponemos imagen indicando que falta datos out.println("<td><b></b><img src=\" Imagen\" width=\"20\" height=\"20\">");
 Si tiene contenido ponemos imagen indicando que el dato es correcto 
 out.println("<td><b></b><img src=\"HTML\\check.png\" width=\"20\" height=\"20\">");
   
Preguntamos sobre los parametros de los distintos campos if(paramName.equals("Lo que sea")) para introducirlos en un <input type="hidden> y volver a enviar el formulario con los mismos datos.
Ponemos un boton para enviar el formulario, de nuevo.
  
  
  
Formulario simple:

HTML(formularioSimple.html) nos pide introducir Nombre y e-mail. Marcar una opción checkBox. Un boton para enviar la información a un Servlet. En el servlet nos muestra la información introducida.

Formulario Complejo:

HTML (formularioComplejo.html) nos pide introducir, Usuario-password tipo text.Edad tipo select. Estado civil con cuatro estados: Soltero, casado, viudo, divorciado de tipo radio. Aficiones: Deporte, música, informática, viajes, tipo select multiple. Comentarios tipo textarea. Pregunta Dispones de internet: Si-No tipo radio. Sistema operativo: Linux,Windows, Macintosh, Solaris tipo select.
Toda esta información la manda a un servlet FormularioComplejo, que muestra la información que hemos introducido en el Html.

Cabecera

Servlet que nos muestra todas las cabeceras. Recorremos las cabeceras con Enumeration<String> headerNames = request.getHeaderNames(); y un while (headerNames.hasMoreElements()).


Saludo

HTM(saludo.html) Introducimos nombre, y seleccionar un sexo, por defecto seleccionamos mujer. Un boton que envía la información a un jsp (Saludo.jsp) donde nos la va a mostrar

Fecha nacimiento

HTML(FechaNacimiento.html) Introducimos un nombre y una fecha de nacimiento, un boton enviar. El boton envia los datos a una página jsp(FechaNacimiento.jsp) Nos muesta un mensaje donde nos dice los dias que faltan para el cumpleaños.

Control de Cookies:

JSP(menuCookies.jsp) Nos pide nombre para la Cookie y un valor. Cuatro botones para realizar distintas acciones con los datos que introducimos. Crear, Visualizar, Modificar y Eliminar la cookie que indiquemos.


Control de visitas con Cookie

Nos muestra las veces que hemos visitado la pagina (contadorVisitasCookies.jsp) Tres botones, Recargar, Eliminar y Menú principal. Recargar suma una visita más al contador. Eliminar pone el contador a 0.

Control de sesiones

JSP(menuDeSesiones.jsp) Nos pide un nombre para el atributo sesión y un valor. Cuatro botones, Crear, Visualizar, Modificar, Eliminar y Menú principal.
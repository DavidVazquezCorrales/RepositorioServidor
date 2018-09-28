Registro de usuario:
En el servlet: Utilizamos un map, para recoger los datos del form.(registro.html)
Con un while recorremos el map.
Preguntamos si, los datos Password,Usuario y Nombre tiene contenido o no. if (paramValues.length == 1)
Si no tiene pintamos en el servlet un <input type=\"text\" name=\"El dato que falte\"/><br/>, ponemos imagen indicando que falta datos out.println("<td><b></b><img src=\" Imagen\" width=\"20\" height=\"20\">");
 Si tiene contenido ponemos imagen indicando que el dato es correcto 
 out.println("<td><b></b><img src=\"HTML\\check.png\" width=\"20\" height=\"20\">");
   
Preguntamos sobre los parametros de los distintos campos if(paramName.equals("Lo que sea")) para introducirlos en un <input type="hidden> y volver a enviar el formulario con los mismos datos.
Ponemos un boton para enviar el formulario, de nuevo.
  
  
  Al reenviar el formulario funciona, verifica los datos correctos, pero si falta solo el Password, hay algo que falla y no se vuelve a enviar.
  No he conseguido sacar la fecha " Fecha nacimiento: dd/mm/aaaa", ni comprobar si es correcta la fecha.
  

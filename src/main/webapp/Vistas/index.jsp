<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="co.ufps.elecciones.entities.Eleccion" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
    <title>Votar</title>
   <link href="css/style.css" rel="stylesheet">
   
</head>

<body>
	<form id="msform" action="../IndexController" method="post">
		<fieldset>
			<img src="images/logo_horizontal.png">
			<h2 class="fs-title">Votaciones UFPS</h2>
			
			<p>Seleccione la elección en la que desea participar</p>			
			<%List<Eleccion> elecciones = (List<Eleccion>)request.getAttribute("elecciones");%>
			<select class="form-control" name="eleccion" required>
				<option disabled="disabled" selected="selected">Eleccion</option>
				<%
				  if(elecciones != null)
					  for(Eleccion e: elecciones) { %>
					  	<option value="<%=e.getId()%>"><%=e.getNombre()%></option>
				<%}
			%>
			</select>
			<input type="submit" name="votar" class="next action-button" value="Votar Ahora" />
		</fieldset>
	</form>
	
	<script src="http://thecodeplayer.com/uploads/js/jquery-1.9.1.min.js" type="text/javascript"></script>
	<script src="http://thecodeplayer.com/uploads/js/jquery.easing.min.js" type="text/javascript"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js"></script>
</body>
</html>
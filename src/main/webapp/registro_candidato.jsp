<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="co.ufps.elecciones.entities.Eleccion" %>
<%@page import="co.ufps.elecciones.dao.EleccionDAO" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
    <title>Inscribir Candidato</title>
   <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet">
   
</head>

<body>
	<form id="msform" action="CandidatoController" method="post">
		<fieldset>
			<img src="<%=request.getContextPath()%>/images/logo_horizontal.png">
			<h2 class="fs-title">Registrar Candidato</h2>
			<input type="text" id="documento" placeholder="Documento" requried/>
			<input type="text" id="nombre" placeholder="Nombre"requried/>
			<input type="text" id="apellido" placeholder="Apellido"requried/>
			<select class="form-control" name="proceso" required>
				<option disabled="disabled" selected="selected">Proceso</option>
				<%
					EleccionDAO ed = new EleccionDAO();
					List<Eleccion> elecciones = ed.findAll();
					
				  	if(elecciones != null)
						for(Eleccion e: elecciones){%>
					  		<option value="<%=e.getId()%>"><%=e.getNombre()%>/option>
					  	<%}%>
			</select>
			<input type="submit" name="next" class="next action-button" value="Registrar Candidato" />
		</fieldset>
	</form>
	<script src="http://thecodeplayer.com/uploads/js/jquery-1.9.1.min.js" type="text/javascript"></script>
	<script src="http://thecodeplayer.com/uploads/js/jquery.easing.min.js" type="text/javascript"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js"></script>
</body>
</html>
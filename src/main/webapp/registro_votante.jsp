<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="co.ufps.elecciones.entities.Tipo_Documento" %>
<%@page import="co.ufps.elecciones.dao.Tipo_DocumentoDAO"%>
<%@page import="co.ufps.elecciones.entities.Eleccion" %>
<%@page import="co.ufps.elecciones.dao.EleccionDAO" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
    <title>Inscribir Votante</title>
   <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet">
   
</head>

<body>			
	<form id="msform" action="VotanteController" method="post">
		<fieldset>
			<img src="<%=request.getContextPath()%>/images/logo_horizontal.png">
			<h2 class="fs-title">Registrar Votante</h2>
			<select class="form-control" name="tipodocumento">
				<option disabled="disabled" selected="selected">Tipo de Documento</option>
				<%
					Tipo_DocumentoDAO tDao = new Tipo_DocumentoDAO();
					List<Tipo_Documento> tiposdocumento = tDao.findAll();					
				  	if(tiposdocumento != null)
				  		for(Tipo_Documento td: tiposdocumento) { %>
					  	<option value="<%=td.getId()%>"><%=td.getDescripcion()%></option>
				<%}%>
			</select>
			<input type="text" name="documento" placeholder="Documento" required/>
			<input type="text" name="nombre" placeholder="Nombre" required/>
			<input type="text" name="email" placeholder="Email" required/>			
			<select class="form-control" name="proceso" required>
				<option disabled="disabled" selected="selected">Proceso</option>
				<%
					EleccionDAO eDao = new EleccionDAO();
					List<Eleccion> elecciones = eDao.findAll();
				  	if(elecciones != null)
					  for(Eleccion e: elecciones) { %>
					  	<option value="<%=e.getId()%>"><%=e.getNombre()%></option>
				<%}	%>
			</select>
			<input type="submit" name="next" class="next action-button" value="Registrar Votante" />
		</fieldset>
	</form>
	
	<script src="http://thecodeplayer.com/uploads/js/jquery-1.9.1.min.js" type="text/javascript"></script>
	<script src="http://thecodeplayer.com/uploads/js/jquery.easing.min.js" type="text/javascript"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js"></script>
</body>
</html>
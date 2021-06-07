<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="co.ufps.elecciones.entities.Estamento" %>
<%@page import="co.ufps.elecciones.entities.Estamento" %>
<%@page import="co.ufps.elecciones.dao.EstamentoDAO" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
    <title>Confirmar Datos</title>
    <link href="<%= request.getContextPath()%>/css/style.css" rel="stylesheet">
</head>

<body>
	<form id="msform">
		<fieldset>
			<img src="<%= request.getContextPath()%>/images/logo_horizontal.png">
			<h2 class="fs-title">Confirmar Datos</h2>
			<label>${eleccion.getNombre()}</label>
			<select class="form-control" name="estamento">
				<option disabled="disabled" selected="selected">Estamento</option>
				<%
					EstamentoDAO edao = new EstamentoDAO();
					List<Estamento> estamentos = edao.findAll();
				  	if(estamentos != null)
						for(Estamento e: estamentos) { %>
					  		<option value="<%=e.getId()%>"><%=e.getDescripcion()%></option>
				<%}
			%>
			</select>
			<input type="text" name="documento" placeholder="Documento" required/>
			<input type="text" name="nombre" placeholder="Nombre" required/>
			<input type="text" name="email" placeholder="Email" required/>
			<input type="submit" name="enviar" class="next action-button" value="Confirmar Datos" />
		</fieldset>
	</form>
	
	<script src="http://thecodeplayer.com/uploads/js/jquery-1.9.1.min.js" type="text/javascript"></script>
	<script src="http://thecodeplayer.com/uploads/js/jquery.easing.min.js" type="text/javascript"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js"></script>
</body>
</html>
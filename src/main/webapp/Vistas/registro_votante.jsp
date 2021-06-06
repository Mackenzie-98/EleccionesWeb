<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
    <title>Inscribir Votante</title>
   <link href="style.css" rel="stylesheet">
   
</head>

<body>
	<form id="msform">
	<fieldset>
		<img src="images/logo_horizontal.png">
		<h2 class="fs-title">Registrar Votante</h2>
	
		<select class="form-control" id="estamento">
			<option disabled="disabled" selected="selected">Estamento</option>
		</select>
		<select class="form-control" id="tipodocumento">
			<option disabled="disabled" selected="selected">Tipo de Documento</option>
		</select>
		<input type="text" id="documento" placeholder="Documento" />
		<input type="text" id="nombre" placeholder="Nombre"/>
		<input type="text" id="email" placeholder="Email"/>
		<select class="form-control" id="proceso">
			<option disabled="disabled" selected="selected">Proceso</option>
		</select>
		<input type="button" name="next" class="next action-button" value="Registrar Votante" />
	</fieldset>
</form>

<!-- jQuery -->
<script src="http://thecodeplayer.com/uploads/js/jquery-1.9.1.min.js" type="text/javascript"></script>
<!-- jQuery easing plugin -->
<script src="http://thecodeplayer.com/uploads/js/jquery.easing.min.js" type="text/javascript"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js"></script>
</body>
</html>
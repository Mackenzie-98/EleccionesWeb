<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="co.ufps.elecciones.entities.Votante" %>
<%@page import="co.ufps.elecciones.entities.Candidato" %>
<%@page import="co.ufps.elecciones.entities.Eleccion" %>
<%@page import="co.ufps.elecciones.entities.Voto" %>
<%@page import="co.ufps.elecciones.dao.VotoDAO" %>


<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Elecciones UFPS</title>
	<link rel="stylesheet" href="css/style2.css">
	<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
</head>
<body>

<div class="wrapper">
	<div class="title">
		Seleccione el candidato por el que desea votar
	</div>
	<label class="option_item">
		<%
			Votante v = (Votante) request.getAttribute("votante");
			Eleccion e = (Eleccion) request.getAttribute("eleccion");
			List<Candidato> candidatos = e.getCandidatos();
		
		
		%>
      <input type="radio" class="checkbox">
      	<div class="option_inner facebook">
	        <div class="tickmark"></div>
	        <div class="icon"><i class="fab fa-facebook-f"></i></div>
	        <div class="name">Facebook</div>
	      </div>
    </label>
	 	${eleccion.getNombre()}
	 	${estamento.getNombre()}
  	</div>

	<div class="container">
		
	</div>	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@page import="co.ufps.elecciones.entities.Eleccion" %>
<%@page import="co.ufps.elecciones.entities.Estamento" %>
<%@page import="co.ufps.elecciones.entities.Votante" %>
<%@page import="co.ufps.elecciones.entities.Candidato" %>

<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Elecciones UFPS</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style2.css">
	<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
</head>
<body>

<div class="wrapper">
	<div class="title">
	 	<h2>${eleccion.getNombre()}</h2>
	 	<h2>${estamento.getDescripcion()}</h2>
  	</div>

	<form action="VotarController" method="post" class="container">
		<c:forEach var="c" items="${candidatos}">
			<label class="option_item">	
				<input type="radio" class="checkbox" name="candidato" value="${c.getId()}">		
					<div class="option_inner">
						<div class="tickmark"></div>
			        	<div class="icon"><i class="fab"></i></div>
			        	<div class="name">${c.getNombre()} ${c.getApellido()}</div>
			        </div>
			</label>
		</c:forEach>
		<input type="submit" value="Votar">	
	</form>
</div>
</body>
</html>
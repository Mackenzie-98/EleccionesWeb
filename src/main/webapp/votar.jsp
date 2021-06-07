<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
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
	 	${eleccion.getNombre()}
	 	${estamento.getNombre()}
  	</div>

	<div class="container">
	<label class="option_item">
      <input type="checkbox" class="checkbox">
      <div class="option_inner facebook">
        <div class="tickmark"></div>
        <div class="icon"><i class="fab fa-facebook-f"></i></div>
        <div class="name">Facebook</div>
      </div>
    </label>
		<%List<Candidato> candidatos =  (List<Candidato>) request.getAttribute("candidatos");%>
	    <%if(candidatos != null)
			for(Candidato c: candidatos){%>
				<label class="option_item"> 
			      	<input type="radio" class="checkbox" value=<%=c.getId()%> name="elegido">
					<div class="option_inner">
				   		<div class="tickmark"></div>
			       		<div class="icon"><i class="fab fa"></i></div>
			       		<div class="name"><%=String.valueOf(c.getNombre() + " " + c.getApellido())%></div>
		    		</div>
		    	</label>
		    <%}%>
	</div>
</div>
</body>
</html>
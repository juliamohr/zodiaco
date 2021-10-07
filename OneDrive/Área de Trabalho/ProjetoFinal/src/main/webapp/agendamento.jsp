<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Agendamento de Consulta</title>



<link rel="stylesheet"
	href="<%=request.getContextPath()%>resources/css/agendamento.css" />
<style><%@include file="resources/css/agendamento.css"%></style>
<script><%@include file="resources/js/agendamento.js"%></script>



<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">



</head>
<body>



	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js">
<script
src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.16.0/jquery.validate.min.js">
<script
src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js">




<form method="post" action="inserirConsulta">




<label>Nome:</label> <input type="text" required="required"
value="<c:out value='${paciente.nome}'/>" name="nome" />

<br>

<label>Sobrenome:</label>
<input type="text" required="required"
value="<c:out value='${paciente.sobrenome}'/>" name="sobrenome" />

<br>

<label>Data:</label> <input type="date" required="required"
value="<c:out value='${consulta.data}'/>" name="data" />

<br>

<label>Horas:</label>
<input type="time" required="required"
value="<c:out value='${consulta.hora}'/>" name="hora" />

<br>

<select>



<option value="<a href="<%=request.getContextPath()%>/listarNutricionista">"></a>Selecione um nutricionista de sua preferencia</option>
<c:forEach var="item" items="${nutricionit}">
<option value="<c:out value='${nutricionista.id}' />">Nutricionita 1
</option>
</c:forEach>

</select>



<p>



<button type="submit">Agendar</button>

</form>



</body>
</html>
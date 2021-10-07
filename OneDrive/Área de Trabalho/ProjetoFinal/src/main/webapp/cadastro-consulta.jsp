<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Agendamento de Consulta</title>

<link rel="stylesheet" href="<%=request.getContextPath()%>resources/css/agendamento.css"/>
<style><%@include file="resources/css/agendamento.css"%></style>
<script><%@include file="resources/js/agendamento.js"%></script>

<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" />

</head>
<body>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.16.0/jquery.validate.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
	<script src="script.js"></script>
	
	<form method="post" action="inserirConsulta">
	
		 <label class="fieldlabels">ID paciente:</label> <input type="text" placeholder="ID paciente: " value="<c:out value='${paciente.id}'/>" name="idpaciente"  /> 

		<label>Data:</label> <input type="date" required="required"
			value="<c:out value='${consulta.data}'/>" name="data" /> 
			
			<br> 
			
			<label>Horas:</label> <input type="time" required="required"
			value="<c:out value='${consulta.hora}'/>" name="hora" />
			
			 <br> 


			<label>Nutricionista:</label>
 			  <select class="form-control" required = "required" id = "idnutri" name = "idnutri">
                            <c:forEach var="nutricionista" items="${nutricionistas}">
                                <option value="${nutricionista.id}">
                                    <c:out value="${nutricionista.nome}"/>
                                </option>
                            </c:forEach>
                        </select>
                        
                        <br>
                        
          
                       		
					<button type="submit">Agendar</button>
	</form>

</body>
</html>
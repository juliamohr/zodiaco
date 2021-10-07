<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro medidas</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">

		<link rel="stylesheet" href="<%=request.getContextPath()%>resources/css/medidas.css"/>
		<style><%@include file="resources/css/medidas.css"%></style>
		<script><%@include file="resources/js/medidas.js"%></script>		

</head>
<body>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.16.0/jquery.validate.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
  <script src="script.js"></script>
    <form id="medidas" method ="post" action= "inserirMedidas" >
        <fieldset>
            <h2 class="fs-titulo">Informe as medidas</h2>
            <h3 class="fs-subtitulo"></h3>
            
            <input type="number" name="peso" placeholder="Peso" id="peso" title="Seu peso deve ser maior que 0 e menor que 500"  maxlength="3" required = "required"
         	value="<c:out value='${historico.peso}'/>" name="peso" />
            
            <input type="number" name="altura" placeholder="Altura" id="altura" title="Sua altura deve ser maior que 0 e menor que 3.0" required = "required"
            value="<c:out value='${historico.altura}'/>" name="altura" />
            
            <input type="number" name="cintura" placeholder="cintura" id="cintura"  title="Sua cintura deve ser maior que 0 e menor que 102" required = "required"
            value="<c:out value='${historico.cintura}'/>" name="cintura" />
            
            <input type="number" name="quadril" placeholder="quadril" id="quadril"  title="Seu quadril deve ser maior que 0 e menor que 1" required = "required"
            value="<c:out value='${historico.quadril}'/>" name="quadril" />
            
            <input type="number" name="busto" placeholder="busto" id="busto"  title="Seu busto deve ser maior que 0 e menor que 200" required = "required"
            value="<c:out value='${historico.busto}'/>" name="busto" />
            
            <div class="input-container">
			<span class="input-icon"> <i class="far fa-calendar-alt"></i>
			</span><input type="date" required="required"
				id="txtDat" class="form-input" onchange="validardata(this)"
				title="Entre com uma data válida"
				value="<c:out value='${historico.data}'/>" name="data" />
			</div>
            
          
          <button type="button" id="botao" class="button" data-toggle="modal" data-target="#exampleModal">
            Enviar
               </button>
            </fieldset>
               <!-- Modal -->
               <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
               <div class="modal-dialog" role="document">
                 <div class="modal-content">
                 <div class="modal-header">
                   <h5 class="modal-title" id="exampleModalLabel">Confirmação de medidas
                   </h5>
                   <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                   <span aria-hidden="true">&times;</span>
                   </button>
                 </div>
                 <div class="modal-body">
                  Suas medidas estão prestes a serem cadastradas. Suas informações estão certas?
                 </div>
                 <div class="modal-footer">
                   <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
                   <button type="submit" class="btn btn-primary">Salvar informações </button >
                 </div>
                 </div>
               </div>
               </div>
           
        </form>
</body>
</html>
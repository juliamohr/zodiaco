<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>Cadastro Paciente</title>
 <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css'>
<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.0.3/css/font-awesome.css'>
  
	<link rel="stylesheet" href="<%=request.getContextPath()%>resources/css/cadastropaciente.css"/>
	<style><%@include file="resources/css/cadastropaciente.css"%></style>
	<script><%@include file="resources/js/cadastropaciente.js"%></script>	


</head>
<body>
<!-- partial:index.partial.html -->
<div class="container-fluid">
    <div class="row justify-content-center">
        <div class="col-11 col-sm-10 col-md-10 col-lg-6 col-xl-5 text-center p-0 mt-3 mb-2">
            <div class="card px-0 pt-4 pb-0 mt-3 mb-3">
                <h2 id="heading">Faça seu Cadastro</h2>
            
         <form id="msform" method="post" action="inserirPaciente">
                    <ul id="progressbar">
                        <li class="active" id="account"><strong>Conta</strong></li>
                        <li id="personal"><strong>Contato</strong></li>
                        <li id="payment"><strong>Pessoal</strong></li>
                        <li id="confirm"><strong>Finalizar</strong></li>
                    </ul>
                    <div class="progress">
                        <div class="progress-bar progress-bar-striped progress-bar-animated" role="progressbar" aria-valuemin="0" aria-valuemax="100"></div>
                    </div> <br> <!-- fieldsets -->
                    <fieldset>
                        <div class="form-card">
                            <div class="row">
                                <div class="col-7">
                                    <h2 class="fs-title">Informações da conta:</h2>
                                </div>
                                
                            </div> <label class="fieldlabels">Nome de usuario</label> <input type="text" name="login" placeholder="Insira um nome de usuario" value="<c:out value='${usuario.login}'/>" name="login" />
                             <label class="fieldlabels">Senha</label> <input type="password" name="senha" placeholder="Insira uma senha"/> 
                             <label class="fieldlabels">Confirme sua senha</label> <input type="password" name="senha" placeholder="Confirme sua senha" value="<c:out value='${usuario.senha}'/>" name="senha" />
                        </div> <input type="button" name="próximo" class="next action-button" value="Próximo" />
                    </fieldset>
                    <fieldset>
                        <div class="form-card">
                            <div class="row">
                                <div class="col-7">
                                    <h2 class="fs-title">Informações de contato</h2>
                                </div>
                                
                            </div> <label class="fieldlabels">Email</label> <input type="email" name="email" placeholder="Insira seu email." value="<c:out value='${contato.email}'/>" name="email"/> 
                            <label class="fieldlabels">Telefone Residencial</label> <input type="tel" name="telefone" placeholder="Insira um telefone." value="<c:out value='${contato.telefone}'/>" name="telefone"/> 
                            <label class="fieldlabels">Telefone celular</label> <input typetel name="celular" placeholder="Insira um telefone celular" value="<c:out value='${contato.celular}'/>" name="celular"/> 
                
                        </div> <input type="button" name="next" class="next action-button" value="Próximo" /> <input type="button" name="Voltar" class="previous action-button-previous" value="Previous" />
                    </fieldset>
                    <fieldset>
                        <div class="form-card">
                            <div class="row">
                                <div class="col-7">
                                    <h2 class="fs-title">Informações Pessoais</h2>
                                </div>
                            
                                <label class="fieldlabels">Primeiro Nome</label> <input type="text" name="nome" placeholder="Insira seu Primeiro nome." value="<c:out value='${usuario.nome}'/>" name="nome"  /> 
                                <label class="fieldlabels">Sobrenome</label> <input type="text" name="sobrenome" placeholder="Insira seu Sobrenome" value="<c:out value='${usuario.sobrenome}'/>" name="sobrenome" /> 
                                <label class="fieldlabels">Idade</label> <input type="number" name="idade" placeholder="Insira sua idade." value="<c:out value='${usuario.idade}'/>" name="idade" /> 
                                <label class="fieldlabels">CPF</label> <input type="text" name="cpf" placeholder="Insira seu cpf" value=" <c:out value='${usuario.cpf}'/>" name="cpf" /> 
								<label class="fieldlabels">CEP</label> <input type="text" name="cep" placeholder="Insira seu cep" value=" <c:out value='${endereco.cep}'/>" name="cep" /> 
                                <label class="fieldlabels">Rua</label> <input type="text" name="rua" placeholder="Insira sua rua" value="<c:out value='${endereco.rua}'/>" name="rua" /> 
                                <label class="fieldlabels">Complemento</label> <input type="text" name="complemento" placeholder="Digite o complemento" value="<c:out value='${endereco.complemento}'/>" name="complemento" /> 
                                <label class="fieldlabels">Numero</label> <input type="number" name="numero" placeholder="Insira o numero." value=" <c:out value='${endereco.numero}'/>" name="numero" /> 
                                <label class="fieldlabels">Bairro</label> <input type="text" name="bairro" placeholder="Insira o seu bairro."value=" <c:out value='${endereco.bairro}'/>" name="bairro" />
                                <label class="fieldlabels">Cidade</label> <input type="text" name="cidade" placeholder="Insira sua cidade." value=" <c:out value='${endereco.cidade}'/>" name="cidade" />
                                <label class="fieldlabels">Estado</label> <input type="text" name="estado" placeholder="Insira seu estado." value=" <c:out value='${endereco.estado}'/>" name="estado" />   

                            </div> <label class="fieldlabels">Escolha sua foto de perfil:</label> <input type="file" name="pic" accept="image/*"> 
                        </div> <input type="submit" name="next" class="next action-button" value="Enviar" /> <input type="button" name="previous" class="previous action-button-previous" value="Voltar" />
                    </fieldset>
                    <fieldset>
                        <div class="form-card">
                            <div class="row">
                                
            
                            </div> <br><br>
                            <h2 class="purple-text text-center"><strong>Enviado com sucesso!</strong></h2> <br>
                            <div class="row justify-content-center">
                                <div class="col-3"> <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Green_check.svg/2048px-Green_check.svg.png" class="fit-image"> </div>
                            </div> <br><br>
                            <div class="row justify-content-center">
                            
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</div>

  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script><script><%@include file="resources/js/cadastropaciente.js"%></script>

</body>
</html>

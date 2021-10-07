<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>perfil</title>
<link


   <link rel="stylesheet" href="<%=request.getContextPath()%>resources/css/perfilpaciente.css"/>
	<style><%@include file="resources/css/perfilpaciente.css"%></style>
	<script><%@include file="resources/js/perfilpaciente.js"%></script>		
	
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" />
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">


</head>
<body>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.16.0/jquery.validate.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
	<script src="script.js"></script>
	<!-- partial:index.partial.html -->
	<div class="sttngs">
		<h2>Seu perfil</h2>
		<div class="tabordion">
			<section id="section1">
				<input class="t" type="radio" name="sections" id="option1" checked>
				<label for="option1" class="trr"> Atualização conta</label>
				<article>

					<div class="frm">

						<div id='profile-upload'>
							<div class="hvr-profile-img">


								<input type="file" name="logo" id='getval' class="upload"
									id="imag">

								<div class="icon">
									<div class="camera4">
										<span></span>
									</div>
								</div>
							</div>

						</div>



						<div class="tr">
							<form action="">

								<label class="label" for="input">Nome de usuário </label> <input
									class="input" type="text" id="input" required
									pattern="^[a-zA-Z]{3,25}$"
									title="Indique seu nome completo sem números e sem espaços">

								<label class="label" for="input">Email</label> <input
									class="input" type="email" id="input"
									pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"
									title="O email teve conter um @" required> <label
									class="label" for="input">Senha</label> <input class="input"
									type="password" id="myPassword"
									pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
									title="Deve conter pelo menos um número e uma letra maiúscula e minúscula e pelo menos 8 ou mais caracteres"
									required> <label class="label" for="input">Confirmação
									da senha</label> <input class="input" type="password"
									id="confirm_password" required>


								<!-- Button trigger modal -->
								<button type="button" id="botao" class="button"
									data-toggle="modal" data-target="#exampleModal">
									Salvar</button>

								<!-- Modal -->
								<div class="modal fade" id="exampleModal" tabindex="-1"
									role="dialog" aria-labelledby="exampleModalLabel"
									aria-hidden="true">
									<div class="modal-dialog" role="document">
										<div class="modal-content">
											<div class="modal-header">
												<h5 class="modal-title" id="exampleModalLabel">Confirmação
													de atualização da conta</h5>
												<button type="button" class="close" data-dismiss="modal"
													aria-label="Close">
													<span aria-hidden="true">&times;</span>
												</button>
											</div>
											<div class="modal-body">Sua atualização está prestes a
												ser concluid. Suas informações estão certas?</div>
											<div class="modal-footer">
												<button type="button" class="btn btn-secondary"
													data-dismiss="modal">Fechar</button>
												<button type="submit" class="btn btn-primary">Salvar
													informações</button>
											</div>
										</div>
									</div>
								</div>
						</div>
						</form>
				</article>
			</section>

			<section id="section2">

				<input class="t" type="radio" name="sections" id="option2">

				<label for="option2" class="trr"> Informações Pessoais</label>
				<article>
					<form action="">
						<div class="tr wwq">
							<label class="label" for="input">Nome Completo</label> <input
								class="input e" type="text" id="input"
								requiredpattern="^[a-zA-Z\u00C0-\u017F´]+\s+[a-zA-Z\u00C0-\u017F´]{0,}$"
								title="Indique seu nome completo sem números" required>

							<label class="label" for="input">Data de Nacimento</label> <input
								class="input e" type="date" id="input" required
								pattern="[0-9]{2}-[0-9]{2}-[0-9]{4}"
								title="Entre com uma data válida"> <label class="label"
								for="input">CPF</label> <input class="input e" type="text"
								id="input" required pattern="\d{3}\.\d{3}\.\d{3}-\d{2}"
								title="Digite um CPF no formato: xxx.xxx.xxx-xx"> <label
								class="label" for="input">Telefone</label> <input
								class="input e" type="tel" id="input"
								pattern="\([0-9]{2}\) [0-9]{4,6}-[0-9]{3,4}$"
								title="Digite um telefone no formato (00) 00000-0000 " required>

							<label class="label" for="input">CEP</label> <input
								class="input e" type="text" id="input" required
								pattern="\d{5}-?\d{3}"
								title="Digite um CEP  no formato 00000-000"> <label
								class="label" for="input">Número</label> <input class="input e"
								type="number" id="input" required pattern="[0-9]+$"
								title="Informe um número sem letras"> <label
								class="label" for="input">Complemento</label> <input
								class="input e" type="text" id="input" required
								pattern="[a-z\s]+$" title="Informe um complemento sem números">

							<!-- Button trigger modal -->
							<button type="button" id="botao" class="button"
								data-toggle="modal" data-target="#exampleModal">Salvar
							</button>

							<!-- Modal -->
							<div class="modal fade" id="exampleModal" tabindex="-1"
								role="dialog" aria-labelledby="exampleModalLabel"
								aria-hidden="true">
								<div class="modal-dialog" role="document">
									<div class="modal-content">
										<div class="modal-header">
											<h5 class="modal-title" id="exampleModalLabel">Confirmação
												de atualização da conta</h5>
											<button type="button" class="close" data-dismiss="modal"
												aria-label="Close">
												<span aria-hidden="true">&times;</span>
											</button>
										</div>
										<div class="modal-body">Sua atualização está prestes a
											ser concluid. Suas informações estão certas?</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-secondary"
												data-dismiss="modal">Fechar</button>
											<button type="submit" class="btn btn-primary">Salvar
												informações</button>
										</div>
									</div>
								</div>
							</div>


						</div>
					</form>

				</article>
			</section>

			<section id="section3">
				<input class="t" type="radio" name="sections" id="option3">
				<label for="option3" class="trr">Meus planos</label>
				<article>

					<div class="tr wwq">
						<label class="label" for="input"></label> <input class="input e"
							type="password" id="input"> <label class="label"
							for="input"></label> <input class="input e" type="password"
							id="input"> <label class="label" for="input"></label> <input
							class="input e" type="password" id="input">


					</div>

				</article>
			</section>
			<section id="section4">
				<input class="t" type="radio" name="sections" id="option4">
				<label for="option4" class="trr">Minhas dietas</label>
				<article></article>
			</section>

			<section id="section5">
				<input class="t" type="radio" name="sections" id="option5">
				<label for="option5" class="trr">Minhas Consultas</label>
				<article></article>
			</section>
		</div>


	</div>

</body>
</html>

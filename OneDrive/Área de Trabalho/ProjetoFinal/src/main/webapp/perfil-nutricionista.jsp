<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <link rel="stylesheet" href="<%=request.getContextPath()%>resourcers/css/perfilnutricionista.css"/>
	<style><%@include file="resources/css/perfilnutricionista.css"%></style>
	
    
    <title>Nutricionista</title>
</head>
<body>

<!-- partial:index.partial.html -->
<div class="sttngs">
    <h2>Seu perfil</h2>
<div class="tabordion">
  <section id="section1">
    <input class="t" type="radio" name="sections" id="option1" checked>
    <label for="option1" class="trr"> Informações Pessoais</label>
    <article>
  
<div class="frm">     
        
<div id='profile-upload'>
<div class="hvr-profile-img">
  
  
  <input type="file" name="logo" id='getval'  class="upload"  id="imag">
    
  <div class="icon">
  <div class="camera4"><span></span></div>
  
  </div>
  </div>
  </div>
  
  <div class="tr">

    <label class="label" for="input">Nome </label>	
	  <input class="input e" type="text" id="input">
  
    <label class="label" for="input">CNPJ</label>	
	  <input class="input e" type="tel" id="input">

    <label class="label" for="input">Descrição</label>	
    <textarea id="story" name="story"
    rows="5" cols="33">
    </textarea>
     
    <button>Salvar</button>
      
  </div>
  </article>
  </section>

  <section id="section2">

    <input class="t" type="radio" name="sections" id="option2"> 
    <label for="option2" class="trr"> Atualização conta  </label>

    <article>
    <div class="tr wwq">
        
      <label class="label" for="input">Nome de usuário</label>
      <input class="input" type="text" id="input">
      
      <label class="label" for="input">Email</label>
      <input class="input" type="email" id="input">
        
      <label class="label" for="input">Senha</label>
      <input class="input" type="password" id="input">
        
      <label class="label" for="input">Confirmação da senha</label>
      <input class="input" type="password" id="input">
        
    </div>
      <button>Salvar</button>
    </article>
    </section>

  <section id="section2">

    <input class="t" type="radio" name="sections" id="option2">
    
  </article>
  </section>
  <section id="section3">
    <input class="t" type="radio" name="sections" id="option3">
    <label for="option3" class="trr">Consultas</label>
    <article> 
       
<table id="customers">
    <tr>
      <div id="divBusca">
        <input type="text" id="txtBusca" placeholder="Buscar..."/>
        <button id="btnBusca">buscar</button>
      </div>
    </tr>
    <br>

    <tr></tr>
      <th>Nome    </th>
      <th>Data    </th>
      <th> Hora</th>
      <th>Paciente</th>

    </tr>

    <tr>
      <td>Bernardo </td>
      <td>10/1/21</td>
      <td>10:30</td>
    </tr>

      <td>Berglunds </td>
      <td>10/1/21</td>
      <td>11:00</td>
  </table>
      
  </article>
  </section>
    
  <section id="section4">
    <input class="t" type="radio" name="sections" id="option4">
    <label for="option4" class="trr">Cardápio</label>
    <article>

     
  </article>
  </section>
  </div>
  </div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<!-- partial -->
  <script  src="./script.js"></script>

</body>
</html>
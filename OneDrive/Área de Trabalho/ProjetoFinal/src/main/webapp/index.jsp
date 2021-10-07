<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css'>
    <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css'>  
    <link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Handlee|Josefin+Sans:300,600&amp;display=swap'><link rel="stylesheet" href="./style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
   
   <link rel="stylesheet" href="<%=request.getContextPath()%>resources/css/newhome.css"/>
	<style><%@include file="resources/css/newhome.css"%></style>
	<script><%@include file="resources/js/newhome.js"%></script>	
		
</head>
<body>

<!-- partial:index.partial.html -->
<div class="sttngs">
<div class="tabordion">
  <section id="section1">
    <input class="t" type="radio" name="sections" id="option1" checked>
    <label for="option1" class="trr"> Home</label>
    <article>
  
      <img src="logo.jpg" alt="some text" 
      width=300 height=300>

      <div class= "card-title1"> 
        <p1> Health Society </p1>
      </div>
      <div class = "card-title2"><p3> Para uma vida mais saudável </p3></div>
        <div class="card-text1">
         

          <div class="background">
            <div class="whole-menu">
              
              <div class="items filled-items">
                <h3>Você acredita que não consegue emagrecer porque não tem foco?</h3>
                <h4> Nós da Health Society, temos o objetivo de ajudar pessoas que buscam melhorar a sua saúde através de uma alimentação saudável.
                  Afinal o conceito de nutrição se baseia em uma alimentação completa e variada, de forma que atenda às necessidades do organismo. 
                  Trabalhando também com os guias alimentares que são opções práticas quando pensamos numa alimentação com qualidade, 
                  uma vez que fornece um conjunto de informações, recomendações e orientações sobre escolhas, preparo e consumo de alimentos.</h4>
              </div>
          

  
 
  </article>
  </section>

  <section id="section2">

    <input class="t" type="radio" name="sections" id="option2"> 
    <label for="option2" class="trr"> Planos  </label>

    
   
 

<article>

  <div id="planos">
    <div class="planos">
      <div class="card1-group">
        <div class="card1">
          <img src="card2.jpg" class="card1-img-top" alt="..." width=675 height=450>
          <div class="card1-body" >
            <h5 class="card-title3">Emagrecimento Eficiente</h5>
            <p class="card-text2">
              Muitos acreditam em uma dieta universal, única para todos ou ainda apostam em dietas milagrosas, 
              sem perceber que o que realmente conta, é a individualidade de cada indivíduo, 
              com suas preferências, estilo de vida, intolerâncias e necessidades específicas. Então, 
              antes de qualquer leitura, reflita sobre uma coisa: não existe uma dieta estática e universal. 
              Existem estratégias diferentes, para objetivos diferentes, segundo a 
              necessidade e individualidade de cada ser humano. E é assim, que o emagrecimento eficiente acontece.
              </p>
            <a href="#Contato" class="btn btn-primary1" >Entre em contato</a>
          </div>
        </div>
        <div class="card2" id="teste">
          <img src="card1.jpg" class="card2-img-top" alt="..." width=675 height= 450>
          <div class="card1-body">
            <h5 class="card-title4">Reeducação Alimentar</h5>
            <p class="card-text3">
              A reeducação alimentar é um processo de mudança de hábitos na alimentação. Ela consiste em doutrinar a pessoa
              a aprender a comer bem, de maneira saudável, mas sem necessariamente precisar se privar de comer alguns alimentos 
              que goste. É através de pequenas mudanças que a reeducação vai se constituindo e, aos poucos, tornando a alimentação 
              do indivíduo mais saudável e equilibrada. A reeducação alimentar é feita de forma personalizada e, para isso, 
              devem ser consultados especialistas antes de qualquer decisão. Cada pessoa apresenta suas especificidades e, 
              por isso, o processo é feito com base nos nutrientes que cada pessoa precisa.</p>
            <a href="#" class="btn btn-primary2">Entre em contato</a>
          </div>
        </div>
        <div class="card3">
          <img src="card3.jpeg" class="card3-img-top" alt="..." width=675 height=450>
          <div class="card-body">
            <h5 class="card-title5"> Dietas esportiva </h5>
            <p class="card-text4">Se você é um fisiculturista, um atleta profissional ou simplesmente exercendo esportes, musculação, corrida, 
              ciclismo etc para melhorar sua saúde, a nutrição esportiva desempenha um papel fundamental na 
              otimização dos efeitos benéficos da atividade física. Tomar melhores decisões com sua nutrição e hidratação pode 
              resultar em melhor desempenho, recuperação e prevenção de lesões. Profissionais de nutrição oferecem 
              uma gama de serviços para apoiar a sua saúde e metas esportivas. Isso pode variar de um cardápio alimentar 
              diário, a um plano abrangente de alimentação e nutrição para treinamento e competições que se realização a curto e médio prazo.</p>
            <a href="#" class="btn btn-primary3">Entre em contato</a>
          </div>
        </div>
      </div>  
          </div>
        </div>
      </section>

      </article>
  

  <section id="section3">

    <input class="t" type="radio" name="sections" id="option2">
    
  </article>
  </section>


  
  <section id="section3">
    <input class="t" type="radio" name="sections" id="option3">
    <label for="option3" class="trr">Contato</label>
    <article> 
 
     
      
  </article>
  </section>
    
  <section id="section4">
    <input class="t" type="radio" name="sections" id="option4">
    <label for="option4" class="trr">Login</label>
    <article>

      <div class="container">
        <div class="card-wrap">
          <div class="card border-0 shadow card--welcome is-show" id="welcome">
            <div class="card-body">
              <h2 class="card-title">Bem-vindo(a)</h2>
              <p>Escolha a melhor opção que se encaixa à você</p>
              <br>
              <div class="btn-wrap"><a class="btn btn-lg btn-register js-btn" data-target="register">CLÍNICA</a><a class="btn btn-lg btn-login js-btn" data-target="login">PACIENTE</a></div>
            </div>
          </div>
          <div class="card border-0 shadow card--register" id="register">
            <div class="card-body">
              <br>
              <h2 class="card-title">CLÍNICA</h2>
              <br>
              <p class="card-text">Para se manter conectado conosco<br/>por favor, faça login</p>
              <br>
              <form>
               
                <div class="form-group">
                  <input class="form-control" type="CNPJ" placeholder="CNPJ" pattern="[0-9]{2}\.?[0-9]{3}\.?[0-9]{3}\/?[0-9]{4}\-?[0-9]{2}" title="Informe um CNPJ nesse formato  XX. XXX. XXX/XXXX-XX." required="required"/>
                </div>
                <div class="form-group">
                  <input class="form-control" type="password" placeholder="Senha" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Deve conter pelo menos um número e uma letra maiúscula e minúscula e pelo menos 8 ou mais caracteres" required="required"/>
                </div>
                <p> Não tem nenhuma conta?
                      
            <a href="<%=request.getContextPath()%>/mostrarCadastroNutricionista" target="_self">Cadastre-se</a>
      
              </p>
              <br>
                <button class="btn-btn-lg">Entrar</button>
              </form>
            </div>
            <button class="btn btn-back js-btn" data-target="welcome"><i class="fas fa-angle-left"></i></button>
          </div>
          <div class="card border-0 shadow card--login" id="login">
            <div class="card-body">
              <h2 class="card-title">PACIENTE</h2>
              <br>
              <p>Para se manter conectado conosco<br/>por favor, faça login</p>
             <br>
              <form>
                <div class="form-group">
                  <input class="form-control" type="Email" placeholder="Email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" title="O email teve conter um @" required="required"/>
                </div>
                <div class="form-group">
                  <input class="form-control" type="password" placeholder="Senha" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Deve conter pelo menos um número e uma letra maiúscula e minúscula e pelo menos 8 ou mais caracteres"required="required"/>
                </div>
                <p> Não tem nenhuma conta?
                       
  	  <a href="<%=request.getContextPath()%>/mostrarCadastroPaciente" target="_self">Cadastre-se</a> 
         
              </p>
              <br>
              <a href='../homepaci/dist/index.html' ><button class="btn-btn-lg"  >Entrar </button> </a>
              </form>
            </div>
            <button class="btn btn-back js-btn" data-target="welcome"><i class="fas fa-angle-left"></i></button>
          </div>
        </div>
      </div>

  </article>
  </section>
  </div>
  </div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<!-- partial -->
  <script  src="./script.js"></script>

</body>
</html>
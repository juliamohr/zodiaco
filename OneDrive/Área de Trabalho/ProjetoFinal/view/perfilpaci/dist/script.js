$("document").ready(function () {

    var textmax=500;
   
    $("#count").text(textmax + ' character left');
    
    $("#bio").keyup(function(){
        
        var userlenght= $("#bio").val().length;
        
        var remain= textmax - userlenght ;

        $("#count").text(remain + ' characters left');
        
    });
    
});


document.getElementById('getval').addEventListener('change', readURL, true);
function readURL(){
    var file = document.getElementById("getval").files[0];
    var reader = new FileReader();
    reader.onloadend = function(){
        document.getElementById('profile-upload').style.backgroundImage = "url(" + reader.result + ")";        
    }
    if(file){
        reader.readAsDataURL(file);
    }else{
    }
}



$(function () {
  var $text = $('#texte');
  var $input = $('.texte');
  $input.on('keydown', function () {
    setTimeout(function () {
      $text.html($input.val());
    }, 0);
  });
})

var password = document.getElementById("password")
   , confirm_password = document.getElementById("confirm_password");
 
 function validatePassword(){
   if(password.value != confirm_password.value) {
     confirm_password.setCustomValidity("Senhas diferentes!");
   } else {
     confirm_password.setCustomValidity('');
   }
 }
 
 password.onchange = validatePassword;
 confirm_password.onkeyup = validatePassword;

 //valida telefone
function ValidaTelefone(tel){
  exp = /\(\d{2}\)\ \d{4}\-\d{4}/
  if(!exp.test(tel.value))
          alert('Numero de Telefone Invalido!');
}

//valida CEP
function ValidaCep(cep){
  exp = /\d{2}\.\d{3}\-\d{3}/
  if(!exp.test(cep.value))
          alert('Numero de Cep Invalido!');               
}

//valida data
function ValidaData(data){
  exp = /\d{2}\/\d{2}\/\d{4}/
  if(!exp.test(data.value))
          alert('Data Invalida!');                        
}

//valida o CPF digitado
function ValidarCPF(Objcpf){
  var cpf = Objcpf.value;
  exp = /\.|\-/g
  cpf = cpf.toString().replace( exp, "" ); 
  var digitoDigitado = eval(cpf.charAt(9)+cpf.charAt(10));
  var soma1=0, soma2=0;
  var vlr =11;

  for(i=0;i<9;i++){
          soma1+=eval(cpf.charAt(i)*(vlr-1));
          soma2+=eval(cpf.charAt(i)*vlr);
          vlr--;
  }       
  soma1 = (((soma1*10)%11)==10 ? 0:((soma1*10)%11));
  soma2=(((soma2+(2*soma1))*10)%11);

  var digitoGerado=(soma1*10)+soma2;
  if(digitoGerado!=digitoDigitado)        
          alert('CPF Invalido!');         
}

//valida o CNPJ digitado
function ValidarCNPJ(cnpj){
  cnpj = cnpj.value.replace(/[^\d]+/g,'');

if(cnpj == '') return false;

if (cnpj.length < 14){
   alert('CNPJ não digitado corretamente ou faltando informação! Digite a forma correta Ex. 66.075.246/0001-30');
  return false;
}

// Elimina CNPJs invalidos conhecidos
if (cnpj == "00000000000000" || 
  cnpj == "11111111111111" || 
  cnpj == "22222222222222" || 
  cnpj == "33333333333333" || 
  cnpj == "44444444444444" || 
  cnpj == "55555555555555" || 
  cnpj == "66666666666666" || 
  cnpj == "77777777777777" || 
  cnpj == "88888888888888" || 
  cnpj == "99999999999999")
  return false;
   
// Valida DVs
tamanho = cnpj.length - 2
numeros = cnpj.substring(0,tamanho);
digitos = cnpj.substring(tamanho);
soma = 0;
pos = tamanho - 7;
for (i = tamanho; i >= 1; i--) {
soma += numeros.charAt(tamanho - i) * pos--;
if (pos < 2)
      pos = 9;
}
resultado = soma % 11 < 2 ? 0 : 11 - soma % 11;
if (resultado != digitos.charAt(0))
  return false;
   
tamanho = tamanho + 1;
numeros = cnpj.substring(0,tamanho);
soma = 0;
pos = tamanho - 7;
for (i = tamanho; i >= 1; i--) {
soma += numeros.charAt(tamanho - i) * pos--;
if (pos < 2)
      pos = 9;
}
resultado = soma % 11 < 2 ? 0 : 11 - soma % 11;
if (resultado != digitos.charAt(1)){
   alert('CNPJ Inválido! Digite a forma correta Ex. 66.075.246/0001-30');
   return false
}
return true;
         

}
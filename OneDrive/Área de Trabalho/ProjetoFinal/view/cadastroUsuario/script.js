function validateEmail(email) {
  var re = /\S+@\S+\.\S+/;
  return re.test(email);
}
    
console.log(validateEmail('texto@texto.com')); // true
console.log(validateEmail('texto@texto')); // false
console.log(validateEmail('texto.com')); // false
console.log(validateEmail('texto')); // false


   var myPassword = document.getElementById("myPassword")
   , confirm_password = document.getElementById("confirm_password");
 
 function validatemyPassword(){
   if(myPassword.value != confirm_password.value) {
     confirm_password.setCustomValidity("Senhas diferentes!");
   } else {
     confirm_password.setCustomValidity('');
   }
 }
 
 myPassword.onchange = validatemyPassword;
 confirm_password.onkeyup = validatemyPassword;


 $("#submit").on("click", function() {
  if ($("#form-login").valid()) { //Verifica se o formulário está válido.
    $('#myModal').modal('show'); //Se for válido, exibe o modal.
  }
});
$('#myModal').on('shown.bs.modal', function () {
  $('#meuInput').trigger('focus')
})

$('#myForm').on('submit', function(e) {
  var email = $('#email');
 

  // Check if there is an entered value
  if(!email.val()) {
    // Add errors highlight
    email.closest('.form-group').removeClass('has-success').addClass('has-error');

    // Stop submission of the form
    e.preventDefault();
  } else {
    // Remove the errors highlight
    email.closest('.form-group').removeClass('has-error').addClass('has-success');
  }
});
$('#myForm').on('submit', function(e) {
  var password = $('#password');
 

  // Check if there is an entered value
  if(!password.val()) {
    // Add errors highlight
    password.closest('.form-group').removeClass('has-success').addClass('has-error');

    // Stop submission of the form
    e.preventDefault();
  } else {
    // Remove the errors highlight
    password.closest('.form-group').removeClass('has-error').addClass('has-success');
  }
});
function mouseoverPass(obj) {
  var obj = document.getElementById('myPassword');
  obj.type = "text";
}
function mouseoutPass(obj) {
  var obj = document.getElementById('myPassword');
  obj.type = "password";
}


var cpf = document.querySelector("#cpf");

cpf.addEventListener("keyup", () => {
  let value = cpf.value.replace(/[^0-9]/g, "").replace(/^([\d]{3})([\d]{3})?([\d]{3})?([\d]{2})?/, "$1.$2.$3-$4");
  
  cpf.value = value;
});
function validateEmail(email) {
 var re = /\S+@\S+\.\S+/;
 return re.test(email);
}
    
console.log(validateEmail('texto@texto.com')); // true
console.log(validateEmail('texto@texto')); // false
console.log(validateEmail('texto.com')); // false
console.log(validateEmail('texto')); // false

$('#myModal').on('shown.bs.modal', function () {
  $('#meuInput').trigger('focus')
})

var myPassword = document.getElementById("myPassword")
, confirm_password = document.getElementById("confirm_password");

function validatemyPassword(){
if(myPassword.value != confirm_password.value) {
  confirm_password.setCustomValidity("Senhas diferentes!");
} else {
  confirm_password.setCustomValidity('');
}}

myPassword.onchange = validatemyPassword;
confirm_password.onkeyup = validatemyPassword;

password.onchange = validatePassword;  
confirm_password.onkeyup = validatePassword;

function mask(o, f) {
 setTimeout(function() {
  var v = mphone(o.value);
  if (v != o.value) {
    o.value = v;
}
}, 1);
}

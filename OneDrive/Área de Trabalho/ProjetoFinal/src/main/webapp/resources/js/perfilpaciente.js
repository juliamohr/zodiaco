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
}
}

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

function mphone(v) {
  var r = v.replace(/\D/g, "");
  r = r.replace(/^0/, "");
  if (r.length > 10) {
    r = r.replace(/^(\d\d)(\d{5})(\d{4}).*/, "($1) $2-$3");
  } else if (r.length > 5) {
    r = r.replace(/^(\d\d)(\d{4})(\d{0,4}).*/, "($1) $2-$3");
  } else if (r.length > 2) {
    r = r.replace(/^(\d\d)(\d{0,5})/, "($1) $2");
  } else {
    r = r.replace(/^(\d*)/, "($1");
  }
  return r;
}
document.getElementById('cep').addEventListener('input', function (e) {
  var x = e.target.value.replace(/\D/g, '').match(/(\d{5})(\d{3}))/);
  e.target.value =  (x[5] ? '-' + x[3] : '');
});
var peso = document.querySelector("#peso");

peso.addEventListener("keyup", () => {
  let value = peso.value.replace(/[^0-9]/g, "").replace(/^(\d{1,})(\d{3})$/, "$1.$2");
  
  peso.value = value;
});
    

    

var altura = document.getElementbyId("altura");
    if(altura > 0 && altura <= 3.0) 
    console.log("A sua altura está incorreta");
 

var cintura = document.getElementbyId("cintura");
    if (cintura >= 0 && cintura <= 102)
    console.log("A sua cintura está incorreta");

    
var quadril = document.getElementbyId("quadril");
    if (quadril >= 0 && quadril <= 1)
    console.log("O seu quadril está incorreto");


var busto = document.getElementbyId("busto");
    if (busto >= 0 && busto <= 200)
    console.log("O seu busto está incorreto");


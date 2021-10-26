var zodiac = [
	{
		sign: "aquario",
		fortune: "Energético, sábio, criativo",
		fortune2:"Insensível e sem emoção",
		
	},
	{
		sign: "peixes",
		fortune: "Imaginação, confiável, compassivo",
		fortune2:"Pessimista e excessivamente emocional",
		
	},
	{
		sign: "aries",
		fortune: "Apaixonado, Positivo, Corajoso",
		fortune2:"Teimoso, arrogante",
	
	},
	{
		sign: "touro",
		fortune: "Confiável, generoso, independente",
		fortune2:"Materialista, Preguiçoso",
	
	},
	{
		sign: "gêmeos",
		fortune: "Intelectual, Bem humorado, Entusiasmado",
		fortune2: "Inconsistente, Hesitante, Ansioso",
		
	},
	{
		sign: "câncer",
		fortune: "Amoroso, Fiel, Criativo",
		fortune2:"Superemocional, pegajoso, temperamental",
	
	},
	{
		sign: "leão",
		fortune: "Otimista, gentil, leal",
		fortune2:"Dominador, arrogante, teimoso",
		
	},
	{
		sign: "virgem",
		fortune: "Analítico, Modesto, Inteligente",
		fortune2:"Conservador e exigente",
		
	},
	{
		sign: "libra",
		fortune: " Honesto, Charmoso, Diplomático",
		fortune2:"Raso, não confiável, teimoso",
		
	},
	{
		sign: "escorpião",
		fortune: "Amigável, fiel, determinado",
		fortune2:"Manipulativo e Desconfiado",
		
	},
	{
		sign: "sagitário",
		fortune: "Aventureiro, independente, sincero",
		fortune2:"Estúpido e impaciente",

	},
	{
		sign: "capricornio",
		fortune: "Disciplina, confiável, determinado",
		fortune2:"Egoísta e sem emoção",
	
	}
]
function horoscope() {
	// if input =sign
	var sign = document.getElementById("sign").value


document.getElementById('sign').value = "";
	

	for(i = 0; i < zodiac.length; i++) {
		// if sign entered = one of the arrays .stop
		if(sign === zodiac[i].sign) {
			document.getElementById("yourSign").innerHTML = zodiac[i].sign
			
			document.getElementById("força").innerHTML = "<span>força:</span>: " + zodiac[i].fortune
			document.getElementById("fraqueza").innerHTML = "<span>fraqueza:</span> " + zodiac[i].fortune2
			document.getElementById("compat").innerHTML= result;

			return
		} else {
			document.getElementById("yourSign").innerHTML = "That's not sign . Try again!"
			document.getElementById("força").innerHTML = ""
			document.getElementById('fraqueza').innerHTML=""
			document.getElementById("icon").src = ""
			document.getElementById("compat").innerHTML=""
		}
	}
}
var currentPhase, nextPhase, previousPhase;
var left, opacity, scale;
var isAnimating; 

/**
 * Handle the next movement between phases
 */
$(".next").click(function()  {


	
	currentPhase = $(this).parent();
	nextPhase = $(this).parent().next();

  if(checkNextPhase(nextPhase.attr('id')))
  {
    
    if(isAnimating) return false;
	  isAnimating = true;
//show the next fieldset
	nextPhase.show(); 
	//hide the current fieldset with style
	currentPhase.animate({opacity: 0}, {
		step: (now, mx) => {
			//as the opacity of currentPhase reduces to 0 - stored in "now"
			//1. scale currentPhase down to 80%
			scale = 1 - (1 - now) * 0.2;
			//2. bring nextPhase from the right(50%)
			left = (now * 50)+"%";
			//3. increase opacity of nextPhase to 1 as it moves in
			opacity = 1 - now;
			currentPhase.css({
        'transform': 'scale('+scale+')',
        'position': 'absolute'
      });
			nextPhase.css({'left': left, 'opacity': opacity});
		}, 
		duration: 800, 
		complete: function() {
			currentPhase.hide();
			isAnimating = false;
		}, 
		//this comes from the custom easing plugin
		easing: 'easeInOutBack'
	});
  }
});

/**
 * Handle the back movement between phases
 */
$(".previous").click(function()  {
	if(isAnimating) return false;
	isAnimating = true;
	
	currentPhase = $(this).parent();
	previousPhase = $(this).parent().prev();
	
	//show the previous fieldset
	previousPhase.show(); 
	//hide the current fieldset with style
	currentPhase.animate({opacity: 0}, {
		step: (now, mx) => {
			//as the opacity of currentPhase reduces to 0 - stored in "now"
			//1. scale previousPhase from 80% to 100%
			scale = 0.8 + (1 - now) * 0.2;
			//2. take currentPhase to the right(50%) - from 0%
			left = ((1-now) * 50)+"%";
			//3. increase opacity of previousPhase to 1 as it moves in
			opacity = 1 - now;
			currentPhase.css({'left': left});
			previousPhase.css({'transform': 'scale('+scale+')', 'opacity': opacity});
		}, 
		duration: 800, 
		complete: function()  {
			currentPhase.hide();
			isAnimating = false;
		}, 
		//this comes from the custom easing plugin
		easing: 'easeInOutBack'
	});
});

/**
 * Verifies if this is the last phase, so it can change the labels of options
 */
function checkNextPhase(nextPhaseId)
{
    let opt1 = document.getElementById('opt1');
    let opt2 = document.getElementById('opt2');
  
    if(nextPhaseId == "phase2")
    {
      let name = document.getElementById('name').value;      
      let age = document.getElementById('age').value;
      
      if((name == '') || (age == ''))
      {
         swal(
          'Atenção',
          'Nome e idade devem ser preenchidos',
          'warning'
          )
        
          return false;
      }

    }

    if(nextPhaseId === "phase3")
    {
        let area = checkArea();

        if (area === "Exatas") {
            opt1.innerText = "Matemática";
            opt2.innerText = "Fisíca";
        }
        else if (area === "Humanas")
        {
            opt1.innerText = "Letras";
            opt2.innerText = "História";
        }
        else
        {
            opt1.innerText = "Biologia";
            opt2.innerText = "Medicina";
        }
    }
  
    return true;
}

/**
 * Handle the submit button click, preventing from a form submit
 */
$(".submit").click(function()  {

    let dataObj = {
        'name': '',
        'age': 0,
        'area': '',
        'course': ''
    }

    retrieveDataFromFields(dataObj);
    sendData(dataObj);

    return false;
});

/**
 * Checks the area selected acessing the element
 */
function checkArea()
{
    if (document.getElementById('radioExatas').checked) {
        return 'Exatas';
    }
    else if (document.getElementById('radioHumanas').checked)
    {
        return 'Humanas';
    }
    else
    {
        return 'Biologicas';
    }
}

/**
 * Checks the course selected accessing the element
 */
function checkCourse()
{
    if (document.getElementById('radioOpt1').checked) {
        return document.getElementById('opt1').innerText;
    }
    else
    {
        return document.getElementById('opt2').innerText;
    }
}

/**
 * Gets all the info provided at the quiz
 */
function retrieveDataFromFields(dataObj)
{
    dataObj.name = document.getElementById('name').value;
    dataObj.age = document.getElementById('age').value;
    dataObj.area = checkArea();
    dataObj.course = checkCourse();
}

/**
 * Sends the data collected at the quiz
 */
function sendData(dataObj)
{
    console.dir(dataObj);

    $.ajax({
        type: "POST",
        url: '/quiz',
        data: dataObj,
        success: (data) =>{
            console.log('Data sent! :P'); //Will never happen
        },
        error: (data) => {
            swal(
                'Oops...',
                'Nada foi enviado, mas aqui estão os dados:  ' + JSON.stringify(dataObj),
                'error'
            )
        }
    });    
}
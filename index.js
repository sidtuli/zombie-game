$(document).ready(function(){
  
  
  var buttons = ["#choice1", "#choice2", "#choice3", "#choice4"];
  
  var loadButtons = function(optionArray) {
    $("button").hide();
    for(var i = 0; i < optionArray.length; i++) {
      $(buttons[i]).text(optionArray[i].choiceText);
      $(buttons[i]).show();
    }
  }
  
  $.getJSON("zombie.json", function(data) {
    var place = 1, prev="";
    $("#gameText").text(data.sequences[place].storyText);
    loadButtons(data.sequences[place].options);
    $("#game").click(function(event){
      if($(event.target).is(buttons[0])) {
	prev = data.sequences[place].options[0].resultText;
	place = data.sequences[place].options[0].resultPlacement;
      }
      else if($(event.target).is(buttons[1])) {
	prev = data.sequences[place].options[1].resultText;
	place = data.sequences[place].options[1].resultPlacement;
      }
      else if($(event.target).is(buttons[2])) {
	prev = data.sequences[place].options[2].resultText;
	place = data.sequences[place].options[2].resultPlacement;
      } else {
	prev = data.sequences[place].options[3].resultText;
	place = data.sequences[place].options[3].resultPlacement;
      }
      $("#gameText").text(prev+" "+data.sequences[place].storyText);
      loadButtons(data.sequences[place].options);
    });
    /* Trying to discover a way to allow somebody to use their keyboard to select buttons 
    $("#game").keydown(function(event) {
      if(event.which === 49) {
	prev = data.sequences[place].options[0].resultText;
	place = data.sequences[place].options[0].resultPlacement;
      }
      else if(event.which === 50) {
	prev = data.sequences[place].options[1].resultText;
	place = data.sequences[place].options[1].resultPlacement;
      }
      else if(event.which === 51) {
	prev = data.sequences[place].options[2].resultText;
	place = data.sequences[place].options[2].resultPlacement;
      }
      else if(event.which === 52) {
	prev = data.sequences[place].options[3].resultText;
	place = data.sequences[place].options[3].resultPlacement;
      }
      $("#gameText").text(prev+data.sequences[place].storyText);
      loadButtons(data.sequences[place].options);
    });*/
    
    
  });
});
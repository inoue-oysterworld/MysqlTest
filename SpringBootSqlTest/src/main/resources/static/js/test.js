$(function() {
  $(".top-wrapper").click(function(){
	  $(this).animate({"marginTop": "30%"},10000);
  });

  $(".container").click(function(){
	  $(this).slideUp(20000);
	  $(this).fadeOut(20000);
  });



});
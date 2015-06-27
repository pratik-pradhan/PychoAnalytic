jQuery(document).ready(function($) {

	$('#msg').html("This is updated by jQuery")
	//alert("hi");
    $("#accordion").accordion();

});

$(document).on('click', 'h3', function () {
    alert(this.id);
});
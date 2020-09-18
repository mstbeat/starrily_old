/**
 * 
 */

jQuery(function($) {

	$('#form').submit(function(){
		dt = new Date($('#date').val());
		var y = dt.getFullYear();
		var m = dt.getMonth()
		var d = dt.getDate();
		dt.setMonth(dt.getMonth() - 1);
		if (dt.getFullYear()==y && dt.getMonth()==m-1 && dt.getDate()==d) {
			$("#message").text("正常です！");
			var message = "正常です"
				$.ajax({
			        type        : "PUT",
			        url         : '/skillsheet_information_update',
			        data 		: { 'message':message } 
			    });
		} else {
			$("#message").text("エラーです！");
			var message = "エラーです"
			$.ajax({
		        type        : "PUT",
		        url         : '/skillsheet_information_update',
		        data 		: { 'message':message } 
		    });
		}
	});
// function validateDate(date){
// dt = new Date(date);
// var y = dt.getFullYear();
// var m = dt.getMonth()
// var d = dt.getDate();
// dt.setMonth(dt.getMonth() - 1);
// return(dt.getFullYear()==y && dt.getMonth()==m-1 && dt.getDate()==d);
// $.post( 'http://localhost:8080/skillsheet_information_update', 'message=エラー'
// )
// }
});
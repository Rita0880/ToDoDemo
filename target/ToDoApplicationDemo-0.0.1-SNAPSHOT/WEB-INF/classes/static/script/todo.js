function showToDoForm(){
	$("#toDo_div").show();
}

function deleteTask(id , index){
	
	$.ajax({
        url: "/deleteToDo",
        type: "POST",
        dataType : 'json',
        contentType : "application/json",
        data: JSON.stringify({'task_id' : id}),
        success: function(response) 
        {
            console.log("sucess!");
            $("#tr_"+index).remove();
        },
        error: function(e){
            console.log("ERROR: ", e);
        }
    });
}

function showDeleteButton(id){
	
	if ($("#checkbox_"+id).is(':checked')) {
		$("#del_button_"+id).show();
		} else {
			$("#del_button_"+id).hide();
		}
	
	
}


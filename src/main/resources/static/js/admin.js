
$('button#addd_fi').click(function(){
    var name = $('input[name="name_fi"]').val();
    var description = $('#des_fi').val();
    console.log(name+" : "+description+" : ");

    var obj = {
        "name" : name,
        "description" : description,
    }

    $.ajax({
        type : "post",
        url : "/admin/coach",
        data : JSON.stringify(obj),
        contentType : "application/json",
        success : function(response){
            $('input[name="name_fi"]').val('');
            $('#description_fi').val('');
        }
    });    
});
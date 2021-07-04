function register(data) {
    $.ajax({
        type: "POST",
        url: 'http://localhost:8080/user/register',
        data: JSON.stringify(data),
        contentType: "application/json; charset=utf-8",
        success: function(data, status) {
            console.log('data: ', data);
            console.log('status: ', status);
        }
    });
}

function login(data) {
    $.ajax({
        type: "POST",
        url: 'http://localhost:8080/login',
        data: JSON.stringify(data),
        contentType: "application/json; charset=utf-8",
        success: function(data, status) {
            console.log('data: ', data);
            conssole.log('status: ', status);
        }
    })
}
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
            localStorage.setItem('token', data.JWTToken);
            localStorage.setItem('user', data.id);
            localStorage.setItem('userType', data.userType);
        },
        error: function() {
            alert("Bad credentials!");
            window.location.reload();
        }
    })
}

function logout() {
    localStorage.clear();
}

function getLoggedUserId() {
    return localStorage.getItem('user');
}

function getLoggedUserType() {
    return localStorage.getItem('userType');
}

function getToken() {
    return localStorage.getItem('token');
}

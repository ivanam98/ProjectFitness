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
            localStorage.setItem('token', data.jwttoken);
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
    alert("You are logged out!");
    location.href = "login.html";
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

function redirectToLogin() {
    location.href = "login.html";
}

function redirectToRegister() {
    location.href = "register.html";
}

function restrict() {
    const adminPages = [
        'coaches.html', 'fitness-center.html', 'hall.html', 'halls.html', 'new-fitness-center.html', 'new-hall.html',
        'new-members-requests.html', 'register-coach.html'];

    const memberPages = ['my-workouts.html', 'done-workouts.html' ];

    const currentUrl = window.location.pathname;
    const loggedUserType = getLoggedUserType();

    adminPages.forEach(function(page) {
        if (currentUrl.includes(page) && loggedUserType != 'ADMIN') {
            alert("You don't have permission for this page!");
            location.href = 'fitness-centers.html';
        }
    })

    memberPages.forEach(function(page) {
        if (currentUrl.includes(page) && loggedUserType != 'MEMBER') {
            alert("You don't have permission for this page!");
            location.href = 'fitness-centers.html';
        }
    })
 
}
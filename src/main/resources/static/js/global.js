function generateMenuButtons() {
    const loggedUserType = getLoggedUserType();
    let menuButtons = '';
    menuButtons += '<button class="btn btn-warning" id="home-redirect" onclick="redirectToHome()">Home</button>';

    if (loggedUserType == null) {
        
    } else if (loggedUserType == 'ADMIN') {
        menuButtons += '<button class="btn btn-info ml-5" id="coaches-redirect" onclick="redirectToCoachesPage()">Coaches</button>';
        menuButtons += '<button class="btn btn-info ml-1" id="requests-redirect" onclick="redirectToNewMembersRequestsPage()">Requests</button>';
        menuButtons += '<button class="btn btn-info ml-1" id="register-coach-redirect" onclick="redirectToRegisterCoachPage()">Register Coach</button>';
    
    } else if (loggedUserType == 'MEMBER') {
        menuButtons += '<button class="btn btn-outline-warning ml-1" id="my-profile-redirect" onclick="redirectToMyProfile()">My Profile</button>';
        menuButtons += '<button class="btn btn-outline-warning ml-1" id="my-workouts-redirect" onclick="redirectToMyWorkouts()">My Workouts</button>';
        menuButtons += '<button class="btn btn-outline-warning ml-1" id="done-workouts-redirect" onclick="redirectToDoneWorkouts()">Done Workouts</button>';
    
    } else if (loggedUserType == 'COACH') {

    }

    $('#menu-buttons').append(menuButtons);
}


function generateAuthButtons() {
    const loggedUserToken = getToken();
    let authButtons = '';
    if (loggedUserToken == null) {
        authButtons += '<button class="btn btn-outline-primary" id="login-redirect" onclick="redirectToLogin()">Log In</button>';
        authButtons += '<button class="btn btn-outline-primary ml-1" id="register-redirect" onclick="redirectToRegister()">Register</button>';
    } else {
        authButtons += '<button class="btn btn-outline-danger" id="logout-btn" onclick="logout()">Log Out</button>';
    }

    $('#auth-buttons').append(authButtons);
}

function redirectToHome() {
    location.href = 'fitness-centers.html';
}

function redirectToCoachesPage() {
    location.href = 'coaches.html';
}

function redirectToDoneWorkouts() {
    location.href = 'done-workouts.html';
}

function redirectToHallsPage() {
    location.href = 'halls.html';
}

function redirectToMyWorkouts() {
    location.href = 'my-workouts.html';
}

function redirectToNewFitnessCenterForm() {
    location.href = 'new-fitness-center.html';
}

function redirectToNewHallForm() {
    location.href = 'new-hall.html';
}

function redirectToNewMembersRequestsPage() {
    location.href = 'new-members-requests.html';
}

function redirectToRegisterCoachPage() {
    location.href = 'register-coach.html';
}

function redirectToMyProfile() {
    location.href = 'my-profile.html';
}

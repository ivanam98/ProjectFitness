function deleteFitnessCenter(id) {
    $.ajax({
        type: "DELETE",
        url: 'http://localhost:8080/fitness-centar/delete/' + id,
        headers: {
            "X-Auth-T": getToken()
        },
        success: function(data, status) {
            alert('Fitness center deleted!')
            window.location.reload();
        },
        error: function() {
            alert("error!");
        },
    })
}

function createNewFitnessCenter(data) {
    $.ajax({
        type: "POST",
        url: "http://localhost:8080/fitness-centar/create",
        headers: {
            "X-Auth-T": getToken()
        },
        contentType: "application/json",
        data: JSON.stringify(data),
        success: function (data, status) {
            alert("New Fitness center created!");
            location.href = 'fitness-centers.html';
        },
        error: function() {
            alert('error!');
        }
    })
}

function updateFitnessCenter(data) {
    $.ajax({
        type: "PUT",
        url: "http://localhost:8080/fitness-centar/update",
        headers: {
            "X-Auth-T": getToken()
        },
        contentType: "application/json",
        data: JSON.stringify(data),
        success: function() {
            alert('Fitness center updated!');
            window.location.reload();
        },
        error: function() {
            alert('error!');
        }
    })
}


function deleteHall(id) {
    $.ajax({
        type: "DELETE",
        url: 'http://localhost:8080/hall/delete/' + id,
        headers: {
            "X-Auth-T": getToken()
        },
        success: function(data, status) {
            alert('Hall deleted!')
            window.location.reload();
        },
        error: function() {
            alert("error!");
        },
    })
}

function createNewHall(data) {
    $.ajax({
        type: "POST",
        url: "http://localhost:8080/hall/create",
        headers: {
            "X-Auth-T": getToken()
        },
        contentType: "application/json",
        data: JSON.stringify(data),
        success: function (data, status) {
            alert("New Hall created!");
            location.href = 'halls.html';
        },
        error: function() {
            alert('error!');
        }
    })
}

function updateHall(data) {
    $.ajax({
        type: "PUT",
        url: "http://localhost:8080/hall/update",
        headers: {
            "X-Auth-T": getToken()
        },
        contentType: "application/json",
        data: JSON.stringify(data),
        success: function() {
            alert('Hall updated succesfully!');
            window.location.reload();
        },
        error: function() {
            alert('error!');
        }
    })
}

function deleteCoach(id) {
    $.ajax({
        type: "POST",
        url: "http://localhost:8080/user/deactivate/" + id,
        headers: {
            "X-Auth-T": getToken()
        },
        success: function(data, status) {
            alert('Coach deactivated!');
            window.location.reload();
        },
        error: function(data, status) {
            alert('error!');
        }
    })
}

function activateMember(id) {
    $.ajax({
        type: "POST",
        url: "http://localhost:8080/user/activate/" + id,
        headers: {
            "X-Auth-T": getToken()
        },
        success: function(data, status) {
            alert("Success! User activated");
            window.location.reload();
        },
        error: function(data, status) {
            alert('error!')
        }
    })
}

function registerCoach(data) {
    $.ajax({
        type: "POST",
        url: 'http://localhost:8080/user/register-coach',
        headers: {
            "X-Auth-T": getToken()
        },
        data: JSON.stringify(data),
        contentType: "application/json",
        success: function(data, status) {
            alert('Coach registered succesfully!');
        },
        error: function(data, status) {
            console.log('Error!')
        }
    });
}
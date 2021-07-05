function checkInWorkout(workoutId) {
    $.ajax({
        type: "POST",
        url: 'http://localhost:8080/users/schedule-workout/' + workoutId,
        headers: {
            "Authorization": "X-Auth-T " + getToken()
        },
        success: function(data, status) {
            alert('success!')
        },
        error: function() {
            alert("error!");
        },
    })
}

function cancelScheduledWorkout(workoutId) {
    $.ajax({
        type: "POST",
        url: 'http://localhost:8080/users/cancel-schedule-workout/' + workoutId,
        success: function(data, status) {
            alert('success!');
        },
        error: function() {
            alert('error!')
        }
    })
}

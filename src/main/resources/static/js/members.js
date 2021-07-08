function checkInWorkout(workoutId) {
    $.ajax({
        type: "POST",
        url: 'http://localhost:8080/user/schedule-workout/' + workoutId,
        headers: {
            "X-Auth-T": getToken()
        },
        success: function(data, status) {
            alert('Successfuly checked in!')
        },
        error: function() {
            alert("error!");
        },
    })
}

function cancelScheduledWorkout(workoutId) {
    $.ajax({
        type: "POST",
        url: 'http://localhost:8080/user/cancel-schedule-workout/' + workoutId,
        headers: {
            "X-Auth-T": getToken()
        },
        success: function(data, status) {
            alert('Workout canceled!');
        },
        error: function() {
            alert('error!')
        }
    })
}

function checkInWorkout(workoutId) {
    $.ajax({
        type: "POST",
        url: 'http://localhost:8080/user/schedule-workout/' + workoutId,
        headers: {
            "X-Auth-T": getToken()
        },
        success: function(data, status) {
            alert('Successfuly checked in!');
            location.href = 'my-workouts.html';
        },
        error: function() {
            alert("You are already checked in for this workout!");
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
            window.location.reload();
        },
        error: function() {
            alert('error!')
        }
    })
}

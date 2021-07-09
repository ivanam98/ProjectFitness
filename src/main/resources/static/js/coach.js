function createNewScheduledWorkout(data, fitnessCenterId) {
    $.ajax({
        type: "POST",
        url: "http://localhost:8080/scheduled-workout/create",
        headers: {
            "X-Auth-T": getToken()
        },
        contentType: "application/json",
        data: JSON.stringify(data),
        success: function (respData, status) {
            alert("New Scheduled workout created!");
            location.href = 'scheduled-workouts.html?workoutId=' + data.workoutId + "&fitnessCenterId=" + fitnessCenterId;
        },
        error: function() {
            alert('error!');
        }
    })
}
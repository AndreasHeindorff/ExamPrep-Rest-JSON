$(document).ready(function () {

    $("#btn").on("click", function () {
        var amount = $("#amount").val();
        var params = $("#params").val();
        
        console.log(amount);

        $.get("http://localhost:8080/Exam_Prep_REST_and_JSON/api/person/" + amount + "/" + params, function (data) {
            $("#dataHere").html("");
            for (var i = 0, max = data.length; i < max; i++) {
                $("#dataHere").append("<p>" + data[i].fName + " - " + data[i].lName + "</p>");
            }
        });
    });


});
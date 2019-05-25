$(function() {

    $("#firstname_error_message").hide();
    $("#lastname_error_message").hide();
    $("#username_error_message").hide();
    $("#password_error_message").hide();
    $("#password_retype_error_message").hide();

    var error_firstname = false;
    var error_lastname = false;
    var error_username = false;
    var error_password = false;
    var error_retype_password = false;

    $("#form_firstname").focusout(function() {

        check_firstname();

    });

    $("#form_lastname").focusout(function() {

        check_lastname();

    });

    $("#form_username").focusout(function() {

        check_username();

    });

 

    function check_firstname() {

        var firstname_length = $("#form_firstname").val().length;

        if(firstname_length < 5 || firstname_length > 20) {
            $("#firstname_error_message").html("Should be between 5-20 characters");
            $("#firstname_error_message").show();
            error_firstname = true;
        } else {
            $("#firstname_error_message").hide();
        }

    }


    function check_lastname() {

        var lastname_length = $("#form_lastname").val().length;

        if(lastname_length < 5 || lastname_length> 20) {
            $("#lastname_error_message").html("Should be between 5-200 characters");
            $("#lastname_error_message").show();
            error_lastname = true;
        } else {
            $("#lastname_error_message").hide();
        }

    }

    function check_username() {

        var username_length = $("#form_username").val().length;

        if(username_length  < 5 || username_length > 20) {
            $("#username_error_message").html("Should be entered numbers");
            $("#username_error_message").show();
            error_username = true;
        } else {
            $("#lastname_error_message").hide();
        }

    }



});
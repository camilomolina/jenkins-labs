$(document).ready(function () {
    Singin.init();
});


var ERROR_MESSAGE = [];
var Singin = {
    init: function () {

    },
    validate: function() {
        var forward = true;
        ERROR_MESSAGE = [];

        if ($("#inputEmail").val() == "") {
            ERROR_MESSAGE.push("Debe ingresar un usuaio");
            forward = false;
        }

        if ($("#inputPassword").val() == "") {
            ERROR_MESSAGE.push("Debe ingresar una contraseña");
            forward = false;
        }

        return forward;
    },
    singin: function () {
        if (Singin.validate()) {
            $("#method").val("singin");
            $("#singinForm").submit();
        } else {
            Generic.errorDialog(ERROR_MESSAGE);
        }
    }
};



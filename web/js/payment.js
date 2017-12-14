$(document).ready(function () {
    Payment.init();
});


var ERROR_MESSAGE = [];
var Payment = {
    init: function () {
        Payment.getAll();
    },
    validate: function() {
        var forward = true;
        ERROR_MESSAGE = [];

        return forward;
    },
    getAll: function () {
        $.ajax({
            url: "/jenkins-labs/payment.do",
            method: "POST",
            data: "method=getAll",
            dataType: "html",
            success: function (html) {
                $("#paymentListTable").html(html);
            }
        });
    },
    get: function (id) {
        var parameters = {
            "method": "get"
            , "paymentId": id
        };

        $.ajax({
            url: "/jenkins-labs/payment.do",
            method: "POST",
            data: parameters,
            dataType: "json",
            success: function (json) {
                alert(JSON.stringify(json));
            }
        });
    }
};



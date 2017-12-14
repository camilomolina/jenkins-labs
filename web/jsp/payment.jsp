<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html" %>
<%@ taglib prefix="logic" uri="http://jakarta.apache.org/struts/tags-logic" %>
<%@ taglib prefix="bean" uri="http://jakarta.apache.org/struts/tags-bean" %>

<html lang="en"><head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>jenkins-labs</title>

    <link type="text/css" rel="stylesheet" href="/jenkins-labs/css/bootstrap/bootstrap.min.css"/>
    <link type="text/css" rel="stylesheet" href="/jenkins-labs/css/font-awesome/font-awesome.min.css"/>

    <style>
        body {
            padding-top: 40px;
            padding-bottom: 40px;
            background-color: #eee;
        }
    </style>
</head>

<body>

<div class="container">

    <html:form action="payment" styleId="paymentForm" >
        <h2 class="form-signin-heading">Payment</h2>

        <div id="paymentListTable" align="center">

        </div>


    </html:form>

    <div class="modal">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title">PaymentDetail</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <p>details</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="/jenkins-labs/js/ext/popper.js"></script>
<script type="text/javascript" src="/jenkins-labs/js/ext/jquery/jquery.js"></script>
<script type="text/javascript" src="/jenkins-labs/js/ext/bootstrap/bootstrap.min.js"></script>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="/jenkins-labs/js/ext/bootstrap/ie10-viewport-bug-workaround.js"></script>

<script type="text/javascript" src="/jenkins-labs/js/generic.js"></script>
<script type="text/javascript" src="/jenkins-labs/js/payment.js"></script>


</body></html>

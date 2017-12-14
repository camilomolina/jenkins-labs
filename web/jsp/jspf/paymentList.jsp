<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>

<div class="table-responsive">
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Name</th>
            <th>Description</th>
            <th>Amount</th>
            <th>Active</th>
            <th>Option</th>
        </tr>
        </thead>
        <tbody>
        <logic:notEmpty name="paymentForm" property="paymentList">
            <logic:iterate id="dto" name="paymentForm" property="paymentList">
                <tr>
                    <td><bean:write name="dto" property="name" /></td>
                    <td><bean:write name="dto" property="description" /></td>
                    <td><bean:write name="dto" property="amount" /></td>
                    <td><bean:write name="dto" property="active" /></td>
                    <td>
                        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" onclick="Payment.get(<bean:write name="dto" property="id" />)">
                            <i class="fa fa-info" aria-hidden="true"></i>
                        </button>
                    </td>
                </tr>
            </logic:iterate>
        </logic:notEmpty>
        </tbody>
    </table>
</div>

package cl.bennu.jenkinslabs.web.action;

import cl.bennu.ibatislabs.business.IbatisLabsBusiness;
import cl.bennu.ibatislabs.commons.dto.ClientDTO;
import cl.bennu.jenkinslabs.commons.dto.PaymentDTO;
import cl.bennu.jenkinslabs.commons.util.DTOBuilder;
import cl.bennu.jenkinslabs.web.form.PaymentForm;
import net.sf.json.JSONObject;
import org.apache.commons.collections.IteratorUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class PaymentAction extends BaseAction {

    private static final String START_PAYMENT = "startPayment";
    private static final String PAYMENT_LIST = "paymentList";

    public ActionForward unspecified(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        PaymentForm paymentForm = (PaymentForm) form;

        /*
        List list = IbatisLabsBusiness.getInstance().getAllClient(null);
        Iterator iterator = IteratorUtils.getIterator(list);
        while (iterator.hasNext()) {
            ClientDTO clientDTO = (ClientDTO) iterator.next();
            System.out.println(clientDTO);
        }
        */

        return mapping.findForward(START_PAYMENT);
    }

    public void get(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        PaymentForm paymentForm = (PaymentForm) form;

        PaymentDTO paymentDTO = DTOBuilder.get(paymentForm.getPaymentId());

        JSONObject jsonObject = JSONObject.fromObject(paymentDTO);
        ServletOutputStream servletOutputStream = response.getOutputStream();
        servletOutputStream.write(jsonObject.toString().getBytes());
    }

    public ActionForward getAll(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        PaymentForm paymentForm = (PaymentForm) form;

        List paymentList = DTOBuilder.getAll();
        paymentForm.setPaymentList(paymentList);

        return mapping.findForward(PAYMENT_LIST);
    }

}
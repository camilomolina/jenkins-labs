package cl.bennu.jenkinslabs.web.action;

import cl.bennu.jenkinslabs.web.form.SinginForm;
import net.sf.json.JSONObject;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SinginAction extends BaseAction {

    private static final String START_PAYMENT = "startSingnin";
    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";

    public ActionForward unspecified(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        return mapping.findForward(START_PAYMENT);
    }

    public ActionForward singin(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        SinginForm singinForm = (SinginForm) form;

        if (singinForm.getUser().equals("camilo@bennu.cl") && singinForm.getPass().equals("11042.")) {
            return mapping.findForward(SUCCESS);
        } else if (singinForm.getUser().equals("marcelo@bennu.cl") && singinForm.getPass().equals("123")) {
            return mapping.findForward(SUCCESS);
        } else {
            return mapping.findForward(FAIL);
        }
    }


}
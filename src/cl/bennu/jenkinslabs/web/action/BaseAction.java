package cl.bennu.jenkinslabs.web.action;

import cl.bennu.jenkinslabs.commons.dto.base.ContextDTO;
import org.apache.struts.action.ActionForward;
import org.apache.struts.actions.DispatchAction;

import javax.servlet.http.HttpServletRequest;

public class BaseAction extends DispatchAction {

    public static final ActionForward NULL = null;

    public ContextDTO buildContext(HttpServletRequest request) {
        ContextDTO  contextDTO = new ContextDTO();
        contextDTO.setUser("ADMIN");
        contextDTO.setHost(request.getRemoteHost());

        return contextDTO;
    }
}

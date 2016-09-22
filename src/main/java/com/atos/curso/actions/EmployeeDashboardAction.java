package com.atos.curso.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.atos.curso.dao.AtosEmployeeDAO;
import com.atos.curso.forms.WelcomeForm;
import com.atos.curso.models.Employee;

/**
 * Action for "/employeeDashboard.do"
 */
public class EmployeeDashboardAction extends Action {

	private AtosEmployeeDAO atosEmployeeDAO = new AtosEmployeeDAO();
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		WelcomeForm welcomeForm = (WelcomeForm) form;
		welcomeForm.setMessage("Manage Your Employees");
		
		List<Employee> atosEmployees = atosEmployeeDAO.findAll();
		request.getSession().setAttribute("atosEmployees", atosEmployees);
		
		ActionMessages messages = new ActionMessages();
		messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("message1"));
		messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("message2"));
		messages.add(Globals.ERROR_KEY, new ActionMessage("messageError"));
		messages.add(Globals.MESSAGE_KEY, new ActionMessage("messageGL"));
		messages.add("msg", new ActionMessage("message3"));
		
		ActionMessages messages2 = new ActionMessages();
		messages2.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("message1"));
		messages2.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("message2"));
		
		saveMessages(request, messages);
		saveErrors(request, messages2);
		return mapping.findForward("success");
	}
}

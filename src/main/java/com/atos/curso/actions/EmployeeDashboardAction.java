package com.atos.curso.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

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
		
		return mapping.findForward("success");
	}
}

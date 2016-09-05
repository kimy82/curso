package com.atos.curso.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.atos.curso.dao.AtosEmployeeDAO;
import com.atos.curso.forms.MyForm;
import com.atos.curso.models.Employee;

public class MyWelcomeAction extends Action {

	private AtosEmployeeDAO atosEmployeeDAO = new AtosEmployeeDAO();
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		MyForm myForm = (MyForm) form;
		myForm.setMessage("Manage Your Employees");
		
		List<Employee> atosEmployees = atosEmployeeDAO.findAll();
		request.getSession().setAttribute("atosEmployees", atosEmployees);
		
		return mapping.findForward("success");
	}
}

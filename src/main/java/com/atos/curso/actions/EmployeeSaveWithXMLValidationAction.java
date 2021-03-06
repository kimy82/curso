package com.atos.curso.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.atos.curso.dao.AtosEmployeeDAO;
import com.atos.curso.forms.EmployeeXMLValidationForm;
import com.atos.curso.models.Employee;

/**
 * Holds action "/saveWithXMLValidation.do"
 */
public class EmployeeSaveWithXMLValidationAction extends Action {

	private AtosEmployeeDAO atosEmployeeDAO = new AtosEmployeeDAO();

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		EmployeeXMLValidationForm employeeForm = (EmployeeXMLValidationForm) form;
		Employee employee = new Employee();

		BeanUtils.copyProperties(employee, employeeForm);
		atosEmployeeDAO.save(employee);

		List<Employee> atosEmployees = atosEmployeeDAO.findAll();
		request.getSession().setAttribute("atosEmployees", atosEmployees);

		return mapping.findForward("success");
	}
}

package com.atos.curso.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.atos.curso.dao.AtosEmployeeDAO;
import com.atos.curso.forms.EmployeeForm;
import com.atos.curso.models.Employee;

/**
 * Holds action "/saveEmployee.do"
 */
public class EmployeeSaveAction extends Action {

	private static final Logger logger = Logger.getLogger(EmployeeSaveAction.class);

	private AtosEmployeeDAO atosEmployeeDAO = new AtosEmployeeDAO();

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		logger.info("Employee save action");
		EmployeeForm employeeForm = (EmployeeForm) form;
		Employee employee = new Employee();

		BeanUtils.copyProperties(employee, employeeForm);
		atosEmployeeDAO.save(employee);

		List<Employee> atosEmployees = atosEmployeeDAO.findAll();
		request.getSession().setAttribute("atosEmployees", atosEmployees);

		return mapping.findForward("success");
	}

}

package com.atos.curso.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionMapping;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.internal.util.reflection.Whitebox;

import com.atos.curso.dao.AtosEmployeeDAO;
import com.atos.curso.forms.EmployeeForm;
import com.atos.curso.models.Employee;
import static org.mockito.Mockito.mock;

/**
 * Test the creation of a new employee.
 */
public class EmployeeSaveActionTest2 {

	@Test
	public void mockitoTest() throws Exception {
		
		EmployeeSaveAction employeeSaveAction = new EmployeeSaveAction();
		
		AtosEmployeeDAO atosEmployeeDAO = Mockito.mock(AtosEmployeeDAO.class);
		
		ActionMapping mapping = mock(ActionMapping.class);
		
		HttpServletRequest request = mock(HttpServletRequest.class);
		
		HttpServletResponse response =  mock(HttpServletResponse.class);
		
		HttpSession session =  Mockito.mock(HttpSession.class);
		
		Mockito.when(request.getSession()).thenReturn(session);
		
		Whitebox.setInternalState(employeeSaveAction, "atosEmployeeDAO", atosEmployeeDAO);
		
		EmployeeForm employee = new EmployeeForm();
		employee.setAddress("address");
		employee.setName("name");
		employee.setSurname("surname");
		
		employeeSaveAction.execute(mapping, employee, request, response);
		
		Mockito.verify(atosEmployeeDAO,Mockito.atLeastOnce()).save(Mockito.any(Employee.class));
		Mockito.verify(request,Mockito.times(11)).getSession();
	}

}

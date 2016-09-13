package com.atos.curso.actions;

import servletunit.struts.MockStrutsTestCase;

/**
 * Test the creation of a new employee.
 */
public class EmployeeSaveActionTest extends MockStrutsTestCase {

	public EmployeeSaveActionTest(String testName) {
		super(testName);
	}

	public void setUp() throws Exception {
		super.setUp();
		setConfigFile("/WEB-INF/struts-config.xml");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void test_WhenSaveEmployee_GibenNoNameinForm_ThenErrorMessageOccur() {
		setRequestPathInfo("/saveEmployee.do");
		actionPerform();
		verifyForwardPath("/mySuccess.jsp");
		verifyActionErrors(new String[] { "error.common.name.required" });
	}

	public void test_WhenSaveEmployee_GibenFormFiedlsAreCorrect_ThenNewEmployeeIsSaved() {
		addRequestParameter("name", "vikas");
		addRequestParameter("surname", "vikas surname");
		addRequestParameter("address", "Vikas address");
		setRequestPathInfo("/saveEmployee.do");
		actionPerform();
		verifyForwardPath("/mySuccessSave.jsp");
		verifyNoActionErrors();
	}

}

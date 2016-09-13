package com.atos.curso.actions;

import java.lang.reflect.Constructor;

import com.atos.curso.database.TtConnection;

import servletunit.struts.MockStrutsTestCase;


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

	public void testSaveAction_GoesBackToFormPageWithErrorMessage() {
		setRequestPathInfo("/saveEmployee.do");
		actionPerform();
		verifyForwardPath("/mySuccess.jsp");
		verifyActionErrors(new String[] { "error.common.name.required" });
	}

	public void testSaveAction_CreatesEmployee() {
		addRequestParameter("name", "vikas");
		addRequestParameter("surname", "vikas surname");
		addRequestParameter("address", "Vikas address");
		setRequestPathInfo("/saveEmployee.do");
		actionPerform();
		verifyForwardPath("/mySuccessSave.jsp");
		verifyNoActionErrors();
	}

}

package com.atos.curso.forms;

import org.apache.struts.action.ActionForm;

/**
 * Simple form going to a page.
 */
public class WelcomeForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

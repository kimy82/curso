package com.atos.curso.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * Employee form holding java validation.
 */
public class EmployeeForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	private String surname;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();

		if (getName() == null || ("".equals(getName()))) {
			errors.add("common.name.err", new ActionMessage("error.common.name.required"));
		}

		return errors;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		name = "";
		surname = "";
		address = "";
	}
}

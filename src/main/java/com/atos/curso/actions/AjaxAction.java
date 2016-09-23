package com.atos.curso.actions;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * Holds action "/saveEmployee.do"
 */
public class AjaxAction extends Action {

	private static final Logger logger = Logger.getLogger(AjaxAction.class);

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ServletOutputStream out = null;
		logger.info("Ajax save action");
		response.setContentType("application/json");
		out = response.getOutputStream();
		out.print("{\"id\": 123432}");
		return null;
	}
}

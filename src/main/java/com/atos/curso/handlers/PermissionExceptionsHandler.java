package com.atos.curso.handlers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ExceptionHandler;
import org.apache.struts.config.ExceptionConfig;

public class PermissionExceptionsHandler extends ExceptionHandler {

	 @Override
	  public ActionForward execute(Exception ex, ExceptionConfig ae,
		ActionMapping mapping, ActionForm formInstance,
		HttpServletRequest request, HttpServletResponse response)
		throws ServletException {

		//log the error message for example

		return super.execute(ex, ae, mapping, formInstance, request, response);
	  }
}

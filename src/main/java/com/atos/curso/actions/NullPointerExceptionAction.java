package com.atos.curso.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * Holds action "/nullPointerExceptionAction.do"
 */
public class NullPointerExceptionAction extends Action {

	@SuppressWarnings("unused")
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		if (1 == 1) {
			throw new NullPointerException();
		}

		return mapping.findForward("success");
	}
}

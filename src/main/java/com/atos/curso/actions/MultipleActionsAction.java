package com.atos.curso.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 * Holds 2 actions.
 * - "/MultipleActionsAction.do?action=page1"
 * - "/MultipleActionsAction.do?action=page2"
 */
public class MultipleActionsAction extends DispatchAction {

	public ActionForward page1(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		return mapping.findForward("page1");
	}

	public ActionForward page2(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		return mapping.findForward("page2");
	}
}

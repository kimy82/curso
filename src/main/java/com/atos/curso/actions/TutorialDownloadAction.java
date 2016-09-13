package com.atos.curso.actions;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DownloadAction;

/**
 * Action for "/downloadTutorial.do"
 */
public class TutorialDownloadAction extends DownloadAction {

	private static final String CURSO_PDF = "\\curso.pdf";

	protected StreamInfo getStreamInfo(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ServletContext servlet_context = servlet.getServletContext();
		return new ResourceStreamInfo("application/pdf", servlet_context, CURSO_PDF);
	}
}

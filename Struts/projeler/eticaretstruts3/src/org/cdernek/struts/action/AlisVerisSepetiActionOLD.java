/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package org.cdernek.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * MyEclipse Struts Creation date: 02-10-2008
 * 
 * XDoclet definition:
 * 
 * @struts.action input="/uye.jsp"
 */
public class AlisVerisSepetiActionOLD extends Action {
	/*
	 * Generated Methods
	 */

	/**
	 * Method execute
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		String kod = request.getParameter("kod");
		String durum = request.getParameter("durum");
		HttpSession session = request.getSession();
		if (durum==null) {
			SepetOld sep = (SepetOld) session.getAttribute("sepet");
			if (sep == null) {
				sep = new SepetOld();
				session.setAttribute("sepet", sep);
			}

			sep.ekle(new Urunler().getUrun(kod));
			//System.out.println(kod);
			return mapping.findForward("tekrar");
		}
		return mapping.findForward("urunGoster");
	}
}
/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package org.csystem.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 03-19-2011
 * 
 * XDoclet definition:
 * @struts.form name="kitapSorgulaForm"
 */
public class KitapSorgulaForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** yazar property */
	private String yazar;

	/** kitapAd property */
	private String kitapAd;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the yazar.
	 * @return String
	 */
	public String getYazar() {
		return yazar;
	}

	/** 
	 * Set the yazar.
	 * @param yazar The yazar to set
	 */
	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	/** 
	 * Returns the kitapAd.
	 * @return String
	 */
	public String getKitapAd() {
		return kitapAd;
	}

	/** 
	 * Set the kitapAd.
	 * @param kitapAd The kitapAd to set
	 */
	public void setKitapAd(String kitapAd) {
		this.kitapAd = kitapAd;
	}
}
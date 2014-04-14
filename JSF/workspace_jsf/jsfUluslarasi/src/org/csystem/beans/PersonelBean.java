package org.csystem.beans;

import java.util.Locale;

import javax.faces.context.FacesContext;

public class PersonelBean {

	private String ad, soyad;

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String gitAction() {
		FacesContext.getCurrentInstance().getViewRoot()
				.setLocale(new Locale("tr"));
		return "git";
	}
}

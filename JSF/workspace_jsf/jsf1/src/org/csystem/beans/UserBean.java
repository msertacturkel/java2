package org.csystem.beans;

public class UserBean {

	private String ad="Ahmet", soyad;

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
		return "basarili";
	}
}

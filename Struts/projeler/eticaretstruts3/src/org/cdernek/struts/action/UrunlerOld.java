package org.cdernek.struts.action;

import java.util.HashMap;

public class UrunlerOld implements java.io.Serializable{

	private HashMap urunler;

	public UrunlerOld() {
		// TODO Auto-generated constructor stub
		urunler=new HashMap();
		urunler.put("1",new UrunOLD("elma","1",1));
		urunler.put("2", new UrunOLD("portakal","2",2));
		urunler.put("3", new UrunOLD("nar","3",2));
	}   
	
	   public UrunOLD getUrun(String kod){
		   
		   return (UrunOLD)urunler.get(kod);
	   }
}

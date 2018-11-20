package build;

public class Bilgisayar {
	
	private String marka,model;
	private String islemci,anakart,ram;
	private String monitor,hoparlor;
	
	public void bilgisayariKur(String marka,String model) {
		this.marka=marka;this.model=model;
	}
	
	public void montajYap(String islemci,String anakart,String ram) {
		this.ram=ram;this.anakart=anakart;this.islemci=islemci;
	}
	
	public void ekstraEkle(String monitor, String hoparlor) {
		this.hoparlor=hoparlor;this.monitor=monitor;
	}
	
	@Override
	public String toString() {
		return "Bilgisayar Markasi: "+marka+" Modeli : "+model+"\n"+
				"[anakart: "+anakart+" ,islemci: "+islemci+" ,ram: "+ram+"]";
	}

}

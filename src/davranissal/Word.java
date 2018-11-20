package davranissal;

import java.util.ArrayList;

public class Word {

	public static void main(String[] args) {
		Dokuman d=new Dokuman();
		d.icerikAta("Naber");
		
		DokumanYazmaProgrami dP=new DokumanYazmaProgrami(d);
		
		dP.dokumanYaz("1");
		dP.dokumanYaz("2");
		dP.dokumanYaz("3");
		dP.dokumanYaz("4");
		
		System.out.println(d.icerik);
		dP.geriAl();
		dP.geriAl();
		dP.geriAl();
		dP.geriAl();
		System.out.println(d.icerik);
	}

}

class Dokuman{
	
	String icerik;
	
	public String icerikAl() {
		return icerik;
	}
	
	public void icerikAta(String icerik) {
		this.icerik=icerik;	
	}
	
	public DokumanHatirlayici hatirlayiciOlustur() {
		return new DokumanHatirlayici(this);
	}
	
	public void hatirlayiciyiAta(DokumanHatirlayici hatirlayici) {
		this.icerik=hatirlayici.icerikAl();
	}
}

class DokumanHatirlayici {
	
	String icerik;
	
	public DokumanHatirlayici(Dokuman d) {
		icerik=d.icerikAl();
	}
	
	public String icerikAl() {
		return icerik;
	}
	
}

class DokumanYazmaProgrami {
	
	private Dokuman dokuman;
	private ArrayList<DokumanHatirlayici> gecmisListesi=new ArrayList<DokumanHatirlayici>();
	
	public DokumanYazmaProgrami(Dokuman dokuman){
		this.dokuman=dokuman;
	}
	
	public void dokumanYaz(String yeniIcerik) {
		DokumanHatirlayici d=dokuman.hatirlayiciOlustur();
		gecmisListesi.add(d);
		dokuman.icerikAta(yeniIcerik);
		
	}
	
	public void geriAl() {
		
		DokumanHatirlayici d1=gecmisListesi.remove(gecmisListesi.size()-1);
		dokuman.hatirlayiciyiAta(d1);
	}
}

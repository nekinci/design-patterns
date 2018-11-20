package org;

public class AdapterDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefon t=new Telefon();
		System.out.println(t.elektrikAkimi);
		SarjAleti s=new SarjAleti(t);
		Elektrik e=s;
		System.out.println(e.elektrikAkimi());
		SanayiUrunu s1=new SanayiUrunu();
		SanayiAdaptoru adaptor=new SanayiAdaptoru(s1);
		Elektrik v=adaptor;
		System.out.println(v.elektrikAkimi());
	}

}

interface Elektrik{
	int elektrikAkimi();
}

class Telefon{
	final int elektrikAkimi=12;
	
	public Telefon() {
		
	}
}

class SanayiUrunu {
	final int elektrikAkimi=240;
}
class SarjAleti implements Elektrik {
	
	private Telefon telefon;
	
	public SarjAleti(Telefon telefon) {
		// TODO Auto-generated constructor stub
		this.telefon=telefon;
	}
	@Override
	public int elektrikAkimi() {
		// TODO Auto-generated method stub
		return telefon.elektrikAkimi;
	}
}

class SanayiAdaptoru implements Elektrik{
	private SanayiUrunu urun;
	
	public SanayiAdaptoru(SanayiUrunu urun) {
		this.urun=urun;
	}
	
	@Override
	public int elektrikAkimi() {
		// TODO Auto-generated method stub
		return urun.elektrikAkimi;
	}
}

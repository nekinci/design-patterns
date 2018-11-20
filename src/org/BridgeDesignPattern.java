package org;

public class BridgeDesignPattern {

	public static void main(String[] args) {
		
		Ucgen u=new Ucgen(new Kalip1());
		Cember u1=new Cember(new Kalip2());
		u.ciz();
		u1.ciz();
		
	}

}

interface CizimKalibi{
	void cizgiCiz();
	void cemberCiz();
}

class Kalip1 implements CizimKalibi{
	@Override
	public void cizgiCiz() {
		System.out.println("Kalıp1 ile çizgi çizildi.");
	}
	
	@Override
	public void cemberCiz() {
		System.out.println("Kalıp1 ile çember çizildi.");
	}
}

class Kalip2 implements CizimKalibi{
	@Override
	public void cizgiCiz() {
		System.out.println("Kalıp 2 ile çizgi çizildi.");
	}
	@Override
	public void cemberCiz() {
		System.out.println("Kalıp 2 ile çember çizildi.");
	}
}

class Sekil {
	private String isim;
	CizimKalibi kalip;
	
	public Sekil(String isim,CizimKalibi kalip) {
		this.kalip=kalip;this.isim=isim;
	}
	
	public void ciz() {
		System.out.println(isim+" çizildi.");
	}
}

class Ucgen extends Sekil{

	public Ucgen(CizimKalibi kalip) {
		super("Üçgen", kalip);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void ciz() {
		super.ciz();
		kalip.cizgiCiz();
		kalip.cizgiCiz();
		kalip.cizgiCiz();
	}
	
}

class Dikdortgen extends Sekil{
	
	public Dikdortgen(CizimKalibi kalip) {
		super("Dikdörtgen",kalip);
	}
	
	@Override
	public void ciz() {
		super.ciz();
		kalip.cizgiCiz();
		kalip.cizgiCiz();
		kalip.cizgiCiz();
		kalip.cizgiCiz();
	}
}

class Cember extends Sekil{
	
	public Cember(CizimKalibi kalip) {
		super("Çember", kalip);
	}
	
	@Override
	public void ciz() {
		super.ciz();
		kalip.cemberCiz();
	}
}
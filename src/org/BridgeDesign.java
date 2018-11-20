package org;

public class BridgeDesign {

	public static void main(String[] args) {
		UcgenQ ucgen=new UcgenQ(new KalipBir());
		CemberQ cember=new CemberQ(new KalipIki());
		ucgen.ciz();
		cember.ciz();
	}

}

interface Cizim{
	void cizgiCiz();
	void cemberCiz();
}

class KalipBir implements Cizim{
	
	@Override
	public void cizgiCiz() {
		System.out.println("Kalıp 1 ile çizgi çizildi.");
	}
	
	@Override
	public void cemberCiz() {
		System.out.println("Kalıp 1 ile çember çizildi.");
	}
}

class KalipIki implements Cizim{
	
	@Override
	public void cizgiCiz() {
		System.out.println("Kalıp 2 ile çizgi çizildi.");
	}
	
	@Override
	public void cemberCiz() {
		System.out.println("Kalıp 2 ile çember çizildi.");
	}
}

class SekilQ{
	protected Cizim kalip;
	private String isim;
	
	public SekilQ(String isim,Cizim kalip) {
		this.isim=isim;
		this.kalip=kalip;
	}
	
	public void ciz() {
		// TODO Auto-generated method stub
		System.out.println(isim+" çiziliyor..");
	}
}

class UcgenQ extends SekilQ{
	
	public UcgenQ(Cizim kalip) {
		super("Üçgen",kalip);
	}
	
	@Override
	public void ciz() {
		super.ciz();
		kalip.cizgiCiz();
		kalip.cizgiCiz();
		kalip.cizgiCiz();
	}
}

class CemberQ extends SekilQ{
	
	public CemberQ(Cizim kalip) {
		super("Çember",kalip);
	}
	
	@Override
	public void ciz() {
		super.ciz();
		kalip.cemberCiz();
	}
}
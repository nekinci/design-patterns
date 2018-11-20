package msg;

public class BridgeDesignPattern {

	public static void main(String[] args) {
		Cizim c1=new Cizim(new Kalip2());
		c1.dikdortgenCiz();
		c1.cemberCiz();
		c1.ucgenCiz();
	}

}

interface CizimKalibi{
	void cizgiCiz();
	void cemberCiz();
}

class Kalip1 implements CizimKalibi{

	@Override
	public void cizgiCiz() {
		System.out.println("Kalıp1: çizgi");
	}

	@Override
	public void cemberCiz() {
		System.out.println("Kalıp1: çember");
	}
	
}

class Kalip2 implements CizimKalibi{
	@Override
	public void cizgiCiz() {
		System.out.println("Kalıp2: çizgi");
	}
	
	@Override
	public void cemberCiz() {
		System.out.println("Kalıp2: çember");
	}
}

class Cizim{
	CizimKalibi c;
	
	public Cizim(CizimKalibi c) {
		this.c=c;
	}
	
	public void ucgenCiz() {
		System.out.println("Üçgen çiziliyor..");
		c.cizgiCiz();
		c.cizgiCiz();
		c.cizgiCiz();
	}
	
	public void cemberCiz() {
		System.out.println("Çember çiziliyor..");
		c.cemberCiz();
	}
	
	public void dikdortgenCiz() {
		System.out.println("Dikdörtgen çiziliyor..");
		c.cizgiCiz();
		c.cizgiCiz();
		c.cizgiCiz();
		c.cizgiCiz();
	}
}

package structal;

public class CizimTahtasi {

	public static void main(String[] args) {
		
		Sekil sekiller[]=new Sekil[3];
		sekiller[0]=new Cember(new Kalip1());
		sekiller[1]=new Ucgen(new Kalip2() );
		sekiller[2]=new Dikdortgen(new Kalip1());
		
		for(Sekil i: sekiller) {
			i.ciz();
		}
		
	}

}
interface CizimKalibi{
	void cizgiCiz();
	void cemberCiz();
}

class Sekil{
	
	protected CizimKalibi kalip;
	private String isim;
	
	public Sekil(CizimKalibi kalip,String isim) {
		
		this.kalip=kalip;this.isim=isim;
	}
	
	public void ciz() {
		System.out.println(isim + " çiziliyor...");
	}
}
class Ucgen extends Sekil{

	public Ucgen(CizimKalibi kalip) {
	
		super(kalip, "Üçgen");
	}
	
	public void ciz() {
		super.ciz();
		
		kalip.cizgiCiz();
		kalip.cizgiCiz();
		kalip.cizgiCiz();
		
	}
	
}

class Dikdortgen extends Sekil{
	
	public Dikdortgen(CizimKalibi kalip) {
		super(kalip, "Dikdörtgen");
	}
	
	public void ciz() {
		super.ciz();
		
		kalip.cizgiCiz();
		kalip.cizgiCiz();
		kalip.cizgiCiz();
		kalip.cizgiCiz();
	}
}

class Cember extends Sekil {
	
	public Cember(CizimKalibi kalip) {
		super(kalip,"Çember");
	}
	
	public void ciz() {
		super.ciz();
		kalip.cemberCiz();
	}
}

class Kalip1 implements CizimKalibi{

	public void cizgiCiz() {
		System.out.println("Kalıp 1 ile çizgi çizildi");
	}

	public void cemberCiz() {
		System.out.println("Kalıp 1 ile çember çizildi");
	}
	
}

class Kalip2 implements CizimKalibi{

	public void cizgiCiz() {
		System.out.println("Kalıp 2 ile çizgi çizildi");
	}

	public void cemberCiz() {
		System.out.println("Kalıp 2 ile çember çizildi");
	}
	
}

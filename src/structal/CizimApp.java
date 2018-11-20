package structal;
 //köprü tasarım deseni - bridge design pattern
public class CizimApp {

	public static void main(String[] args) {
		Sekil1 s=new Dortgen(new Kalip());
		Sekil1 s1=new Daire(new Kalip());
		
		s.ciz();
		s1.ciz();
	}

}

interface CizimKaliplari{
	public void cizgiCiz();
	public void cemberCiz();
}

class Sekil1 {
	
	CizimKaliplari kalip;
	String isim;
	
	public Sekil1(String isim,CizimKaliplari kalip) {
		this.isim=isim;this.kalip=kalip;
	}
	
	public void ciz() {
		System.out.println(isim + " çiziliyor...");
	}
}

class Dortgen extends Sekil1{
	
	public Dortgen(CizimKaliplari c) {
		super("Dörtgen", c);
	}
	
	@Override
	public void ciz() {
		super.ciz();
		
		kalip.cizgiCiz();kalip.cizgiCiz();kalip.cizgiCiz();kalip.cizgiCiz();
	}
}

class Daire extends Sekil1{
	
	public Daire(CizimKaliplari c) {
		super("Daire", c);
	}
	
	@Override
	public void ciz() {
		super.ciz();
		kalip.cemberCiz();
	}
}

class Kalip implements CizimKaliplari{

	public void cizgiCiz() {
		System.out.println("Çizgi çizildi.");
	}

	public void cemberCiz() {
		System.out.println("Çember çizildi.");
	}
	
}
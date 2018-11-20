package other;

public class BuilderSinifi {

	public static void main(String[] args) {
		Asci a=new Asci();
		a.pideyiYap(new LahmacunluPide());
		System.out.println(a.pideAl());
	}

}

class Pide{
	String malzeme="";
	String baharat="";
	String hamur="";
	
	public void malzemeKoy(String malzeme) {
		this.malzeme=malzeme;
	}
	
	public void hamurKoy(String hamur) {
		this.hamur=hamur;
	}
	
	public void baharatKoy(String baharat) {
		this.baharat=baharat;
	}
}

abstract class PideTuru{
	protected Pide pide;
	
	public void pideYap() {
		pide=new Pide();
	}
	
	public Pide pideAl() {
		return pide;
	}
	
	public abstract void malzemeKoy();
	public abstract void hamurKoy();
	public abstract void baharatKoy();
}

class LahmacunluPide extends PideTuru{

	@Override
	public void malzemeKoy() {
		pide.malzemeKoy("Kıyma,Domates");
	}

	@Override
	public void hamurKoy() {
		pide.hamurKoy("Un,Su");
	}

	@Override
	public void baharatKoy() {
		pide.baharatKoy("Tuz,Karabiber,Kimyon");
	}
	
}

class Asci{
	String isim,soyisim;
	PideTuru p;
	
	public void pideYap(PideTuru p) {
		this.p=p;
	}
	
	public Pide pideAl() {
		return p.pideAl();
	}
	
	public void pideyiYap(PideTuru p1) {
		this.pideYap(p1);
		p.pideYap();
		p.malzemeKoy();
		p.hamurKoy();
		p.baharatKoy();

	}
}

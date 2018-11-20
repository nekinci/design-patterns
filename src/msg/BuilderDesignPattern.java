package msg;

public class BuilderDesignPattern {
	public static void main(String[] args) {
		Asci a=new Asci(new PeynirliPide(new Pide()));
		a.pideyiYap();
	}
}

class Pide{
	String malzeme,hamur,baharat;
	
	public Pide() {}
	
	public void malzemeKur(String malzeme) {
		this.malzeme=malzeme;
	}
	
	public void hamurKur(String hamur) {
		this.hamur=hamur;
	}
	
	public void baharatKur(String baharat) {
		this.baharat=baharat;
	}
	
}

abstract class PideKurucu{
	
	protected Pide pide;
	
	public PideKurucu(Pide pide) {
		this.pide=pide;
	}
	
	public abstract void malzemeKur(String malzeme);
	public abstract void hamurKur(String hamur);
	public abstract void baharatKur(String baharat);
	
}

class PeynirliPide extends PideKurucu{

	public PeynirliPide(Pide pide) {
		super(pide);
	}

	@Override
	public void malzemeKur(String malzeme) {
		pide.malzemeKur(malzeme);
		System.out.println("Peynirli pide malzemeleri konuluyor.");
	}

	@Override
	public void hamurKur(String hamur) {
		pide.hamurKur(hamur);
		System.out.println("Peynirli pide hamurları konuluyor");
	}

	@Override
	public void baharatKur(String baharat) {
		pide.baharatKur(baharat);
		System.out.println("Peynirli pide baharatları konuluyor");
	}
	
}

class Asci {
	protected PideKurucu pideKurucu;
	
	public Asci(PideKurucu pideKurucu) {
		this.pideKurucu=pideKurucu;
	}
	
	public void pideyiYap() {
		pideKurucu.malzemeKur("Sss");
		pideKurucu.hamurKur("ssss");
		pideKurucu.baharatKur("saaa");
	}
}
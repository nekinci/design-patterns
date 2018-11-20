package build;

public abstract class BilgisayarKurucu {
	protected Bilgisayar b;
	
	public void bilgisayarYap() {
		b=new Bilgisayar();
	}
	
	public Bilgisayar bilgisayarAl() {
		return b;
	}
	
	public abstract void bilgisayariKur();
	public abstract void montajYap();
	public abstract void ekstraEkle();
	
}

class Asus100 extends BilgisayarKurucu{

	@Override
	public void bilgisayariKur() {
		b.bilgisayariKur("Asus", "100");
	}

	@Override
	public void montajYap() {
		b.montajYap("i7", "Asus", "8GB DDR5");
	}

	@Override
	public void ekstraEkle() {
		b.ekstraEkle("", "");
	}
	
}

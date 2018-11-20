package biz;

public abstract class PideKurucu {
	protected Pide pide;
	
	public void pideYap() {
		pide = new Pide();
	}
	
	public Pide pideAl() {
		return this.pide;
	}
	
	public abstract void malzemeKur();
	public abstract void hamurKur();
	public abstract void baharatKur();
}


class LahmacunPide extends PideKurucu{

	@Override
	public void malzemeKur() {
		pide.malzemeKoy("Kıyma");
	}

	@Override
	public void hamurKur() {
		pide.hamurKoy("un");
	}

	@Override
	public void baharatKur() {
		pide.baharatKoy("acı biber");
	}
	
}

class PeynirliPide extends PideKurucu{

	@Override
	public void malzemeKur() {
		pide.malzemeKoy("Peynir");
	}

	@Override
	public void hamurKur() {
		pide.hamurKoy("yoğurt");
	}

	@Override
	public void baharatKur() {
		pide.baharatKoy("kimyon");
	}
	
}
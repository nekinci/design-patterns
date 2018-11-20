package msg;

public class FactoryMethod {

	public static void main(String[] args) {
		BardakUretim bardak=new BardakUretim();
		IBardakFabrikasi fabrika=bardak.uret(BardakUretim.CAMBARDAK);
		fabrika.bardakOlustur();
	}

}

interface IBardakFabrikasi{
	void bardakOlustur();
}

class KagitBardakFabrikasi implements IBardakFabrikasi{
	@Override
	public void bardakOlustur() {
		System.out.println("Kağıt bardak oluşturuldu.");
	}
}

class CamBardakFabrikasi implements IBardakFabrikasi{
	@Override
	public void bardakOlustur() {
		System.out.println("Cam bardak oluşturuldu.");
	}
}

class DemirBardakFabrikasi implements IBardakFabrikasi{
	@Override
	public void bardakOlustur() {
		System.out.println("Demir bardak oluşturuldu.");
	}
	
}

class BardakUretim {
	public static final int DEMIRBARDAK=1;
	public static final int KAGITBARDAK=2;
	public static final int CAMBARDAK=3;
	public IBardakFabrikasi uret(int i) {
		if(i==DEMIRBARDAK)
			return new DemirBardakFabrikasi();
		if(i==KAGITBARDAK)
			return new KagitBardakFabrikasi();
		if(i==CAMBARDAK)
			return new CamBardakFabrikasi();
		return null;
	}
}
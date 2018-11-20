package structal;

public class Bilgisayarci {

	public static void main(String[] args) {
		
		Bilgisayar b=new KameraliBilgisayar(new TouchPadliBilgisayar(new BasitBilgisayar()));
		b.bilgisayarOlustur();
	}

}

interface Bilgisayar{
	void bilgisayarOlustur();
}

class BasitBilgisayar implements Bilgisayar{
	
	public void bilgisayarOlustur() {
		System.out.println("Bilgisayar Oluşturuldu.");
	}
	
}

abstract class DekoreBilgisayar implements Bilgisayar{
	
	protected Bilgisayar bilgisayar;
	
	public DekoreBilgisayar(Bilgisayar b) {
		bilgisayar=b;
	}
	
}

class TouchPadliBilgisayar extends DekoreBilgisayar{

	public TouchPadliBilgisayar(Bilgisayar b) {
		super(b);
	}

	public void bilgisayarOlustur() {
		bilgisayar.bilgisayarOlustur();
		touchPadEkle();
	}
	
	private void touchPadEkle() {
		System.out.println("Touch PAD eklendi.");
	}
	
}

class KameraliBilgisayar extends DekoreBilgisayar{
	
	public KameraliBilgisayar(Bilgisayar b) {
		
		super(b);
	}
	
	public void bilgisayarOlustur() {
		
		bilgisayar.bilgisayarOlustur();
		kameraEkle();
	}
	private void kameraEkle() {
		
		System.out.println("Kamera eklendi.");
	}
}

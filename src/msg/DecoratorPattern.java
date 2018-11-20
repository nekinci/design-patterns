package msg;

public class DecoratorPattern {

	public static void main(String[] args) {
		KameraEkle k = new KameraEkle(new Telefon());
		k.telefonOlustur();
	}

}

interface BasitTelefon{
	void telefonOlustur();
}

class Telefon implements BasitTelefon{
	@Override
	public void telefonOlustur() {
		System.out.println("Basit Telefon oluşturuldu.");
	}
}

abstract class DekoreTelefon implements BasitTelefon{
	BasitTelefon t ;
	public DekoreTelefon(BasitTelefon t) {
		this.t= t;
	}
	public abstract void ozellikEkle();
}

class KameraEkle extends DekoreTelefon{

	public KameraEkle(BasitTelefon t) {
		super(t);
	}

	@Override
	public void ozellikEkle() {
		System.out.println("Kamera eklendi.");
	}

	@Override
	public void telefonOlustur() {
		t.telefonOlustur();
		ozellikEkle();
	}
	
}
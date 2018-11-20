package structal;

public class Telefoncu {

	public static void main(String[] args) {
		Telefon telefon=new KameraliTelefonDekarosyoncusu(new MMSliTelefonDekarosyoncusu(new BasitTelefon()));
		telefon.telefonOlustur();
	}

}

interface Telefon{
	void telefonOlustur();
}

class BasitTelefon implements Telefon{

	public void telefonOlustur() {
		System.out.println("Basit telefon oluşturuldu.");
	}
}

abstract class TelefonDekarasyoncusu implements Telefon{
	
	protected Telefon dekoreTelefon;
	
	public TelefonDekarasyoncusu(Telefon telefon) {
		dekoreTelefon=telefon;
	}

}

class MMSliTelefonDekarosyoncusu extends TelefonDekarasyoncusu{

	public MMSliTelefonDekarosyoncusu(Telefon telefon) {
		super(telefon);
	}

	public void telefonOlustur() {
		dekoreTelefon.telefonOlustur();
		mmsOzelligiEkle();
	}
	private void mmsOzelligiEkle() {
		System.out.println("MMS Özelliği Eklendi.");
	}
	
}

class KameraliTelefonDekarosyoncusu extends TelefonDekarasyoncusu{
	
	public KameraliTelefonDekarosyoncusu(Telefon telefon) {
		super(telefon);
	}

	public void telefonOlustur() {
		dekoreTelefon.telefonOlustur();
		kameraOzelligiEkle();
	}
	
	private void kameraOzelligiEkle() {
		System.out.println("Kamera Özelliği Eklendi.");
	}
}

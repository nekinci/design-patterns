package org;

public class DecoratorDesignPattern {

	public static void main(String[] args) {
		ITelefon t=new KameraliTelefonDekorasyoncusu(new MMSliTelefonDekorasyoncusu(new BasitTelefon()));
		t.telefonOlustur();
	}

}

interface ITelefon{
	void telefonOlustur();
}
class BasitTelefon implements ITelefon{
	
	@Override
	public void telefonOlustur() {
		System.out.println("Basit Telefon oluşturuldu.");
	}
	
}

abstract class TelefonDekorasyoncusu implements ITelefon {
	protected ITelefon dekoreTelefon;
	
	public TelefonDekorasyoncusu(ITelefon telefon) {
		dekoreTelefon=telefon;
	}
		
}

class KameraliTelefonDekorasyoncusu extends TelefonDekorasyoncusu{

	public KameraliTelefonDekorasyoncusu(ITelefon telefon) {
		super(telefon);
	}

	@Override
	public void telefonOlustur() {
		// TODO Auto-generated method stub
		dekoreTelefon.telefonOlustur();
		kameraOzelligiEkle();
	}
	
	private void kameraOzelligiEkle() {
		// TODO Auto-generated method stub
		System.out.println("Kamera özelliği eklendi..");
	}
	
}

class MMSliTelefonDekorasyoncusu extends TelefonDekorasyoncusu{

	public MMSliTelefonDekorasyoncusu(ITelefon telefon) {
		super(telefon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void telefonOlustur() {
		// TODO Auto-generated method stub
		dekoreTelefon.telefonOlustur();
		mmsOzelligiEkle();
	}
	
	private void mmsOzelligiEkle() {
		// TODO Auto-generated method stub
		System.out.println("MMS özelliği Eklendi.");
	}
	
	
	
	
}

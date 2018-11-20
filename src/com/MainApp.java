package com;

public class MainApp {

	public static void main(String[] args) {
		Musteri m=new Musteri(null);
		m.odemeYap(new HizliOdeme());
		m.odemeYap(new NormalOdeme());
	}

}

interface SiparisOdemeTipi{
	
	OdemeTipi odeme();
	Bildirim  bildirim();
	
}

interface OdemeTipi{
	void faturaOde();
}

interface Bildirim{
	void mesajGonder();
}

class HizliOdeme implements SiparisOdemeTipi{

	@Override
	public OdemeTipi odeme() {
		return new HesapKarti();
	}

	@Override
	public Bildirim bildirim() {
		return new Sms();
	}
	
}

class NormalOdeme implements SiparisOdemeTipi{

	@Override
	public OdemeTipi odeme() {
		return new Havale();
	}

	@Override
	public Bildirim bildirim() {
		return new Eposta();
	}
	
}

class Sms implements Bildirim{

	@Override
	public void mesajGonder() {
		System.out.println("Mesajınız, SMS ile gönderilmiştir.");
	}
	
}

class Eposta implements Bildirim{
	
	@Override
	public void mesajGonder() {
		System.out.println("Mesajınız, E-Posta ile gönderilmiştir.");
	}
}

class Havale implements OdemeTipi{

	@Override
	public void faturaOde() {
		System.out.println("Fatura havale ile ödenmiştir.");
	}
	
}

class HesapKarti implements OdemeTipi{
	
	@Override
	public void faturaOde() {
		System.out.println("Hesap Kartı ile ödenmiştir.");
	}
}

class Musteri {
	SiparisOdemeTipi odemeTipi=null;
	public Musteri(SiparisOdemeTipi odemeTipi) {
		this.odemeTipi=odemeTipi;
	}
	public void odemeYap(SiparisOdemeTipi odemeTipi) {
		Bildirim b=odemeTipi.bildirim();
		OdemeTipi o=odemeTipi.odeme();
		b.mesajGonder();
		o.faturaOde();
	}
}
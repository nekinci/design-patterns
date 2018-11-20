package msg;

public class AbstractFactoryDesignPattern {
	public static void main(String[] args) {
		CMusteri m=new CMusteri();
		m.siparisVer(new HizliSiparis());
	}
}

interface ISiparis{
	Odeme odemeTipi();
	Bildirim bildirimTipi();
}

class NormalSiparis implements ISiparis{

	@Override
	public Odeme odemeTipi() {
		// TODO Auto-generated method stub
		return new Havale();
	}

	@Override
	public Bildirim bildirimTipi() {
		// TODO Auto-generated method stub
		return new Eposta1();
	}
	
}

class HizliSiparis implements ISiparis{

	@Override
	public Odeme odemeTipi() {
		// TODO Auto-generated method stub
		return new Kart();
	}

	@Override
	public Bildirim bildirimTipi() {
		// TODO Auto-generated method stub
		return new Sms();
	}
	
	
	
}

interface Odeme{
	public void hesapOde();
}

interface Bildirim{
	public void mesajGonder();
}

class Havale implements Odeme{
	@Override
	public void hesapOde() {
		System.out.println("Havale ile ödeniyor..");
	}
}

class Kart implements Odeme{
	@Override
	public void hesapOde() {
		System.out.println("Kart ile ödeniyor..");
	}
}

class Eposta1 implements Bildirim{
	@Override
	public void mesajGonder() {
		System.out.println("Mesaj e-posta ile gönderiliyor...");
	}
}

class Sms implements Bildirim{
	@Override
	public void mesajGonder() {
		System.out.println("Mesaj SMS ile gönderiliyor...");
	}
}

class CMusteri{
	private ISiparis siparis;
	private Odeme o;
	private Bildirim b;
	
	public CMusteri() {
		
	}
	
	public void siparisVer(ISiparis siparis) {
		this.siparis=siparis;
		b=siparis.bildirimTipi();
		o=siparis.odemeTipi();
		b.mesajGonder();
		o.hesapOde();
	}
}
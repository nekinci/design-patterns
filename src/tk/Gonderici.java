package tk;

interface SiparisFabrikasi{
	OdemeTipi1 odemeTipi();
	Bildirim1 bildirim();
}

interface OdemeTipi1{
	void paraGonder(int miktar);
}

interface Bildirim1{
	void mesajGonder(String message);
}

class HizliSiparis implements SiparisFabrikasi{

	public OdemeTipi1 odemeTipi() {
		return new Havale1();
	}

	public Bildirim1 bildirim() {
		return new Sms1();
	}
	
}

class NormalSiparis implements SiparisFabrikasi{

	public OdemeTipi1 odemeTipi() {
		return new PostaCeki1();
	}

	public Bildirim1 bildirim() {
		return new Eposta1();
	}
	
}

class Havale1 implements OdemeTipi1{

	public void paraGonder(int miktar) {
		System.out.println("Havale ile gönderilmiştir. "+miktar+"TL");
	}
	
}
class PostaCeki1 implements OdemeTipi1{

	public void paraGonder(int miktar) {
		System.out.println("Posta çekiyle gönderilmiştir. "+miktar+"TL");
	}
	
}

class Eposta1 implements Bildirim1{

	public void mesajGonder(String message) {
		System.out.println("Mesajınız : "+message+" , e-posta ile gönderilmiştir.");
	}
	
}

class Sms1 implements Bildirim1{

	public void mesajGonder(String message) {
		System.out.println("Mesajınız : "+message+" , SMS ile gönderilmiştir.");
	}
	
}

class Client {
	
	SiparisFabrikasi f;
	
	public Client(SiparisFabrikasi f1){
		f=f1;
	}
	public void calistir(String message,int miktar) {
		OdemeTipi1 o=f.odemeTipi();
		Bildirim1 b=f.bildirim();
		o.paraGonder(miktar);
		b.mesajGonder(message);
	}
	
	
	
	
}

public class Gonderici {
	
	public static void main(String[] args) {
		Client c=new Client(new HizliSiparis());
		c.calistir("aaa", 500);
		
	}

}

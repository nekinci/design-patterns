package other;

public class Program {

	public static void main(String[] args) {
		Musteri onbininciMusteri = new Musteri();
		onbininciMusteri.siparisVer(new NormalOdemeFabrikasi());
	}

}
class Musteri {
	
	String ad,soyad;
	public void siparisVer(ISiparisFabrikasi i) {
		OdemeTipi o=i.odemeTipi();
		BildirimTipi b=i.bildirimTipi();
		b.mesajGonder();
		o.paraGonder();
	}
	
}
interface ISiparisFabrikasi{
	public OdemeTipi odemeTipi();
	public BildirimTipi bildirimTipi();
}

class HizliOdemeFabrikasi implements ISiparisFabrikasi{

	public OdemeTipi odemeTipi() {
		return new Havale();
	}

	public BildirimTipi bildirimTipi() {
		return new SmS();
	}
	
}

class NormalOdemeFabrikasi implements ISiparisFabrikasi{

	public OdemeTipi odemeTipi() {
		return new PostaCeki();
	}

	public BildirimTipi bildirimTipi() {
		// TODO Auto-generated method stub
		return new Eposta();
	}
	
}

interface OdemeTipi{
	void paraGonder();
}

interface BildirimTipi{
	void mesajGonder();
}

class SmS implements BildirimTipi{

	public void mesajGonder() {
		System.out.println("Sipariş mesajı SMS");
	}
	
}

class Eposta implements BildirimTipi{
	public void mesajGonder() {
		System.out.println("Sipariş mesajı Eposta");
	}
}

class Havale implements OdemeTipi{

	public void paraGonder() {
		System.out.println("Ödeme tipi havale");
	}
	
}

class PostaCeki implements OdemeTipi{

	public void paraGonder() {
		System.out.println("Ödeme tipi Posta Çeki");
	}
	
}

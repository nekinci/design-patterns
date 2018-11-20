package msg;

import java.util.HashMap;

public class Mesagging {

	public static void main(String[] args) {
		AnaBilgisayar anabilgisayar=new AnaBilgisayar();
		Messager m=new Messager("niyazi", anabilgisayar);
		Messager m1=new Messager("ali", anabilgisayar);
		m.mesajGonder("ali", "nasılsın");
		m1.mesajGonder("niyazi", "kendine");
		
	}
}

interface Konu{
	void gozlemciyeHaberVer(Contacts c,String msg);

}

interface Gozlemci{
	void guncelle(String kimden,String message);
}

class AnaBilgisayar implements Konu{
	private HashMap<String,Contacts> kisiler=new HashMap<>(); 
	
	public void kisiEkle(String isim,Contacts c) {
		kisiler.put(isim, c);
		System.out.println(isim+" anabilgisayara bağlandı.");
	}
	
	public void mesajGonder(String kimden,String kime,String mesaj) {
		if(!kisiler.containsKey(kime))
			System.out.println("Böyle birisi yok.");
		else {
			System.out.println("Mesaj anabilgisayardan kişiye gönderiliyor..");
			kisiler.get(kime).mesajAlici(kimden,mesaj);
			gozlemciyeHaberVer(kisiler.get(kime), mesaj);
		}
	}

	@Override
	public void gozlemciyeHaberVer(Contacts c,String msg) {
		c.guncelle(c.isim, msg);
	}

}

abstract class Contacts implements Gozlemci{
	AnaBilgisayar anabilgisayar;
	String isim;
	public Contacts(String isim,AnaBilgisayar anabilgisayar) {
		this.anabilgisayar=anabilgisayar;
		this.isim=isim;
		anabilgisayar.kisiEkle(isim, this);
	}
	
	public abstract void mesajGonder(String kime,String mesaj);
	public abstract void mesajAlici(String kimden,String mesaj);
}

class Messager extends Contacts implements Gozlemci{
	
	public Messager(String isim,AnaBilgisayar anabilgisayar) {
		super(isim,anabilgisayar);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mesajGonder(String kime,String mesaj) {
		System.out.println("Kişi mesajı ana bilgisayara gönderiyor.");
		anabilgisayar.mesajGonder(isim,kime, mesaj);
	}

	@Override
	public void mesajAlici(String kimden, String mesaj) {
		System.out.println(kimden+" kişisindenden mesaj alındı.");
		System.out.println("Mesaj : "+mesaj);
	}

	@Override
	public void guncelle(String kimden, String message) {
		System.out.println("Bildirim: "+kimden +" adlı kişiden 1 yeni mesajınız var: "+message);
	}
	
	
	
}
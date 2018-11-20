package structal;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		EkipUyesi u1=new EkipUyesi("Niyazi", "10000");
		EkipUyesi u2=new EkipUyesi("Ali", "7000");
		EkipUyesi u3=new EkipUyesi("Serkan", "2150");
		EkipUyesi u4=new EkipUyesi("Veli", "4750");
		EkipUyesi u5=new EkipUyesi("Bulut", "4875");
		
		EkipPatronu p1=new EkipPatronu("Cengiz", "17450");
		EkipPatronu p2=new EkipPatronu("Serkan", "12500");
		EkipPatronu buyukBaskan=new EkipPatronu("Abdullah", "21245");
		
		p1.uyeEkle(u1);
		p1.uyeEkle(u3);
		p1.uyeEkle(u5);
		
		p2.uyeEkle(u2);
		p2.uyeEkle(u4);
		
		buyukBaskan.uyeEkle(p1);
		buyukBaskan.uyeEkle(p2);
		
		buyukBaskan.bilgiGetir();
	}

}

abstract class Kisi{
	String ad,maas;
	public Kisi(String ad,String maaas) {
		this.ad=ad;this.maas=maaas;
	}
	
	public abstract void bilgiGetir();
}

class EkipUyesi extends Kisi{

	public EkipUyesi(String ad, String maaas) {
		super(ad, maaas);
	}
	@Override
	public void bilgiGetir() {
		System.out.println(ad+" "+maas);
	}
	
}

class EkipPatronu extends Kisi{
	
	private ArrayList<Kisi> uyeler=new ArrayList<Kisi>();
	
	public void uyeEkle(Kisi i) {
		uyeler.add(i);
	}
	
	
	public EkipPatronu(String ad, String maaas) {
		super(ad, maaas);
	}
	
	@Override
	public void bilgiGetir() {
		System.out.println("Patron: "+ad+" "+maas);
		for(Kisi i:uyeler) {
			i.bilgiGetir();
		}
	}
	
}

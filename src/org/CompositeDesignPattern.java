package org;

import java.util.ArrayList;


public class CompositeDesignPattern {

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

abstract class Isci{
	String ad,soyad;

	public Isci(String ad, String soyad) {
		super();
		this.ad = ad;
		this.soyad = soyad;
	}
	
	public abstract void bilgiGetir();
}

class EkipUyesi extends Isci{

	public EkipUyesi(String ad, String soyad) {
		super(ad, soyad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bilgiGetir() {
		System.out.println("Ekip Üyesi: "+ad+" "+soyad);
	}
	
}

class EkipPatronu extends Isci{

	private ArrayList<Isci> uyeler=new ArrayList<Isci>();
	public EkipPatronu(String ad, String soyad) {
		super(ad, soyad);
		// TODO Auto-generated constructor stub
	}
	
	public void uyeEkle(Isci i) {
		uyeler.add(i);
	}
	@Override
	public void bilgiGetir() {
		System.out.println("Ekip Patronu: "+ad+" "+soyad);
		for(Isci i:uyeler) {
			i.bilgiGetir();
		}
	}
	
}

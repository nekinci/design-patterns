package davranissal;

import java.util.ArrayList;
import java.util.List;

public class Satici {

	public static void main(String[] args) {
		FiyatKonusu konu = new FiyatKonusu();
		konu.gozlemciEkle(new Musteri());
		konu.gozlemciEkle(new Musteri2());
		konu.fiyatDegistir(5);
		konu.fiyatDegistir(10);
	}

}

interface Konu {
	void gozlemcilereHaberVer();
	void gozlemciEkle(FiyatGozlemcisi gozlemci);
}

interface FiyatGozlemcisi {
	void guncelle (long yeniFiyat);
}

class FiyatKonusu implements Konu {

	private List <FiyatGozlemcisi> gozlemciListesi = new ArrayList<FiyatGozlemcisi>();
	private long fiyat;
	
	public void gozlemcilereHaberVer() {
		for(FiyatGozlemcisi gozlemci : gozlemciListesi)
			gozlemci.guncelle(fiyat);
	}
	
	public void gozlemciEkle(FiyatGozlemcisi gozlemci) {
		gozlemciListesi.add(gozlemci);
	}
	public void fiyatDegistir(long fiyat) {
		// TODO Auto-generated method stub
		this.fiyat=fiyat;
		gozlemcilereHaberVer();
	}
}

class Musteri implements FiyatGozlemcisi {

	public void guncelle(long yeniFiyat) {
		System.out.println("Müşteri 1 yeni fiyatı öğrendi. "+ yeniFiyat);
	}
	
}

class Musteri2 implements FiyatGozlemcisi{
	
	public void guncelle(long yeniFiyat) {
		System.out.println("Müşteri 2 yeni fiyatı öğrendi. "+ yeniFiyat);
	}
}

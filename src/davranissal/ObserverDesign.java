package davranissal;

import java.util.ArrayList;

public class ObserverDesign {

	public static void main(String[] args) {
		FiyatKonusu1 f=new FiyatKonusu1();
		f.gozlemciEkle(new Musteri1());
		f.gozlemciEkle(new Musteri1());
		f.gozlemciEkle(new Musteri1());
		f.paraDegistir(5);
	}
}

interface Konu1 {
	void gozlemcilereHaberVer();
	void gozlemciEkle(FiyatGozlemcisi1 gozlemci);
}

interface FiyatGozlemcisi1 {
	void guncelle(long fiyat);
}

class FiyatKonusu1 implements Konu1{
	private ArrayList<FiyatGozlemcisi1 > gozlemciler=new ArrayList<FiyatGozlemcisi1>();
	long fiyat;
	public void gozlemcilereHaberVer() {
		for(FiyatGozlemcisi1 g: gozlemciler)
			g.guncelle(fiyat);
	}

	public void gozlemciEkle(FiyatGozlemcisi1 gozlemci) {
		gozlemciler.add(gozlemci);
	}
	
	public void paraDegistir(long fiyat) {
		this.fiyat=fiyat;
		gozlemcilereHaberVer();
	}
	
}

class Musteri1 implements FiyatGozlemcisi1{
	
	public void guncelle(long fiyat) {
		System.out.println("Müşteri haberdar oldu. "+fiyat);
	}
}
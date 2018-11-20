package net;

import java.util.ArrayList;

public class ObserverDesignPattern {

	public static void main(String[] args) {
		FiyatKonusu f=new FiyatKonusu();
		f.gozlemciEkle(new Gozlemci());
		f.gozlemciEkle(new Gozlemci());
		f.gozlemcilereHaberVer();
		f.degisiklik();
	}

}

interface Konu{
	void gozlemciEkle(FiyatGozlemcisi g);
	void gozlemcilereHaberVer();
}

interface FiyatGozlemcisi{
	void guncelle();
}

class FiyatKonusu implements Konu{
	
	private ArrayList<FiyatGozlemcisi> gozlemciler=new ArrayList<>();
	
	@Override
	public void gozlemciEkle(FiyatGozlemcisi g) {
		gozlemciler.add(g);
	}

	@Override
	public void gozlemcilereHaberVer() {
		for(FiyatGozlemcisi g:gozlemciler) {
			g.guncelle();
		}
	}
	
	public void degisiklik() {
		System.out.println("Değişiklik oldu");
		gozlemcilereHaberVer();
	}
	
}

class Gozlemci implements FiyatGozlemcisi{

	@Override
	public void guncelle() {
		System.out.println("Güncellemeden haberdar olundu.");
	}
	
}


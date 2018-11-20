package msg;

import java.util.ArrayList;

public class ObserverPattern {

	public static void main(String[] args) {
		FiyatKonusu konu = new FiyatKonusu();
		konu.gozlemciEkle(new Gozlemci1());
		konu.gozlemciEkle(new Gozlemci1());
		konu.haberVer();
		
	}

}

interface IKonu {
	void gozlemciEkle(IGozlemci g);
	void haberVer();
}

interface IGozlemci{
	void guncelle();
}

class FiyatKonusu implements IKonu{

	private ArrayList<IGozlemci> gozlemciler = new ArrayList<>();
	
	@Override
	public void gozlemciEkle(IGozlemci g) {
		gozlemciler.add(g);
	}

	@Override
	public void haberVer() {
		for(IGozlemci g : gozlemciler)
			g.guncelle();
	}
	
}

class Gozlemci1 implements IGozlemci{

	@Override
	public void guncelle() {
		System.out.println("Fiyattan haberdar olundu!");
	}
	
}
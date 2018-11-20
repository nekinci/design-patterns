package org;

public class ProxyDesignPattern {

	public static void main(String[] args) {
		GercekGoruntuDosyasi d=new GercekGoruntuDosyasi("1.jpg");
		d.goruntuyuGoster();
		d.goruntuyuGoster();
		OzdesGoruntuDosyasi d1=new OzdesGoruntuDosyasi("2.jpg");
		d1.goruntuyuGoster();
		d1.goruntuyuGoster();
	}

}

abstract class GoruntuDosyasi{
	String isim;
	public GoruntuDosyasi(String isim) {
		this.isim=isim;
	}
	
	public abstract void goruntuyuGoster();
}

class GercekGoruntuDosyasi extends GoruntuDosyasi{

	public GercekGoruntuDosyasi(String isim) {
		super(isim);
		goruntuyuSabitDisktenYukle();
	}

	@Override
	public void goruntuyuGoster() {
		System.out.println(isim+" dosyasi gösterildi.");
	}
	
	private void goruntuyuSabitDisktenYukle() {
		// TODO Auto-generated method stub
		//TODO pahalı ve zaman alıcı bir işlem
		System.out.println("Görüntü("+isim+") sabit diskten yüklendi.");
	}
	
}

class OzdesGoruntuDosyasi extends GoruntuDosyasi{
	GoruntuDosyasi dosya=null;
	public OzdesGoruntuDosyasi(String isim) {
		super(isim);
		goruntuyuSabitDisktenYukle();
	}

	@Override
	public void goruntuyuGoster() {
		System.out.println(isim+" dosyasi gösterildi.");
	}
	
	private void goruntuyuSabitDisktenYukle() {
		// TODO Auto-generated method stub
		if(dosya==null)
			dosya=new GercekGoruntuDosyasi(isim);
		dosya.goruntuyuGoster();
	}
}
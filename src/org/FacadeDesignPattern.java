package org;

public class FacadeDesignPattern {

	public static void main(String[] args) {
		new Bilgisayar().ac();
	}

}

class Bilgisayar{
	public void ac() {
		Islemci i=new Islemci();
		Bellek b=new Bellek();
		SabitDisk d=new SabitDisk();
		
		i.ac();
		i.konumlan("0001");
		i.calis();
		d.oku("0001", "25");
		b.yukle("0002", "Sabit Disk");
	}
}

class Bellek{

	public void yukle(String adres,String bilgi) {
		System.out.println("Bellek: "+ bilgi +"sini "+adres+" adresine yükledi.");
	}
}

class Islemci {
	public void ac() {
		System.out.println("İşlemci açıldı.");
	}
	public void konumlan(String adres) {
		System.out.println("İşlemci "+adres+" adresine konumlandı.");
	}
	public void calis() {
		System.out.println("İşlemci açıldı.");
	}
}

class SabitDisk{
	public void oku(String baslangicAdresi,String uzunluk) {
		System.out.println(baslangicAdresi+" nden başlanıp "+uzunluk+" uzunlukta bilgi okundu.");
	}
}


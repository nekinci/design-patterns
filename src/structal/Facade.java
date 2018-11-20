package structal;

public class Facade {

	public static void main(String[] args) {
		Bilgisayar1 b=new Bilgisayar1();
		b.ac();
	}

}

class Bellek {
	public void yukle(String adres,String bilgi) {
		System.out.println("Bellek "+adres + "ine " + bilgi + "sini yükledi." );
	}
}

class Islemci {
	public void acil() {
		System.out.println("İşlemci açıldı.");
	}
	
	public void konumlan(String adres) {
		System.out.println("İşlemci " + adres + "ine konumlandi.");
	}
	
	public void calis() {
		System.out.println("İşlemci çalıştı.");
	}
}

class SabitDisk {
	public String oku(String baslangicAdresi,String uzunluk) {
		
		System.out.println("Sabit disk "+baslangicAdresi+" 'nden " +uzunluk+ " da bilgiyi okudu.");
		
		return "Okunan bilgi";
	}
}

class Bilgisayar1 {
	
	public void ac() {
		Islemci i=new Islemci();
		Bellek b=new Bellek();
		SabitDisk d=new SabitDisk();
		i.acil();
		String acilisBilgisi=d.oku("45556", "1500");
		b.yukle("15222262", acilisBilgisi);
		i.konumlan("15222262");
		i.calis();
	}
	
	
}
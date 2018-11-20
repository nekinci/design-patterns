package co;

import java.util.ArrayList;
//COMPOSİTE DESİGN PATTERN
/* @author nekinci */
public class MainApp {

	public static void main(String[] args) {
		EkipUyesi u1=new EkipUyesi("Niyazi", "1000 TL");
		EkipUyesi u2=new EkipUyesi("Ahmet", "3000 TL");
		EkipUyesi u3=new EkipUyesi("Ali", "2500 TL");
		EkipUyesi u4=new EkipUyesi("Veli", "7000 TL");
		EkipUyesi u5=new EkipUyesi("Celal", "2100 TL");
		
		EkipYoneticisi y1=new EkipYoneticisi("Patron1", "10000 TL");
		EkipYoneticisi y2=new EkipYoneticisi("Serkan", "9500 TL");
		EkipYoneticisi basYonetici=new EkipYoneticisi("Hakan", "12500 TL");
		
		y1.uyeEkle(u1);
		y1.uyeEkle(u4);
		y1.uyeEkle(u5);
		
		y2.uyeEkle(u2);
		y2.uyeEkle(u3);
		
		basYonetici.uyeEkle(y1);
		basYonetici.uyeEkle(y2);
		
		//ağaç şeklinde bütün hepsini yazdırır.
		basYonetici.bilgiYazdir();
		
	}

}

interface IIsci{
	void bilgiYazdir();
}

class EkipUyesi implements IIsci{
	
	private String isim,maas;
	
	public EkipUyesi(String isim,String maas) {
		this.isim=isim;this.maas=maas;
	}
	
	public void bilgiYazdir() {
		System.out.println("İsim "+isim+ ", Maaş: "+maas);
	}
	
}

class EkipYoneticisi implements IIsci{
	String isim,maas;
	private ArrayList<IIsci> uye=new ArrayList<IIsci>();
	
	public void bilgiYazdir() {
		System.out.println("Ekip Patronu: "+isim+" "+maas);
		for(IIsci ekipUyesi: uye) {
			ekipUyesi.bilgiYazdir();
		}
	}
	public EkipYoneticisi(String isim,String maas) {
		this.isim=isim;this.maas=maas;
	}
	public void uyeEkle(IIsci i) {
		uye.add(i);
	}
	public void uyeCikar(IIsci i) {
		uye.remove(i);
	}
	
}

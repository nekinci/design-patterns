package biz;

public class Asci {
	private PideKurucu pide;
	
	public void pideKurucuAta(PideKurucu pide) {
		this.pide=pide;
	}
	
	public Pide pideAl() {
		return pide.pideAl();
	}
	
	public void pideyiKur() {
		//pide aşamalar halinde kuruluyor.
		//önce nesne oluşturulup sonra da malzemeler ekleniyor
		pide.pideYap();
		pide.malzemeKur();
		pide.hamurKur();
		pide.baharatKur();
	}
}

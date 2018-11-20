package co;

public class Satici {

	public static void main(String[] args) {
		Musteri musteri=new Musteri("000", "ek", "Nevşehir der", "Kaymakli", "Nevşehir", "Türkiye");
		
		//artık müşteri sınıfıda adaptör sayesinde adres sınıfı oldu:...
		
		MusteriFaturaAdresiAdaptoru adaptor=new MusteriFaturaAdresiAdaptoru(musteri);
		final Adres adres=adaptor;
		System.out.println(adres.getSemt());
		System.out.println(new IsAdresi().getSemt());
	}
	

}

interface Adres{
	String getAcikAdres();
	String getSemt();
	String getSehir();
	String getUlke();
}

class IsAdresi implements Adres{

	public String getAcikAdres() {
		return "Gül Mah. Osman sok. NO:15";
	}

	public String getSemt() {
		return "Beşiktaş";
	}

	public String getSehir() {
		return "İstanbul";
	}

	public String getUlke() {
		return "Türkiye";
	}
	
}

class Musteri {
	private String numara,aciklama,acikAdres,semt,sehir,ulke;

	public Musteri(String numara, String aciklama, String acikAdres, String semt, String sehir, String ulke) {
		this.numara = numara;this.aciklama = aciklama;this.acikAdres = acikAdres;
		this.semt = semt;this.sehir = sehir;this.ulke = ulke;
	}
	
	public String getNumara() {
		return numara;
	}
	
	public String getAcikAdres() {
		return acikAdres;
	}
	
	public String getAciklama() {
		return aciklama;
	}
	
	public String getSehir() {
		return sehir;
	}
	
	public String getSemt() {
		return semt;
	}
	
	public String getUlke() {
		return ulke;
	}
	
}

class MusteriFaturaAdresiAdaptoru implements Adres{
	Musteri musteri;
	
	public MusteriFaturaAdresiAdaptoru(Musteri m) {
		musteri=m;
	}
	
	public String getAcikAdres() {
		return musteri.getAcikAdres();
	}

	public String getSemt() {
		return musteri.getSemt();
	}

	public String getSehir() {
		return musteri.getSehir();
	}

	public String getUlke() {
		return musteri.getUlke();
	}
	
}

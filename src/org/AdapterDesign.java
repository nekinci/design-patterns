package org;

public class AdapterDesign {

	public static void main(String[] args) {
		Musteri m=new Musteri("aa", "bb", "cc", "dd");
		MusteriFaturasiAdaptoru adaptor=new MusteriFaturasiAdaptoru(m);
		Adres a=adaptor;
		System.out.println(a.AcikAdres());
	}

}


interface Adres{
	String Sehir();
	String Ilce();
	String Ulke();
	String AcikAdres();
}

class Musteri{
	String Sehir,Ilce,Ulke,AcikAdres;

	public Musteri(String sehir, String ilce, String ulke, String acikAdres) {
		super();
		Sehir = sehir;
		Ilce = ilce;
		Ulke = ulke;
		AcikAdres = acikAdres;
	}
	
}

class MusteriFaturasiAdaptoru implements Adres{
	private Musteri musteri;
	@Override
	public String AcikAdres() {
		return musteri.AcikAdres;
	}
	public MusteriFaturasiAdaptoru(Musteri m) {
		// TODO Auto-generated constructor stub
		musteri=m;
	}
	@Override
	public String Ilce() {
		// TODO Auto-generated method stub
		return musteri.Ilce;
	}
	@Override
	public String Sehir() {
		// TODO Auto-generated method stub
		return musteri.Sehir;
	}
	@Override
	public String Ulke() {
		// TODO Auto-generated method stub
		return musteri.Ulke;
	}
}

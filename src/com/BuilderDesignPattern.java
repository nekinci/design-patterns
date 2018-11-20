package com;

public class BuilderDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Muhendis ali=new Muhendis(new ApartmanInsaati(new Insaat()));
		ali.binayiYap("bence", "sence", "onca");
	}

}

 class Insaat{
	String malzeme="";
	String beton="";
	String boya="";
	
	public void malzemeyiKur(String malzeme) {
		this.malzeme=malzeme;
		System.out.println("Malzemeler: "+malzeme);
	}
	
	public void betonuKur(String beton) {
		this.beton=beton;
		System.out.println("Beton :"+beton);
	}
	
	public void boyayiKur(String boya) {
		this.boya=boya;
		System.out.println("Boya :"+boya);
	}
	
}

abstract class InsaatKurucu{
	protected Insaat insaat;
	public InsaatKurucu(Insaat insaat) {
		this.insaat=insaat;
	}
	
	public abstract void malzemeyiKur(String malzeme);
	public abstract void betonuKur(String beton);
	public abstract void boyayiKur(String boya);
	
}

class EvInsaati extends InsaatKurucu{

	public EvInsaati(Insaat insaat) {
		super(insaat);
	}

	@Override
	public void malzemeyiKur(String malzeme) {
		insaat.malzemeyiKur(malzeme);
	}

	@Override
	public void betonuKur(String beton) {
		insaat.betonuKur(beton);
	}

	@Override
	public void boyayiKur(String boya) {
		insaat.boyayiKur(boya);
	}
	
}

class ApartmanInsaati extends InsaatKurucu{

	public ApartmanInsaati(Insaat insaat) {
		super(insaat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void malzemeyiKur(String malzeme) {
		insaat.malzemeyiKur(malzeme);
	}

	@Override
	public void betonuKur(String beton) {
		// TODO Auto-generated method stub
		insaat.betonuKur(beton);
	}

	@Override
	public void boyayiKur(String boya) {
		// TODO Auto-generated method stub
		insaat.boyayiKur(boya);
	}
	
}

class Muhendis {
	
	private InsaatKurucu insaatKur;
	
	public Muhendis(InsaatKurucu insaatKur) {
		this.insaatKur=insaatKur;
	}
	
	public void binayiYap(String malzeme,String beton,String boya) {
		insaatKur.malzemeyiKur(malzeme);
		insaatKur.betonuKur(beton);
		insaatKur.boyayiKur(boya);
	}
	
	
}
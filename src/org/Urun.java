package org;

enum Markalar{
	Sony,Samsung,Vestel
}
public abstract class Urun {
	public abstract void markaAl();
}
class Marka1 extends Urun{
	@Override
	public void markaAl() {
		System.out.println("Sony markası");
	}
}
class Marka2 extends Urun{
	@Override
	public void markaAl() {
		System.out.println("Samsung markası");
	}
}
class Marka3 extends Urun{
	@Override
	public void markaAl() {
		System.out.println("Vestel markası");
	}
}

class Olusturucu{
	public Urun fabrikaMetodu(Markalar m){
		Urun u=null;
		if(m==Markalar.Sony)
			u=new Marka1();
		if(m==Markalar.Samsung)
			u=new Marka2();
		if(m==Markalar.Vestel)
			u=new Marka3();
		return u;
	}
}
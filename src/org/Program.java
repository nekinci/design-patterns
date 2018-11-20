package org;
public class Program {

	public static void main(String[] args) {
		Uretici u=new Uretici();
		Product p1=u.FactoryMethod(Ulkeler.Türkiye);
		Product p2=u.FactoryMethod(Ulkeler.İspanya);
		Product p3=u.FactoryMethod(Ulkeler.Amerika);
		
		p1.Konus();
		p3.Konus();
		p2.Konus();
		
		Olusturucu o=new Olusturucu();
		Urun u1=o.fabrikaMetodu(Markalar.Sony);
		Urun u2=o.fabrikaMetodu(Markalar.Vestel);
		Urun u3=o.fabrikaMetodu(Markalar.Samsung);
		
		u1.markaAl();
		u2.markaAl();
		u3.markaAl();
		
		SoyutUretici ureten[] = {new Uretici1(),new Uretici2(),new Uretici3()};
		for(SoyutUretici i:ureten){
			Product1 pro=i.factoryMethod();
			pro.Konus();
		}
	}

}

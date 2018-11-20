package com;


public class Program{
	public static void main(String[] args) {
		AbstractFactory factory1=new ConcreteFactory1();
		Client c1=new Client(factory1);
		c1.run1();
		AbstractFactory factory2=new ConcreteFactory2();
		Client c2=new Client(factory2);
		c2.run1();
		
		SoyutFabrika s1=new Fabrika1();
		Istemci i1=new Istemci(s1);
		i1.calistir();
		
		SoyutFabrika s2=new Fabrika2();
		Istemci i2=new Istemci(s2);
		i2.calistir();
		
		SoyutTesis u=new Ulker();
		Musteri m1=new Musteri(u);
		m1.oranAl(6);
		SoyutTesis t=new Torku();
		Musteri m2=new Musteri(t);
		m2.oranAl(14);
		
		Builder b;
		Director d=new Director();
		
		b=new  ABuilder();
		d.BilgisayarUret(b);
		System.out.println(b.getComputer().toString());
		
		b=new BBuilder();
		d.BilgisayarUret(b);
		System.out.println(b.getComputer().toString());
		
		Uretici c;
		Direction d1=new Direction();
		
		c=new AUreticisi();
		d1.TelefonUret(c);
		System.out.println(c.urun.toString());
		
		c=new BUreticisi();
		d1.TelefonUret(c);
		System.out.println(c.urun.toString());
	}
}
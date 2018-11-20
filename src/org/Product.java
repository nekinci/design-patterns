package org;

enum Ulkeler{
	Türkiye,İspanya,Amerika
}
public abstract class Product {
	public abstract void Konus();
}
class Urun1 extends Product{
	@Override
	public void Konus() {
		System.out.println("Türkiye için : Merhaba Dünya");
	}
}
class Urun2 extends Product{
	@Override
	public void Konus() {
		System.out.println("İspanya için : Hola Mundo");
	}
}
class Urun3 extends Product{
	@Override
	public void Konus() {
		System.out.println("Amerika için : Hello World");
	}
}
class Uretici{
	public Product FactoryMethod(Ulkeler ulke){
		Product pro=null;
		switch(ulke){
			case Türkiye: pro=new Urun1();break;
			case İspanya: pro=new Urun2();break;
			case Amerika: pro=new Urun3();break;
			default: break;
		}
		return pro;
	}
	
}

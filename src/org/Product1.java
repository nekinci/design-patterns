package org;

enum Ulkeler1{
	Türkiye,İspanya,Amerika
}
public abstract class Product1 {
	public abstract void Konus();
}

class Pro1 extends Product1{
	@Override
	public void Konus() {
		System.out.println("Türkiye için : Merhaba Dünya");
	}
}
class Pro2 extends Product1{
	@Override
	public void Konus() {
		System.out.println("İspanya için: Hola Mundo");
	}
}
class Pro3 extends Product1{
	@Override
	public void Konus() {
		System.out.println("Amerika için: Hello World");
	}
}
abstract class SoyutUretici{
	public abstract Product1 factoryMethod();
}
class Uretici1 extends SoyutUretici{
	@Override
	public Product1 factoryMethod() {
		return new Pro1();
	}
}
class Uretici2 extends SoyutUretici{
	@Override
	public Product1 factoryMethod() {
		return new Pro2();
	}
}
class Uretici3 extends SoyutUretici{
	@Override
	public Product1 factoryMethod() {
		return new Pro3();
	}
}

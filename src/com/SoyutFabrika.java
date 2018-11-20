package com;


public abstract class SoyutFabrika {  // soyut fabrika da soyut ürün oluşturma metodu olur.
	public abstract SoyutUrun1 urunOlustur1();
	public abstract SoyutUrun2 urunOlustur2();
}
class Fabrika1 extends SoyutFabrika{

	public SoyutUrun1 urunOlustur1() {
		return new Urun1();
	}
	public SoyutUrun2 urunOlustur2() {
		return new Urun2();
	
	} // Gerçek fabrika soyut fabrikadaki olanları gerçekler.
}
class Fabrika2 extends SoyutFabrika{

	public SoyutUrun1 urunOlustur1() {
		return new Urun1();
	}

	public SoyutUrun2 urunOlustur2() {
		return new Urun2();
	}
	
}
abstract class SoyutUrun1{

}
abstract class SoyutUrun2{
	public abstract void karsilastir(SoyutUrun1 a);
}
class Urun1 extends SoyutUrun1{
	
}
class Urun2 extends SoyutUrun2{

	public void karsilastir(SoyutUrun1 a) {
		System.out.println(a.getClass().getName()+" ile "+this.getClass().getName());
	}
	
}
class Istemci{
	private SoyutUrun1 s1;
	private SoyutUrun2 s2;
	public Istemci(SoyutFabrika s){
		s1=s.urunOlustur1();
		s2=s.urunOlustur2();
	}
	public void calistir(){
		s2.karsilastir(s1);
	}
}


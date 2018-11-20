package com;

public abstract class SoyutTesis {
	public abstract Biskuvi biskuviOlustur();  //Soyut Bir tesis var
	public abstract Kek kekOlustur(); //ve Soyut ürünleri var. 
}
class Ulker extends SoyutTesis{

	public Biskuvi biskuviOlustur() {   //Soyut tesisden üretilmiş gerçek bir tesis var
		return new Yulafli();	//Soyut Tesisdeki özellikleri kullanıyor
	}

	public Kek kekOlustur() {
		return new Uzumlu();
	}
	
}
class Torku extends SoyutTesis{

	public Biskuvi biskuviOlustur() {
		return new Yulafli();  //yine aynı şekilde soyut tesisden üretilmiş gerçek bir fabrika
	}

	public Kek kekOlustur() {
		return new Uzumlu();
	}
	
}
abstract class Biskuvi{
	public void ozelligimNe(){
		System.out.println("Bütün bisküviler atıştırmalıktır.");
	}
	public abstract void cikolataOrani(int oran); //soyut ürün ve ürünün soyut özellikleri yer alıyor
	//yani burda soyut ürün var bundan sonraki ürünler burdakiler gibi olur
}
abstract class Kek{
	public void ozelligimNe(){
		System.out.println("Ben kekim");
	}
	public abstract void uzumOrani(int oran);
}

class Yulafli extends Biskuvi{

	public void cikolataOrani(int oran) {
		System.out.println("Yulaflı bisküvi çikolata oranı : %"+oran);
	}
	
}
class Uzumlu extends Kek{

	public void uzumOrani(int oran) {
		System.out.println("Uzumlu kek bisküvi oranı : %"+oran);
	}
	
}
class Musteri {
	private Kek k1;
	private Biskuvi b1;
	public Musteri(SoyutTesis t){
		k1=t.kekOlustur();
		b1=t.biskuviOlustur();
	}
	public void oranAl(int a){
		k1.uzumOrani(a);
		b1.cikolataOrani(a);
	}
	
}
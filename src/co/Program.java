package co;

public class Program {

	public static void main(String[] args) {
		
	}

}

interface IAlanHesapla{
	int alanHesapla(int a,int b);
}

class Kare implements IAlanHesapla{

	public int alanHesapla(int a, int b) {
		return a*b;
	}
	
}

class DikUcgen implements IAlanHesapla{
	
	public int alanHesapla(int a, int b) {
		return (a*b)/2;
	}
}

class Dikdortgen {
	
	public int calculateField(int a,int b) {
		return a*b;
	}
	
}

class AdapterDikdortgen implements IAlanHesapla{
	
	private Dikdortgen d=new Dikdortgen();
	
	private int bir,iki;
	
	public void setBir(int bir) {
		this.bir = bir;
	}
	
	public void setIki(int iki) {
		this.iki = iki;
	}
	
	public int getBir() {
		return bir;
	}
	
	public int getIki() {
		return iki;
	}
	
	public int alanHesapla(int a, int b) {
		setBir(a);
		setIki(b);
		
		return d.calculateField(a, b);
	}
}
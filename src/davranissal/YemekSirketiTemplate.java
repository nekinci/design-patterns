package davranissal;

public class YemekSirketiTemplate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		YemekYapici [] y=new YemekYapici[2];
		y[0]=new CorbaYapici();
		y[1]=new PilavYapici();
		
		y[0].yemekYap();
		y[1].yemekYap();
	}

}

abstract class YemekYapici{
	public void yemekYap() {
		
		malzemeleriHazirla();
		pisir();
		servisYap();
	}
	
	public abstract void malzemeleriHazirla();
	public abstract void pisir();
	public abstract void servisYap();
	
}

class CorbaYapici extends YemekYapici{

	@Override
	public void malzemeleriHazirla() {
		System.out.println("Çorba malzemeleri hazırlandı.");
	}

	@Override
	public void pisir() {
		System.out.println("Çorba pişirildi.");
	}

	@Override
	public void servisYap() {
		System.out.println("Çorba servis edildi.");
	}
	
	
}

class PilavYapici extends YemekYapici{

	@Override
	public void malzemeleriHazirla() {
		System.out.println("Pilav malzemeleri hazırlandı.");
	}

	@Override
	public void pisir() {
		System.out.println("Pilav pişirildi.");
	}

	@Override
	public void servisYap() {
		System.out.println("Pilav servisi yapıldı.");
	}
	
	
}
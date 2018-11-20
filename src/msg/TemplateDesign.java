package msg;

public class TemplateDesign {

	public static void main(String[] args) {
		Yemek y=new Corba();
		Yemek y1=new Makarna();
		y.yemekYap();
		y1.yemekYap();
	}

}

abstract class Yemek{
	
	public void yemekYap() {
		malzemeleriHazirla();
		pisir();
		servisYap();
	}
	
	public abstract void malzemeleriHazirla();
	public abstract void pisir();
	public abstract void servisYap();
}

class Corba extends Yemek{

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
		System.out.println("Çorba servisi yapıldı.");
	}
	
}

class Makarna extends Yemek{

	@Override
	public void malzemeleriHazirla() {
		System.out.println("Makarna malzemeleri hazırlandı.");
	}

	@Override
	public void pisir() {
		System.out.println("Makarna pişirildi.");
	}

	@Override
	public void servisYap() {
		System.out.println("Makarna servis edildi.");
	}
	
}
package davranissal;

public class ZincirSinamasi {

	public static void main(String[] args) {
		Islev zincir ,zincir1,zincir2;
		zincir1=new IslevA();
		zincir=zincir1.sonrakiniAyarla(new IslevC());
		zincir=zincir.sonrakiniAyarla(new IslevB());
		zincir2=new IslevC();
		zincir2.sonrakiniAyarla(new IslevA());
		
		zincir1.calistir("veri1");
		zincir2.calistir("veri2");
	}

}

abstract class Islev {

	Islev sonrakiIslev;
	
	protected Islev sonrakiniAyarla(Islev islev) {
		this.sonrakiIslev=islev;
		return islev;
	}
	
	protected void calistir(String islemVerisi) {
		isleviYerineGetir(islemVerisi);
		if(sonrakiIslev!=null)
			sonrakiIslev.isleviYerineGetir(islemVerisi);
	}
	protected abstract void isleviYerineGetir(String islemVerisi);
	
}

class IslevA extends Islev{

	@Override
	protected void isleviYerineGetir(String islemVerisi) {
		System.out.println("İşlev A yapıldı "+islemVerisi);
	}
	
}

class IslevB extends Islev{

	@Override
	protected void isleviYerineGetir(String islemVerisi) {
		System.out.println("İşlev B yapıldı "+islemVerisi);
	}
	
}

class IslevC extends Islev{

	@Override
	protected void isleviYerineGetir(String islemVerisi) {
		System.out.println("İşlev C yapıldı "+islemVerisi);
	}
	
}
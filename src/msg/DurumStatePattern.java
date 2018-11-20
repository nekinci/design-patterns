package msg;

public class DurumStatePattern {

	public static void main(String[] args) {
		Hesap1 h=new Hesap1();
		h.bakiyeGoruntule();
		h.paraCek();
		h.setHesapDurumu(new Altin1Hesap());
		h.bakiyeGoruntule();
		h.paraCek();
	}

}

interface HesapDurumu{
	void paraCek();
	void bakiyeGoruntule();
}

class Altin1Hesap implements HesapDurumu{
	
	@Override
	public void paraCek() {
		System.out.println("Altın hesaptan para çekiliyor...");
	}
	
	@Override
	public void bakiyeGoruntule() {
		System.out.println("Altın hesap bakiyesi : XXXX TL");
	}
}

class NormalHesap1 implements HesapDurumu{
	
	@Override
	public void paraCek() {
		System.out.println("Normal hesaptan para çekiliyor...");
	}
	
	@Override
	public void bakiyeGoruntule() {
		System.out.println("Normal hesap bakiyesi : XXXX TL");
	}
}

class Hesap1{
	HesapDurumu hesapDurumu;
	
	public Hesap1() {
		hesapDurumu=new NormalHesap1();
	}
	public void setHesapDurumu(HesapDurumu hesapDurumu) {
		this.hesapDurumu = hesapDurumu;
	}
	
	public void paraCek() {
		hesapDurumu.paraCek();
	}
	
	public void bakiyeGoruntule() {
		hesapDurumu.bakiyeGoruntule();
	}
}

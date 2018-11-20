package davranissal;

public class Durum {

	public static void main(String[] args) {
		Hesap h=new Hesap();
		h.bakiyeOgren();
		h.paraCek();
		h.durumDegistir(new AltinHesap());
		h.bakiyeOgren();
		h.paraCek();
	}

}

interface HesapDurumu{
	void paraCek();
	void bakiyeOgren();
}

class NormalHesap implements HesapDurumu{

	public void paraCek() {
		System.out.println("Normal hesaptan para çekiliyor.");
	}

	public void bakiyeOgren() {
		System.out.println("Normal Hesap Bakiyeniz : XXXX TL");
	}
	
}

class AltinHesap implements HesapDurumu{

	public void paraCek() {
		System.out.println("Altın hesaptan para çekiliyor.");
	}

	public void bakiyeOgren() {
		System.out.println("Altın Hesap Bakiyeniz : XXXX TL");
	}
	
}

class Hesap{
	HesapDurumu hesapDurumu;
	
	public Hesap() {
		this.hesapDurumu=new NormalHesap();
	}
	
	public void paraCek() {
		hesapDurumu.paraCek();
	}
	
	public void bakiyeOgren() {
		hesapDurumu.bakiyeOgren();
	}
	
	public void durumDegistir(HesapDurumu hesapDurumu) {
		this.hesapDurumu=hesapDurumu;
	}
	
	
}

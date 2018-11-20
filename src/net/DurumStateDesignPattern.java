package net;

public class DurumStateDesignPattern {

	public static void main(String[] args) {
		Hesap s=new Hesap(new AltinHesap());
		s.bakiyeOgren();
		s.paraCek();
		s.hesapDurumuDegistir(new NormalHesap());
		s.bakiyeOgren();
		s.paraCek();
	}

}

interface HesapDurumu{
	void bakiyeOgren();
	void paraCek();
}

class AltinHesap implements HesapDurumu{

	@Override
	public void bakiyeOgren() {
		System.out.println("Altın hesap bakiyeniz: ");
	}

	@Override
	public void paraCek() {
		System.out.println("Altın hesaptan para çekiliyor..");
	}
	
}

class NormalHesap implements HesapDurumu{

	@Override
	public void bakiyeOgren() {
		System.out.println("Normal hesap bakiyeniz: ");
	}

	@Override
	public void paraCek() {
		System.out.println("Normal hesaptan para çekiliyor..");
	}
	
}

class Hesap{
	HesapDurumu hesapDurumu;
	
	public Hesap(HesapDurumu hesapDurumu) {
		this.hesapDurumu=hesapDurumu;
	}
	
	public void hesapDurumuDegistir(HesapDurumu hesapDurumu) {
		System.out.println("Hesap değiştiriliyor.");
		this.hesapDurumu=hesapDurumu;
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hesap Durumu değiştirildi.");
	}
	
	public void bakiyeOgren() {
		hesapDurumu.bakiyeOgren();
	}
	
	public void paraCek() {
		hesapDurumu.paraCek();
	}
}
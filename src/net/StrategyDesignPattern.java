package net;

public class StrategyDesignPattern {

	public static void main(String[] args) {
		BorcVerenKurum b=new BorcVerenKurum(new AYontemi());
		b.borcYontemiHesapla();
		b.borcYonteminiDegistir(new BYontemi());
	}

}

interface IBorcHesaplama{
	void hesapla();
}

class AYontemi implements IBorcHesaplama{
	@Override
	public void hesapla() {
		System.out.println("A yöntemine göre borç hesaplama sonucu: ");
	}
}

class BYontemi implements IBorcHesaplama{
	@Override
	public void hesapla() {
		System.out.println("B yöntemine göre borç hesaplama sonucu : ");
	}
}


class BorcVerenKurum{
	private IBorcHesaplama borcYontemi;
	
	public BorcVerenKurum(IBorcHesaplama borcYontemi) {
		this.borcYontemi=borcYontemi;
	}
	
	public void borcYontemiHesapla() {
		borcYontemi.hesapla();
	}
	
	public void borcYonteminiDegistir(IBorcHesaplama hesap) {
		borcYontemi=hesap;
		System.out.println("Yeni yönteme göre yeniden hesaplanıyor...");
		try {
			Thread.sleep(900);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		borcYontemi.hesapla();
	}
}
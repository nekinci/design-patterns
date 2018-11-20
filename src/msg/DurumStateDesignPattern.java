package msg;

public class DurumStateDesignPattern {

	public static void main(String[] args) {
		Hesap h=new Hesap();
		h.bakiyeOgren();
		h.hesapDurumuDegistir(new AltinHesap());
		h.bakiyeOgren();
	}
}

interface IHesapDurumu{
	void paraCek();
	void bakiyeOgren();
}

class AltinHesap implements IHesapDurumu{

	@Override
	public void paraCek() {
		System.out.println("Altın hesaptan para çekiliyor..");
	}

	@Override
	public void bakiyeOgren() {
		System.out.println("Altın hesap bakiye durumunuz: XXXX TL");
	}
	
}

class NormalHesap implements IHesapDurumu{
	
	@Override
	public void paraCek() {
		System.out.println("Normal hesaptan para çekiliyor:....");
	}
	
	@Override
	public void bakiyeOgren() {
		System.out.println("Normal hesaptan bakiye bilgisi öğreniliyor.  XXX TL");
	}
}

class Hesap {
	IHesapDurumu hesapDurumu;
	
	public Hesap() {
		this.hesapDurumu=new NormalHesap(); //Normal hesap ile ilklendi.
	}
	
	public void hesapDurumuDegistir(IHesapDurumu hesapDurumu) {
		this.hesapDurumu=hesapDurumu;
		paraCek();
		bakiyeOgren();
	}
	
	public void paraCek() {
		hesapDurumu.paraCek();
	}
	
	public void bakiyeOgren() {
		hesapDurumu.bakiyeOgren();
	}
}

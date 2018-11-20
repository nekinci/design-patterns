package net;

public class MektupStrategy {

	public static void main(String[] args) {
		Mektup m=new Mektup("Bu deneme mektubudur", new Eposta());
		m.gonder();
	}
}

interface IMektup{
	void gonder();
}

class Eposta implements IMektup{

	@Override
	public void gonder() {
		System.out.println("Ucuz ve kısa süreli (e-Posta) işlem ile gönderildi.");
	}
	
}

class HizliPtt implements IMektup{
	
	@Override
	public void gonder() {
		System.out.println("Pahalı ve kısa süreli (Hızlı PTT) işlem ile gönderildi.");
	}
	
}

class NormalPTT implements IMektup{

	@Override
	public void gonder() {
		System.out.println("Ucuz ve uzun süreli (Normal PTT) işlem ile gönderildi.");
	}
	
}

class Mektup{
	IMektup yontem;
	String mesaj;
	
	public Mektup(String mesaj,IMektup yontem) {
		this.mesaj=mesaj;this.yontem=yontem;
	}
	
	public void gonder() {
		System.out.println("Mesajınız :"+mesaj+" gönderiliyor..");
		try {
			Thread.sleep(900);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		yontem.gonder();
	}
}



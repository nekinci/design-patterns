package davranissal;

public class CommandDesign {

	public static void main(String[] args) {
		Lamba lamba=new Lamba();
		Lamba lamba1=new Lamba();
		LambaDugmesi dugme = new LambaDugmesi(new LambaAcmaKomutu(lamba), new LambaKapamaKomutu(lamba));
		dugme.ac();
		dugme.kapat();
		lamba.ac();
		lamba.kapa();
	}

}

interface Komut {
	void calistir();
}

class LambaAcmaKomutu implements Komut{
	private Lamba lamba;
	public void calistir() {
		lamba.ac();
	}
	
	public LambaAcmaKomutu(Lamba lamba) {
		this.lamba=lamba;
	}
	
}

class LambaKapamaKomutu implements Komut {
	private Lamba lamba;
	public void calistir() {
		lamba.kapa();
	}
	
	public LambaKapamaKomutu(Lamba lamba) {
		this.lamba=lamba;
	}
}

class Lamba {
	public void ac() {
		System.out.println("Lamba açıldı.");
	}
	
	public void kapa() {
		System.out.println("Lamba kapatıldı.");
	}
}

class LambaDugmesi {
	private Komut acmaKomutu;
	private Komut kapamaKomutu;
	
	public LambaDugmesi(Komut acmaKomutu,Komut kapamaKomutu) {
		this.acmaKomutu=acmaKomutu;this.kapamaKomutu=kapamaKomutu;
	}
	
	public void ac() {
		acmaKomutu.calistir();
	}
	
	public void kapat() {
		kapamaKomutu.calistir();
	}
	
}

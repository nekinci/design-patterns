package net;

public class CommandDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lamba lamba=new Lamba();
		LambaDugmesi dugme=new LambaDugmesi(new LambaAcmaDugmesi(lamba), new LambaKapamaDugmesi(lamba));
		dugme.ac();
		dugme.kapat();
	}

}

interface IKomut{
	void komutCalistir();
}

class Lamba{
	
	public void ac() {
		System.out.println("Lamba açıldı.");
	}
	
	public void kapat() {
		System.out.println("Lamba kapatıldı.");
	}
}

class LambaAcmaDugmesi implements IKomut{
	private Lamba lamba;
	public LambaAcmaDugmesi(Lamba lamba) {
		this.lamba=lamba;
	}
	@Override
	public void komutCalistir() {
		lamba.ac();
	}
}

class LambaKapamaDugmesi implements IKomut{
	private Lamba lamba;
	public LambaKapamaDugmesi(Lamba lamba) {
		this.lamba=lamba;
	}
	@Override
	public void komutCalistir() {
		// TODO Auto-generated method stub
		lamba.kapat();
	}
}

class LambaDugmesi {
	private LambaAcmaDugmesi acma;
	private LambaKapamaDugmesi kapama;

	public LambaDugmesi(LambaAcmaDugmesi a,LambaKapamaDugmesi b) {
		acma=a;kapama=b;
	}
	
	public void ac() {
		acma.komutCalistir();
	}
	
	public void kapat() {
		kapama.komutCalistir();
	}
}

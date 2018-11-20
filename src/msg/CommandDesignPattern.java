package msg;

public class CommandDesignPattern {
	
	public static void main(String[] args) {
		Lamba l = new Lamba();
		LambaDugmesi d1=new LambaDugmesi(new LambaAcma(l), new LambaKapatma(l));
		d1.ac();
	}
}

interface IKomut{
	void komut();
}

class Lamba {
	
	public Lamba() {
	
	}	
	public void ac() {
		System.out.println("Lamba açılıyor.");
	}
	public void kapa() {
		System.out.println("Lamba kapanıyor.");
	}
}

class LambaDugmesi{
	private LambaAcma acma;
	private LambaKapatma kapama;
	
	public LambaDugmesi(LambaAcma acma,LambaKapatma kapama) {
		this.acma=acma;
		this.kapama=kapama;
	}
	
	public void ac() {
		acma.komut();
	}
	
	public void kapat() {
		kapama.komut();
	}
	
}

class LambaAcma implements IKomut{
	Lamba l;
	public LambaAcma(Lamba l) {
		this.l=l;
	}
	
	@Override
	public void komut() {
		l.ac();
	}
}

class LambaKapatma implements IKomut{
	Lamba l;
	public LambaKapatma(Lamba l) {
		this.l=l;
	}
	
	@Override
	public void komut() {
		l.kapa();
	}
}
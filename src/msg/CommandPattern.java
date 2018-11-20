package msg;

public class CommandPattern {

	public static void main(String[] args) {
		Lamba1 l = new Lamba1();
		LambaDugmesi1 dugme = new LambaDugmesi1(new LambaAcmaDugmesi(l), new LambaKapamaDugmesi(l));
		dugme.ac();
		dugme.kapat();
	}

}

interface IKomut1 {
	void komut();
}
class Lamba1 {
	
	public void ac() {
		System.out.println("Lamba açıldı");
	}
	
	public void kapat() {
		System.out.println("Lamba kapatıldı");
	}
}

class LambaAcmaDugmesi implements IKomut1{
	Lamba1 l;
	
	public LambaAcmaDugmesi(Lamba1 l) {
		this.l=l;
	}
	@Override
	public void komut() {
		l.ac();
	}
}

class LambaKapamaDugmesi implements IKomut1{
	Lamba1 l;
	
	public LambaKapamaDugmesi(Lamba1 l) {
		this.l=l;
	}
	
	@Override
	public void komut() {
		l.kapat();
	}
}

class LambaDugmesi1{
	LambaAcmaDugmesi komut;
	LambaKapamaDugmesi komut1;
	public LambaDugmesi1(LambaAcmaDugmesi k,LambaKapamaDugmesi k1) {
		this.komut = k;
		this.komut1 = k1;
	}
	
	public void ac() {
		komut.komut();
	}
	
	public void kapat(){
		komut1.komut();
	}
	
}

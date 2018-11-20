package net;

public class MediatorDesignPattern {

	public static void main(String[] args) {
		Arabulucu a=new Arabulucu();
		Muzik m=new Muzik(a);
		Video v=new Video(a);
		m.cal();
		v.cal();
		v.durdur();
		
	}

}

abstract class Medya{
	Arabulucu arabulucu;
	
	public Medya(Arabulucu arabulucu) {
		this.arabulucu=arabulucu;
		
	}
	
	public abstract void cal();
	public abstract void durdur();
	
}

class Muzik extends Medya{
	public Muzik(Arabulucu arabulucu) {
		super(arabulucu);
		arabulucu.muzikEkle(this);
	}
	@Override
	public void cal() {
		System.out.println("Müzik çalınıyor");
		arabulucu.muzikCal();
	}@Override
	public void durdur() {
		System.out.println("Müzik durduruldu.");
	}
}

class Video extends Medya{

	public Video(Arabulucu arabulucu) {
		super(arabulucu);
		arabulucu.videoEkle(this);
	}

	@Override
	public void cal() {
		System.out.println("Video çalınıyor..");
		arabulucu.videoCal();
	}

	@Override
	public void durdur() {
		System.out.println("Video durduruldu.");
	}
	
}
class Arabulucu {
	private Muzik m;
	private Video v;
	
	public void muzikEkle(Muzik m) {
		this.m=m;
	}
	public void videoEkle(Video v) {
		this.v=v;
	}
	public void muzikCal() {
		v.durdur();
	}
	public void videoCal() {
		m.durdur();
	}
	
}

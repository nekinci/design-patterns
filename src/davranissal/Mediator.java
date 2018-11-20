package davranissal;

public class Mediator {

	public static void main(String[] args) {
		Arabulucu1 ara=new Arabulucu1();
		Muzik m=new Muzik(ara);
		Video v=new Video(ara);
		m.cal();
		v.cal();
	}

}

abstract class Medya {
	
	protected Arabulucu1 ara;
	
	public Medya(Arabulucu1 ara) {
		this.ara=ara;
	}
	
	public abstract void cal();
	public abstract void durdur();
}

class Muzik extends Medya {
	
	public Muzik(Arabulucu1 ara) {
		super(ara);
		ara.muzikEkle(this);
	}
	
	@Override
	public void cal() {
		System.out.println("Müzik çalınıyor...");
		ara.muzikCal();
	}
	
	@Override
	public void durdur() {
		System.out.println("Müzik durduruldu.");
	}
	
}

class Video extends Medya {
	
	public Video(Arabulucu1 ara) {
		super(ara);
		ara.videoEkle(this);
	}
	
	@Override
	public void cal() {
		System.out.println("Video oynatılıyor.");
		ara.videoOynat();
	}
	
	@Override
	public void durdur() {
		System.out.println("Video durduruldu.");
	}
}

class Arabulucu1{
	
	private Muzik muzik;
	private Video video;
	
	public void muzikEkle(Muzik m) {
		muzik=m;
	}
	
	public void videoEkle(Video v) {
		video=v;
	}
	
	public void muzikCal() {
		video.durdur();
	}
	
	public void videoOynat() {
		muzik.durdur();
	}
}
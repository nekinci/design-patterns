package msg;

public class MektupStrateggy {
	public static void main(String[] args) {
		Musteri m=new Musteri();
		m.mektubuGonder();
	}
}


interface IMektup{
	void gonder();
}

class Eposta  implements IMektup{
	@Override
	public void gonder() {
		System.out.println("Mesajınız e-posta ile gönderilmiştir.");
	}
}

class HizliPTT implements IMektup{
	@Override
	public void gonder() {
		System.out.println("Mesajınız Hızlı PTT ile gönderilmiştir.");
	}
}

class NormalPTT implements IMektup{
	@Override
	public void gonder() {
		System.out.println("Mesajınız Normal PTT ile gönderilmiştir.");
	}
}

class Musteri{
	IMektup mektup;
	int zaman=5,para=110;
	
	void mektubuGonder() {
		if(zaman>30&&para>75) {
			mektup=new NormalPTT();
			mektup.gonder();
			return;
		}
		if(zaman < 10 && para > 100) {
			mektup = new HizliPTT();
			mektup.gonder();
			return;
		}
		if(zaman>=15&&para<10) {
			mektup=new Eposta();
			mektup.gonder();
			return;
		}
	}
	
}
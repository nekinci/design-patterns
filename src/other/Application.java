package other;

public class Application {

	public static void main(String[] args) {
		ResimOlusturucu r=new ResimOlusturucu();
		r.resimOlustur(0);
	}

}

interface IResimTipi {
	void resimOlustur();
}

class JPEGTipi implements IResimTipi{
	public void resimOlustur() {
		System.out.println("JPEG resmi oluşturuldu.");
	}
}

class GIFTipi implements IResimTipi{
	
	public void resimOlustur() {
		System.out.println("GIF resmi olusturuldu");
	}
}

class ResimOlusturucu{
	private IResimTipi nesne;
	private IResimTipi resimOlusturucu(int i) {
		if(i==0)
			return new JPEGTipi();
		else
			return new GIFTipi();
	}
	
	public void resimOlustur(int i) {
		nesne=resimOlusturucu(i);
		nesne.resimOlustur();
	}
}

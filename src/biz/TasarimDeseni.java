package biz;


interface IResimTipi{
	void resimOlustur();
}

class GifTipi implements IResimTipi{

	public void resimOlustur() {
		System.out.println("Hareketli (GIF) resim oluşturuldu.");
	}
	
}

class JpegTipi implements IResimTipi{

	public void resimOlustur() {
		System.out.println("JPEG resmi oluşturuldu.");
	}
	
}

class BmpTipi implements IResimTipi{

	public void resimOlustur() {
		System.out.println("Bitmap (BMP) tipinde yeni dosya oluşturuldu.");
	}
	
}

class Client {
	public IResimTipi resimFabrikasi(int i) {
		if(i==0)
			return new JpegTipi();
		if(i==1)
			return new BmpTipi();
		if(i==2)
			return new GifTipi();
		return null;
	}
}

public class TasarimDeseni {

	public static void main(String[] args) {
		System.out.println("Güle Güle Dünya");
		Client c=new Client();
		IResimTipi tip=c.resimFabrikasi(0);
		tip.resimOlustur();
		
		Asci n=new Asci();
		n.pideKurucuAta(new LahmacunPide());
		n.pideyiKur();
		System.out.println(n.pideAl());
	}

}

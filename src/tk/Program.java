package tk;

interface IResimFormati{
	void resmiOlustur(Integer uzunluk,Integer genislik);
}

class JpegResimFormati implements IResimFormati{

	public void resmiOlustur(Integer uzunluk, Integer genislik) {
		System.out.println("Resim oluştu. Format: JPEG");
		System.out.println("Uzunluk: "+uzunluk+" Genişlik: "+genislik);
	}
	
}

class GifResimFormati implements IResimFormati{

	public void resmiOlustur(Integer uzunluk, Integer genislik) {
		System.out.println(uzunluk+"uzunluğunda "+genislik+" genişliğinde resim oluştu. Format: GIF");
	}
	
}

class FormatSecici{
	
	public IResimFormati formatAl(Integer uzunluk , Integer genislik){
		final int resimAlani=uzunluk*genislik;
		if(resimAlani>100)
			return new JpegResimFormati();
		else
			return new GifResimFormati();
	}
}


public class Program {
	
	public static void main(String[] args) {
		final FormatSecici formatSecici=new FormatSecici();
		IResimFormati s=formatSecici.formatAl(3, 25);
		s.resmiOlustur(3, 25);
		
		final Resim resim1=new Resim(50, 60, "mavi");
		final Resim resim2=resim1.kopyaAl();
		System.out.println(resim2);
		System.out.println(resim1.equals(resim2));
		System.out.println(resim1.hashCode());
		System.out.println(resim2.hashCode());
	}

}

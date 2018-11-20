package structal;


//Proxy Design Pattern
public class GoruntuGosterici {

	public static void main(String[] args) {
		GoruntuDosyasi d=new OzdesGoruntuDosyasi("r.png");
		GoruntuDosyasi d1=new OzdesGoruntuDosyasi("r1.png");
		d.goruntuyuGoster();
		d1.goruntuyuGoster();
		d1.goruntuyuGoster();
		d.goruntuyuGoster();
		//görüldüğü gibi dosya bir kere diskten yüklendi ve her seferinde
		//yükleme işleminden kurtulundu.
		
		GoruntuDosyasi d2=new GercekGoruntuDosyasi("a.png");
		GoruntuDosyasi d3=new GercekGoruntuDosyasi("b.png");
		
		d2.goruntuyuGoster();
		d2.goruntuyuGoster();
		d3.goruntuyuGoster();
		d3.goruntuyuGoster();
	}

}

abstract class GoruntuDosyasi{
	
	protected String dosyaIsmi;
	
	public GoruntuDosyasi(String dosyaIsmi) {
		this.dosyaIsmi=dosyaIsmi; //dosya ismiyle alındı.
	}
	
	public abstract void goruntuyuGoster();
	//görüntüyü gösteren metodu abstract olarak tanımladık.
}

class GercekGoruntuDosyasi extends GoruntuDosyasi {
	
	public GercekGoruntuDosyasi(String dosyaIsmi) {
		super(dosyaIsmi);
		goruntuDosyasiniSabitDisktenYukle(); // dosya diskten yüklendi.
		// TODO Auto-generated constructor stub
	}

	private void goruntuDosyasiniSabitDisktenYukle() {
		// TODO Auto-generated method stub
		// TODO pahalı ve zaman alıcı bir işlem
		System.out.println("Görüntü dosyasi ("+dosyaIsmi+") sabit diskten yüklendi.");
	}
	
	public void goruntuyuGoster() {
		System.out.println("Görüntü dosyası ("+dosyaIsmi+") görüntülendi.");
	}
}

class OzdesGoruntuDosyasi extends GoruntuDosyasi{
	
	GoruntuDosyasi dosya=null;

	public OzdesGoruntuDosyasi(String dosyaIsmi) {
		super(dosyaIsmi);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void goruntuyuGoster() {
		// TODO Auto-generated method stub
		if(dosya==null) { //dosya null ise dosyayı yükler yoksa gerek kalmaz.
			dosya=new GercekGoruntuDosyasi(dosyaIsmi);
		}
		dosya.goruntuyuGoster();
	}
	
																																																																																																																		
	
}
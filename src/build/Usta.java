package build;

public class Usta {
	BilgisayarKurucu bilgisayarKurucu;
	
	public void bilgisayarKurucuEkle(BilgisayarKurucu bilgisayarKur) {
		bilgisayarKurucu=bilgisayarKur;
	}
	
	public Bilgisayar bilgisayarAl() {
		return bilgisayarKurucu.bilgisayarAl();
	}
	
	public void bilgisayariKuralim() {
		bilgisayarKurucu.bilgisayarYap();
		bilgisayarKurucu.bilgisayariKur();
		bilgisayarKurucu.montajYap();
		bilgisayarKurucu.ekstraEkle();
	}
	
	public static void main(String[] args) {
		Usta u=new Usta();
		u.bilgisayarKurucuEkle(new Asus100());
		u.bilgisayariKuralim();
		System.out.println(u.bilgisayarAl());
	}
}

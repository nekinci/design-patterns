package davranissal;

public class MusteriStrategy {

	public static void main(String[] args) {
		BorcVerenKurum b=new BorcVerenKurum(new YontemA());
		b.borcHesapla();
		b.yontem=new YontemB();
		b.borcHesapla();
	}

}

interface BorcHesaplamaYontemi{
	void borcHesapla();
}

class BorcVerenKurum{
	BorcHesaplamaYontemi yontem;
	
	public BorcVerenKurum(BorcHesaplamaYontemi yontem) {
		this.yontem=yontem;
	}
	
	public void borcHesapla() {
		yontem.borcHesapla();
	}
	
}

class YontemA implements BorcHesaplamaYontemi{
	public void borcHesapla() {
		System.out.println("A yöntemi kullanılarak hesaplandı.");
	}
}

class YontemB implements BorcHesaplamaYontemi{
	public void borcHesapla() {
		System.out.println("B yöntemi kullanılarak hesaplandı.");
	}
}

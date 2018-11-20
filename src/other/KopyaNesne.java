package other;

public class KopyaNesne {

	public static void main(String[] args) {
		Resim r=new Resim(5, 6);
		Resim r1=r.kopyaOlustur();
		System.out.println(r1.boy);
	}

}

class Resim implements Cloneable{
	
	int en,boy;
	
	public Resim(int en,int boy) {
		this.en=en;this.boy=boy;
	}
	
	public Resim kopyaOlustur() {
		try {
			return (Resim) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}

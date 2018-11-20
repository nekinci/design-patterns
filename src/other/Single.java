package other;

public class Single {

	public static void main(String[] args) {
		TekNesne t=TekNesne.nesneAl();
		TekNesne b=TekNesne.nesneAl();
		
		System.out.println(t.equals(b));
		System.out.println(t.hashCode());
		System.out.println(b.hashCode());
	}

}

class TekNesne {
	private TekNesne() {
		System.out.println("TekNesneyim");
	}
	private static TekNesne t=new TekNesne();
	
	public static TekNesne nesneAl() {
		return t;
	}
}



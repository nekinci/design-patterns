package msg;

public class BridgePattern {

	public static void main(String[] args) {
		Cizim1 c = new Cizim1(new KalıpII());
		c.ucgenCiz();
	}

}

interface CizgiKalip {
	void cizgi();
	void cember();
}

class KalipI implements CizgiKalip{

	@Override
	public void cizgi() {
		System.out.println("Kalıp I ile çizgi.");
	}

	@Override
	public void cember() {
		System.out.println("Kalıp I ile çember.");
	}
	
}

class KalıpII implements CizgiKalip{

	@Override
	public void cizgi() {
		System.out.println("Kalıp II ile çizgi.");
	}

	@Override
	public void cember() {
		System.out.println("Kalıp II ile çember.");
	}
	
}

class Cizim1 {
	private CizgiKalip kalip;
	
	public Cizim1(CizgiKalip kalip) {
		this.kalip=kalip;
	}
	
	void ucgenCiz() {
		kalip.cizgi();
		kalip.cizgi();
		kalip.cizgi();
		
	}
}

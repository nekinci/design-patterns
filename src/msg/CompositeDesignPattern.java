package msg;

import java.util.ArrayList;

public class CompositeDesignPattern {

	public static void main(String[] args) {
		EkipUyesi a3=new EkipUyesi("ss", "666");
		EkipUyesi a1=new EkipUyesi("ssss", "666");
		EkipUyesi a2=new EkipUyesi("s2s", "666a");
		
		EkipPatronu a=new EkipPatronu();
		a.uyeEkle(a3);
		a.uyeEkle(a1);
		a.uyeEkle(a2);
		a.bilgiAl();
	}
}

interface IIsci {
	void bilgiAl();
}

class EkipUyesi implements IIsci{
	String ad,maas;
	public EkipUyesi(String ad,String maas) {
		this.ad=ad;this.maas=maas;
	}
	
	@Override
	public void bilgiAl() {
		System.out.println(ad+" "+maas);
	}
}

class EkipPatronu implements IIsci {
	private ArrayList<IIsci> uyeler =new ArrayList<IIsci>();
	
	public void uyeEkle(IIsci i) {
		uyeler.add(i);
	}
	
	@Override
	public void bilgiAl() {
		for(IIsci ii: uyeler)
			ii.bilgiAl();
	}
}

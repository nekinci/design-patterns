package msg;

import java.util.HashMap;

public class MediatorDesign {

	public static void main(String[] args) {
		Mediator mediator=new Mediator();
		Messagers m=new Messagers("niyazi", mediator);
		Messagers m1=new Messagers("ali", mediator);
		
		m.mesajGonder("ali", "nasısın");
	}

}

class Mediator{
	private HashMap<String, Messagers> connectors=new HashMap<>();
	
	public void connectorAdd(String isim,Messagers m) {
		connectors.put(isim, m);
	}
	
	public void mesajGonder(String kimden,String kime,String mesaj) {
		if(!connectors.containsKey(kime))
			System.out.println("Böyle birisi yok.");
		else {
			connectors.get(kime).mesajAlici(kimden, mesaj);
		}
			
	}
}

class Messagers{
	private String isim;
	Mediator mediator;
	
	public Messagers(String isim,Mediator mediator) {
		this.mediator=mediator;
		this.isim=isim;
		mediator.connectorAdd(isim, this);
	}
	
	public void mesajGonder(String kime,String mesaj) {
		System.out.println("Mesaj gönderiliyor...");
		mediator.mesajGonder(isim,kime,mesaj);
	}
	
	public void mesajAlici(String kimden,String mesaj) {
		System.out.println(kimden+" kişisinden "+mesaj+" 'ı alındı.");
	}
}

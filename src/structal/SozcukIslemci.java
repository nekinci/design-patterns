package structal;

import java.util.HashMap;
import java.util.Map;

public class SozcukIslemci {

	public static void main(String[] args) {
		
		String satir="Merhaba, nasılsın.";
		
		KarakterOlusturucu k1=new KarakterOlusturucu();
		for(char c:satir.toCharArray()) {
			Karakter k=k1.karakterAl(c);
			k.ekranaBas();
		}
		
	}

}

class Karakter{
	
	private final char karakter;
	
	public Karakter(char karakter) {
		this.karakter=karakter;
	}
	
	public void ekranaBas() {
		System.out.println("Ekrana Basıldı. "+karakter);
	}
}

class KarakterOlusturucu {
	
	private final Map<Character,Karakter> karakterHavuzu=new HashMap<Character, Karakter>();
	
	public Karakter karakterAl(char karakter) {
		if(karakterHavuzu.containsKey(karakter)) {
			return karakterHavuzu.get(karakter);
		}
		
		Karakter yeniKarakter=new Karakter(karakter);
		karakterHavuzu.put(karakter, yeniKarakter);
		
		return yeniKarakter;
	}
}

package org;

import java.util.HashMap;

public class FlyWeightDesignPattern {

	public static void main(String[] args) {
		String s="Merhaba Nasılsın?";
		KarakterOlusturucu k1=new KarakterOlusturucu();
		for(Character c:s.toCharArray()) {
			Karakter karakter=k1.karakterAl(c);
			karakter.ekranaBas();
		}
	}

}

class Karakter {
	private final char karakter;
	
	public Karakter(char c) {
		karakter=c;
	}
	
	public void ekranaBas() {
		System.out.print(" "+karakter);
	}
	public char getKarakter() {
		return karakter;
	}
}

class KarakterOlusturucu{
	
	private HashMap<Character, Karakter> s=new HashMap<>();
	
	public Karakter karakterAl(char c) {
		if(s.containsKey(c))
			return s.get(c);
		Karakter yeniKarakter=new Karakter(c);
		s.put(c, yeniKarakter);
		return yeniKarakter;
	}
}
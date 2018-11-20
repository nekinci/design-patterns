package davranissal;

import java.util.ArrayList;

public class DilYorumlayicisi {

	public static void main(String[] args) {
		String s="++-+-+-++";
		ArrayList<Sembol> liste=new ArrayList<Sembol>();
		
		for(char c:s.toCharArray()) {
			if(c=='+')
				liste.add(new ArtiSembolu());
			if(c=='-')
				liste.add(new EksiSembolu());
		}
		
		for(Sembol s1:liste) {
			s1.yorumla();
		}
	}

}

interface Sembol {
	void yorumla();
}

class EksiSembolu implements Sembol{
	public void yorumla() {
		System.out.println("- Sembolü yorumlandı.");
	}
}

class ArtiSembolu implements Sembol{
	public void yorumla() {
		System.out.println("+ Sembolü yorumlandı.");
	}
}	

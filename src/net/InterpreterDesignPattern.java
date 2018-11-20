package net;

public class InterpreterDesignPattern {

	public static void main(String[] args) {
		String semboller="+-?--+?--+???+-+";
		for(char c:semboller.toCharArray()) {
			if(c=='+') 
				new ArtiSembolu().yorumla();
			if(c=='-')
				new EksiSembolu().yorumla();
			if(c=='?')
				new SoruIsaretiSembolu().yorumla();
		}
	}
}

interface ISembol{
	void yorumla();
}

class ArtiSembolu implements ISembol{
	@Override
	public void yorumla() {
		System.out.println("+ işareti okundu.");
	}
}

class EksiSembolu implements ISembol{
	@Override
	public void yorumla() {
		System.out.println("- işareti okundu.");
	}
}

class SoruIsaretiSembolu implements ISembol{
	@Override
	public void yorumla() {
		System.out.println("? işareti okundu.");
	}
}

package davranissal;

import java.math.BigInteger;
import java.util.Random;

/*
 * 
 * @author nekinci
 * @Design Mediator 
 * 
 * 
 * */
public class Kullanici {

	public static void main(String[] args) {
		Arabulucu arabulucu=new Arabulucu();
		Bilgisayar b=new Bilgisayar(arabulucu);
		Televizyon t=new Televizyon(arabulucu);
		Radyo r= new Radyo(arabulucu);
		
		b.calistir();
		t.calistir();
		r.calistir();
		
	}

}

abstract class ElektronikAygit{
	protected Arabulucu arabulucu;
	
	public ElektronikAygit(Arabulucu arabulucu) {
		this.arabulucu=arabulucu;
	}
	
	public abstract void calistir();
	public abstract void durdur();
}

class Bilgisayar extends ElektronikAygit{

	public Bilgisayar(Arabulucu arabulucu) {
		super(arabulucu);
		arabulucu.bilgisayarEkle(this);
	}

	@Override
	public void calistir() {
		System.out.println("Bilgisayar çalıştı.");
		arabulucu.bilgisayarCalistir();
	}

	@Override
	public void durdur() {
		System.out.println("Bilgisayar durdu.");
	}
	
}

class Radyo extends ElektronikAygit{

	public Radyo(Arabulucu arabulucu) {
		super(arabulucu);
		arabulucu.radyoEkle(this);
	}

	@Override
	public void calistir() {
		System.out.println("Radyo çalıştı.");
		arabulucu.radyoCalistir();
	}

	@Override
	public void durdur() {
		System.out.println("Radyo durdu.");
	}
	
}

class Televizyon extends ElektronikAygit{

	public Televizyon(Arabulucu arabulucu) {
		super(arabulucu);
		arabulucu.televizyonEkle(this);
	}

	@Override
	public void calistir() {
		System.out.println("Televizyon çalıştı.");
		arabulucu.televizyonCalistir();
	}

	@Override
	public void durdur() {
		System.out.println("Televizyon durdu.");
	}
	
}

class Arabulucu{
	
	private Bilgisayar bilgisayar;
	private Radyo radyo;
	private Televizyon televizyon;
	
	public void bilgisayarEkle(Bilgisayar bilgisayar) {
		this.bilgisayar=bilgisayar;
	}
	
	public void radyoEkle(Radyo radyo) {
		this.radyo=radyo;
	}
	
	public void televizyonEkle(Televizyon televizyon) {
		this.televizyon=televizyon;
	}
	
	public void bilgisayarCalistir() {
		radyo.durdur();
		televizyon.durdur();
	}
	
	public void radyoCalistir() {
		bilgisayar.durdur();
		televizyon.durdur();
	}
	
	public void televizyonCalistir() {
		radyo.durdur();
		bilgisayar.durdur();
	}
}
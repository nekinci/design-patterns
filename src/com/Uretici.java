package com;

public abstract class Uretici {
	public Urun urun;
	public Urun getUrun(){
		return urun;
	}
	public abstract void UretimHatti();
	public abstract void OzellikEkle();
	public abstract void OSKur();
}
class Urun{
	String Kamera,Islemci,OnKamera,Marka,Model,OS,Ekran;
	public String toString() {
		return "Marka : "+Marka+" Model: "+Model+" "+Islemci+"'li telefon üretildi.";
	}
}
class Direction {
	public void TelefonUret(Uretici u){
		u.UretimHatti();
		u.OzellikEkle();
		u.OSKur();
	}
}
class AUreticisi extends Uretici{
	
	public AUreticisi(){
		urun=new Urun();
	}
	public void UretimHatti() {
		urun.Marka="Sony";
		urun.Model="Xperia Z3+";
	}

	public void OzellikEkle() {
		urun.Ekran="5.2 inç LCD";
		urun.Islemci="Snapdragon 801";
		urun.Kamera="20.7MP";
		urun.OnKamera="8MP";
	}
	public void OSKur() {
		urun.OS="Android 7.1.1";
	}
	
}
class BUreticisi extends Uretici{
	public BUreticisi(){
		urun=new Urun();
	}
	public void UretimHatti() {
		urun.Marka="Samsung";
		urun.Model="S3 Mini";
	}
	public void OzellikEkle() {
		urun.Ekran="4.0 inç LCD";
		urun.Islemci="MediaTek MT6510";
		urun.Kamera="8MP";
		urun.OnKamera="2.1MP";
	}
	public void OSKur() {
		urun.OS="Android 4.0.1";
	}
}
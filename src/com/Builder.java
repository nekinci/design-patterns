package com;

public abstract class Builder {
	protected Product Computer;
	public Product getComputer(){
		return Computer;
	}
	public abstract void UretimHattinaAl();
	public abstract void CihazMontaj();
	public abstract void IsletimSistemiKurulum();
	
}
class Product{
	String Marka,Model,Anakart,Cpu,Ram,Hdd,Kasa,Klavye,Mouse,Monitor,OS;
	public String getMarka(){return Marka;}public void setMarka(String Marka){this.Marka=Marka;}
	public String getModel(){return Model;}public void setModel(String Model){this.Model=Model;}
	public String getAnakart(){return Anakart;}public void setAnakart(String Anakart){this.Anakart=Anakart;}
	public String getCpu(){return Cpu;}public void setCpu(String Cpu){this.Cpu=Cpu;}
	public String getRam(){return Ram;}public void setRam(String Ram){this.Ram=Ram;}
	public String getHdd(){return Hdd;}public void setHdd(String Hdd){this.Hdd=Hdd;}
	public String getKasa(){return Kasa;}public void setKasa(String Kasa){this.Kasa=Kasa;}
	public String getKlavye(){return Klavye;}public void setKlavye(String Klavye){this.Klavye=Klavye;}
	public String getMouse(){return Mouse;}public void setMouse(String Mouse){this.Mouse=Mouse;}
	public String getMonitor(){return Monitor;}public void setMonitor(String Monitor){this.Monitor=Monitor;}
	public String getOS(){return OS;}public void setOS(String OS){this.OS=OS;}
	
	public String toString() {
		return "Marka: "+getMarka()+" Model: "+getModel()+" bilgisayar üretildi.";
	}
}
class Director{
	public void BilgisayarUret(Builder build){
		build.UretimHattinaAl();
		build.CihazMontaj();
		build.IsletimSistemiKurulum();
	}
}
class ABuilder extends Builder{

	public ABuilder(){
		Computer=new Product();
	}
	public void UretimHattinaAl() {
		Computer.setMarka("Asus");
		Computer.setModel("H 1000");
	}

	public void CihazMontaj() {
		Computer.setAnakart("Gigabyte");
		Computer.setCpu("Intel");
		Computer.setHdd("Samsung 300GB");
		Computer.setKasa("Asus Open");
		Computer.setKlavye("OEM");
		Computer.setMouse("OEM");
		Computer.setMonitor("Philips");
		Computer.setRam("Kingston 2GB");
		
	}

	public void IsletimSistemiKurulum() {
		Computer.setOS("Ubuntu 16.04.4");
	}
	
}
class BBuilder extends Builder{

	public BBuilder(){
		Computer=new Product();
	}
	public void UretimHattinaAl() {
		Computer.setMarka("Fujitsu");
		Computer.setModel("Home - 987");
	}

	public void CihazMontaj() {
		Computer.setAnakart("Asus");
		Computer.setCpu("AMD");
		Computer.setHdd("Samsung 500GB");
		Computer.setKasa("Fujitsu");
		Computer.setKlavye("OEM");
		Computer.setMouse("OEM");
		Computer.setMonitor("Fujitsu");
		Computer.setRam("Kingston 8GB");
		
	}

	public void IsletimSistemiKurulum() {
		Computer.setOS("Linux Mint 12");
	}
	
}

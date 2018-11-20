package edu;

public abstract class PrinterPrototype {
	public abstract PrinterPrototype Clone();
}
class Printer extends PrinterPrototype{
	public byte Address;
	public String name;
	public boolean ColorCartridge;
	public boolean BlackCartridge;
	public int ResolutionDpi;
	public String PaperSize;
	public Printer(byte address, String name, boolean colorCartridge,
			boolean blackCartridge, int resolutionDpi, String paperSize) {
		super();
		Address = address;
		this.name = name;
		ColorCartridge = colorCartridge;
		BlackCartridge = blackCartridge;
		ResolutionDpi = resolutionDpi;
		PaperSize = paperSize;
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {e.printStackTrace();}
	}
	@Override
	public PrinterPrototype Clone()  {
		//Klonlama işlemi gelen nesnenin bir kopyası alınıp sonuç olarak döndürülüyor.
		return (PrinterPrototype) this;
	}
	
}

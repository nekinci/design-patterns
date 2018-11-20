package edu;

public class Program {
	public static void main(String[] args) {
		Printer printer1=new Printer((byte) 0x0F,"HP", false, true, 600, "A4");
		for(int i=0;i<20;i++){
			PrintDocument((Printer)printer1.Clone(),i+"");
			System.out.println((i+1)+" nolu sayfa basıldı.");
		}
		System.out.println("Yazdırma Tamamlandı");
		
	}
	static void PrintDocument(Printer p,String content){
		//print işlemi yapan metod
	}
}

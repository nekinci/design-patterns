package com;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IResim resim=ResimOlusturucu.resmiOlustur(50, 60);
		resim.resmiOlustur(50, 60);
	}

}

interface IResim{
	void resmiOlustur(int width,int height);
}

class JpegTipi implements IResim{
	
	@Override
	public void resmiOlustur(int width, int height) {
		System.out.println("W:"+width+" H:"+height+" boyutlarında JPEG Resmi oluşturuldu.");
	}
}

class BMPTipi implements IResim{
	
	@Override
	public void resmiOlustur(int width, int height) {
		System.out.println("W:"+width+" H:"+height+" boyutlarında Bitmap Resmi oluşturuldu.");
	}
}

class ResimOlusturucu {
	
	private ResimOlusturucu() {
		
	}
	
	public static IResim resmiOlustur(int width,int height) {
		if(width+height>350)
			return new BMPTipi();
		else 
			return new JpegTipi();
	}
}
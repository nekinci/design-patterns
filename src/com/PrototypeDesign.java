package com;

public class PrototypeDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResimSinifi r=new ResimSinifi("1.jpg", "640", "640");
		ResimSinifi r1=r.kopyaOlustur();
		System.out.println(r.equals(r1));
		System.out.println(r.hashCode());
		System.out.println(r1.hashCode());
		
		System.out.println(r);
		System.out.println(r1);
	}

}

class ResimSinifi implements Cloneable{
	String resimAdi,boy,en;

	public ResimSinifi(String resimAdi, String boy, String en) {
		super();
		this.resimAdi = resimAdi;
		this.boy = boy;
		this.en = en;
	}
	
	public ResimSinifi kopyaOlustur() {
		try {
			return (ResimSinifi) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public String toString() {
		return resimAdi+" "+boy+" "+en;
	}
	
}

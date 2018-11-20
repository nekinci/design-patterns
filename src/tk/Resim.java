package tk;

public class Resim implements Cloneable {
	private final int en,boy;
	private String renk;
	
	public int getBoy() {
		return boy;
	}
	
	public int getEn() {
		return en;
	}
	
	public String getRenk() {
		return renk;
	}
	
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public Resim(final int en,final int boy,final String renk) {
		this.renk=renk;this.en=en;this.boy=boy;
	}
	
	@Override
	public String toString() {
		return "Resim [renk "+renk+", boy "+boy+",en "+en+" ]";
	}
	@Override
	public boolean equals(Object obj) {
		Resim i=(Resim) obj;
		if(this.boy==i.boy)
			return true;
		return false;
	}
	protected Resim kopyaAl() {
		try {
			return (Resim) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

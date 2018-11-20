package tk;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

interface ISiparisNesneFabrikasi{
	public OdemeTipi odemeTipi();
	public Bildirim bildirim();
}

class NormalSiparisFabrikasi implements ISiparisNesneFabrikasi{

	public OdemeTipi odemeTipi() {
		return new PostaCeki();
	}

	public Bildirim bildirim() {
		// TODO Auto-generated method stub
		return new Eposta();
	}
	
}

class HizliSiparisFabrikasi implements ISiparisNesneFabrikasi{

	public OdemeTipi odemeTipi() {
		return new Havale();
	}

	public Bildirim bildirim() {
		return new Sms();
	}
	
}

interface OdemeTipi{
	void paraGonder(int miktar);
}

interface Bildirim{
	void mesajGonder(String message);
}

class Eposta implements Bildirim{

	public void mesajGonder(String message) {
		System.out.println("Mesajınız: "+message+" , eposta ile gönderilmiştir."+new java.util.Date());
	}
	
}

class Sms implements Bildirim{
	
	public void mesajGonder(String message){
		System.out.println("Mesajınız sms ile iletilmiştir.");
	}
}

class Havale implements OdemeTipi{

	public void paraGonder(int miktar) {
		System.out.println(miktar+"TL tutarındaki para Havale yöntemi kullanılaak gönderilmiştir.");
	}
	
}

class PostaCeki implements OdemeTipi{
	
	public void paraGonder(int miktar) {
		System.out.println("Posta çekiyle "+miktar+"TL para gönderilmiştir.");
	}
}

class Istemci {
	ISiparisNesneFabrikasi s;
	public Istemci(ISiparisNesneFabrikasi s1){
		s=s1;
	}
	public void calistir(String message,int miktar){
		Bildirim b=s.bildirim();
		OdemeTipi o=s.odemeTipi();
		b.mesajGonder(message);
		o.paraGonder(miktar);
	}
}

class Pencere extends JFrame{
	
	public Pencere(){
		setSize(300,300);
		setVisible(true);
		JButton btn;
		final JTextField miktar;
		final JTextField mesaj;
		JLabel yontem=new JLabel("Ödeme yöntemi: ");
		String [] a = {"Hızlı ödeme","Normal Ödeme"};
		final JComboBox<String> combobox=new JComboBox<String>();
		combobox.addItem(a[0]);
		combobox.addItem(a[1]);
		setLayout(new FlowLayout());
		Container con=getContentPane();
		con.setLayout(new FlowLayout());
		
		btn=new JButton("Siparişi gönder");
		miktar=new JTextField("Miktar");
		mesaj=new JTextField("Mesajınız");
		
		con.add(yontem);
		con.add(combobox);		
		con.add(mesaj);
		con.add(miktar);
		con.add(btn);
		
		
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Istemci cl=null;
				final int miktarint=Integer.valueOf(miktar.getText());
				final String mesaje=mesaj.getText();
			
				int i = combobox.getSelectedIndex();
				if(i==0) {
					cl=new Istemci(new HizliSiparisFabrikasi());
					cl.calistir(mesaje, miktarint);
				}
				if(i==1) {
					cl=new Istemci(new NormalSiparisFabrikasi());
					cl.calistir(mesaje, miktarint);
				}
			}
		});
	}
}

public class SiparisGonderici {

	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				new Pencere();
			}
		});
	}

}

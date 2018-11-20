package net;

class Target{
	public void Request(){
		System.out.println("Called Target Request()");
	}
}
class Adapter extends Target{
	private Adaptee _adaptee=new Adaptee();
	
	@Override
	public void Request() {
		_adaptee.SpecificRequest();
	}
}
class Adaptee{
	public void SpecificRequest(){
		System.out.println("Called Specific Request()");
	}
}
public class MainApp {

	public static void main(String[] args) {
		Target t=new Adapter();
		t.Request();
	}

}
// Adapter Adaptee classının metodunu aslında Target metodun da gösterdi. Yani bir target nesnesinde
//Adaptee nesnesinin metodunu görmüş olduk.

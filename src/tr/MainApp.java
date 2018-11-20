package tr;

public class MainApp {

	public static void main(String[] args) {
		Abstraction ab = new RefineAbstraction();
		
		ab.implementor=new ConcreteImplementationA();
		ab.Operation();
		
		ab.implementor=new ConcreteImplementationB();
		ab.Operation();
	}
}
class Abstraction{
	protected Implementor implementor;
	public void setImplementor(Implementor i){
		implementor=i;
	}
	public void Operation(){
		implementor.Operation();
	}
}
abstract class Implementor{
	public abstract void Operation();
}
class RefineAbstraction extends Abstraction{
	@Override
	public void Operation() {
		implementor.Operation();
	}
}
class ConcreteImplementationA extends Implementor{
	@Override
	public void Operation() {
		System.out.println("ConcreteImplementationA Operation");
	}
}
class ConcreteImplementationB extends Implementor{
	@Override
	public void Operation() {
		System.out.println("ConcreteImplementationB Operation");
	}
}
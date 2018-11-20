package com;

public abstract class AbstractFactory {
	public abstract AbstractProductA CreateProductA();
	public abstract AbstractProductB CreateProductB();
	
}
class ConcreteFactory1 extends AbstractFactory{

	public AbstractProductA CreateProductA() {
		return new ProductA1();
	}

	public AbstractProductB CreateProductB() {
		return new ProductB1();
	}
	
}
class ConcreteFactory2 extends AbstractFactory{

	public AbstractProductA CreateProductA() {
		return new ProductA2();
	}

	public AbstractProductB CreateProductB() {
		return new ProductB2();
	}
	
}
abstract class AbstractProductA{
	
}
abstract class AbstractProductB{
	public abstract void Interact(AbstractProductA a);
}
class ProductA1 extends AbstractProductA{
	
}
class ProductB1 extends AbstractProductB{

	public void Interact(AbstractProductA a) {
		System.out.println(this.getClass().getTypeName()+" interacts with "+a.getClass().getTypeName());
	}
}
class ProductA2 extends AbstractProductA{
	
}
class ProductB2 extends AbstractProductB{

	public void Interact(AbstractProductA a) {
		System.out.println(this.getClass().getTypeName()+" interacts with "+a.getClass().getTypeName());
	}
	
}

//client

class Client{
	private AbstractProductA _abstractProductA;
	private AbstractProductB _abstractProductB;
	public Client(AbstractFactory factory){
		_abstractProductB=factory.CreateProductB();
		_abstractProductA=factory.CreateProductA();
	}
	public void run1(){
		_abstractProductB.Interact(_abstractProductA);
	}
}


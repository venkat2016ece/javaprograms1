
public class Animal {
	public void move(){
		System.out.println("Animal can move");
	}
}class Dog extends Animal{
	public void move(){
		super.move();//invokes super class method
		System.out.println("Dogs can walk and run");
	}
	
}

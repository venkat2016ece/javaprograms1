package Polymorphism;

public class Mthdoverriding {
	
	public void move(){
		System.out.println("animals can move");
		
	} 
	class Dog extends Mthdoverriding
	{
		public void move(){
			System.out.println("Dogs can walk and run");
		}
	}
	public static void main(String args[]) {
		Dog b=new Dog();
		b.move();
		

	}

}


package Inheritance;

public class Dog {

	public static void main(String[] args) {
		//Animal a= new Animal();
		Mammal m=new Mammal();
		Dog d=new Dog();
		System.out.println(m instanceof Animal);
		System.out.println(m instanceof Mammal);
		System.out.println(d instanceof Dog);

	}

}

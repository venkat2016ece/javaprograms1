
public class TestDog {

	public static void main(String[] args) {
		Animal b=new Dog();//animal reference but dog object
		b.move();//runs the method in dog class
	}

}
//output:     Animal can move
//            Dogs can walk and run
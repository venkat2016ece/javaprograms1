package BasicOperators;

class Vehicle{}

public class Car extends Vehicle{

	public static void main(String[] args) {
		Vehicle a=new Car();
		boolean result=a instanceof Car;
		System.out.println("car==a:"+result);
		String name="James";// following will return true since name is type of String
        boolean result2=name instanceof String;
        System.out.println("name='James' instanceof String :"+result);
	}

}

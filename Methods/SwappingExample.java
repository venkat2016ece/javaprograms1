package Methods;

public class SwappingExample {

	public static void main(String[] args) {
		int a=30;
		int b=45;
		System.out.println("before swaping,a ="+           a+" and b="+b);
//invoke the swap method
		swapFunction(a,b);
		System.out.println("\n**now,before and after swaping value will be same here**:");
	System.out.println("After swapping, a = " +
            a + " and b is " + b);
	}
	public static void swapFunction(int a,int b){
		System.out.println("Before swapping(Inside), a = " + a
                + " b = " + b);
	//swap n1 with n2
		int c=a;a=b;b=c;
		System.out.println("After swapping(Inside), a = " + a
                + " b = " + b);
	}

}

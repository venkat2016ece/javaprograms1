package Polymorphism;

public class MthdOverloading {
	
	//demonstrate method overloading
	void test(){
		System.out.println("no parameters");
	}
	//overload test for one integer parameter
	void test (int a){
		System.out.println("a:"+a);
	}
	//overload test for two integer parameter
	void test (int a ,int b){
		System.out.println("a and b:"+a+" "+b);
	}
	

	public static void main(String[] args) {
		MthdOverloading ob =new MthdOverloading();
		ob.test();
		ob.test(10);
		ob.test(10, 20);
		
		

	}

}

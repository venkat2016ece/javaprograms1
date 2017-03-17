package Inheritance;

class A{
	public void a(){
		System.out.println("welcome to method a()");
	}
}
class B extends A{
	public void b(){
		System.out.println("welcome to method a()");
	}
}
class C extends B{
	public void c(){
		System.out.println("welcome to method a()");
	}
}


public class MultilevelInheritance {

	public static void main(String[] args) {
		 C c=new C();
		 c.a();
		 c.b();
		 c.c();

	}

}

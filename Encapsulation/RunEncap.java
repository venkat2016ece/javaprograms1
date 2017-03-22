package Encapsulation;

public class RunEncap {

	public static void main(String[] args) {
		EncapTest encap=new EncapTest();
		encap.setName("James");
		encap.setAge(20);
		encap.setIdNum("12343");
System.out.println("NAME :"+encap.getName()+"\n \n  Age: "+encap.getAge());
	}

}

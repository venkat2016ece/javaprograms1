package Constructor;

public class Emtycontructor {

	public static void main(String[] args) {
	Abc obj=new Abc();	
	}
}
class Abc{
	public Abc(){
	System.out.println("constructor has a same name as classname"
			+ " it never returns anything.thats why we are not written return type here"
			+ " consructor get called when you instantiate the object"
			+ " we can not call the constructor explicitly");
}
}
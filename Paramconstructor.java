package Constructor;
  public class Paramconstructor {
	public Paramconstructor(){
		System.out.println("ex no argument constructor");
	}
	public Paramconstructor(int a){
		System.out.println("ex int argument type constructor");
	}
	public Paramconstructor(long L){
		System.out.println("ex long argument type constructor");
	}
	public Paramconstructor(float f){
		System.out.println("ex float argument type constructor");
	}
	public Paramconstructor(double d){
		System.out.println("ex double argument type constructor");
	}
	public Paramconstructor(char c){
		System.out.println("ex char argument type constructor");
	}
	public Paramconstructor(boolean b){
		System.out.println("ex boolean argument type constructor");
	}
	public Paramconstructor(String a){
		System.out.println("ex string argument type constructor");
	}
	public Paramconstructor(int a,String s,long L){
		System.out.println("ex int,string,double argument type constructor");
	}
	

	public static void main(String[] args) {
		 Paramconstructor e=new Paramconstructor(true);
		 Paramconstructor e1=new Paramconstructor(10);
		 Paramconstructor e2=new Paramconstructor("venkat");
		 Paramconstructor e3=new Paramconstructor(52,"venkat",10L);
		 }

}


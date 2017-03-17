package Inheritance;

public class Singlelevel {

	public static void main(String[] args) {
		AddSub obj=new AddSub();
		obj.num1=5;
		obj.num2=4;
		obj.sum();
		System.out.println(obj.result);
		obj.sub();
		System.out.println(obj.result);
		 }

}

class Add{
	int num1,num2,result;
	public void sum(){
		result=num1+num2;
	}
}
class AddSub extends Add{   //single level inheritance
	/*int num1,num2,result;
	
	
	public void sum(){
		result=num1+num2;
	}*/
		
		public void sub(){
			result=num1-num2;
		}
 
		}
 
	//and java doesn't support multiple inheritance 


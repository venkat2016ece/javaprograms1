
public class AbDemo2 {

	public static void main(String[] args) {
		IPhone obj=new IPhone();
		SamsungS4 obj1=new SamsungS4();
		obj.ShowConfig();
        obj1.ShowConfig();
	}
	public static void Show(Phone obj){
		obj.ShowConfig();
	}
	}
abstract class Phone
{
	public abstract void ShowConfig();
	}
class IPhone extends Phone{
	public void ShowConfig(){
		System.out.println("2Gb,Ios 9.3");
	}
}
	class SamsungS4 extends Phone{
		public void ShowConfig(){
			System.out.println("2Gb,lolipop");
		}
}




public class AbDemo1
{
public static void main(String[]args){
	VenkatPhone obj=new SureshPhone();//can not instantiate abstract class
	obj.call();
	obj.cook();
	obj.dance();
	obj.move();

}
}

abstract class VenkatPhone//abstract method
{
public void call()
{
System.out.println("calling......");
}
public abstract void move();
public abstract void dance();
public abstract void cook();
}
abstract class RameshPhone extends VenkatPhone//abstract method
{
public void move()
{
System.out.println("moving.......");
}
}
class SureshPhone extends RameshPhone//concreate method
{
public void dance()
{
System.out.println("Dancing......");
}
public void cook()
{
System.out.println("cooking......");
}
}
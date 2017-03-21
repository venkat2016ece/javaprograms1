package Arrays;

public class ArrayExample2 {

	public static void main(String[] args) {
		Emp e1 =new Emp(111,"VENKAT");
		Emp e2 =new Emp(222,"SURESH");
		Emp e3 =new Emp(333,"RAMESH");
		
		Emp[] e=new Emp[5];
		e[0]=e1;
		e[2]=e3;
		e[3]=e2;
		
		
		for(Object o:e){
			if (o instanceof Emp){
				Emp ee=(Emp)o;
				System.out.println(ee.eid+"-----"+ee.ename);
			}
			if(o==null){
				System.out.println(o);
			}
			
		}
		
		

	}

}

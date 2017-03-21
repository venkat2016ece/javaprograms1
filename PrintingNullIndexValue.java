package Arrays;
/*one employee class is there with the size 5,outof 5,2 are emtpy,
print that 2 null locations index value*/

public class PrintingNullIndexValue {

	public static void main(String[] args) {
		Emp e1=new Emp(111,"venkat");
		Emp e2=new Emp(111,"suresh");
		Emp e3=new Emp(111,"vivaan");
		
		Emp[] e=new Emp[5];
		e[0]=e1;
		e[1]=e2;
		e[3]=e3;
		
		for(int i=0;i<e.length;i++){
			if(e[i]==null){
				System.out.println(i);
			}
		}

	}

}

/*OUTPUT:
	2
	4*/

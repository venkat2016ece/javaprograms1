package Arrays;

public class ThreeApprochesToPrintTheData {

	public static void main(String[] args) {
		int[]a={10,20,30,40,50};
		
		//1st approach
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		//2nd approach
		//for loop
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		//3rd approach
		//for each loop
		
		for(int aa:a){
			System.out.println(aa);
		}

	}

}

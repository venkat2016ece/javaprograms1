package Arrays;

import java.util.Scanner;

public class ContactList2 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		String[] phoneList=new String[100];
		int filledElements=0;
		String phoneNum;
		
		System.out.println("enter phone number(or q to quit):");
		phoneNum=stdIn.nextLine();
		while(!phoneNum.equalsIgnoreCase("q")&&filledElements<phoneList.length){
			if(phoneNum.length()<1||phoneNum.length()>16){
				System.out.println("Invalid entry."+"must enter between 1 to 16 characters.");
			}
			else{
				phoneList[filledElements]=phoneNum;
				filledElements++;
			}
			System.out.println("Enter phone number(or q to quit):");
			phoneNum=stdIn.nextLine();
			
		}
		System.out.println("\n contact List:");
		for(int i=0;i<filledElements;i++){
			System.out.println((i+1)+". "+phoneList[i]);
		}

	}

}

package Arrays;

import java.util.Scanner;

public class ContactList {

	public static void main(String[] args) {
		 Scanner stdIn=new Scanner(System.in);
		 long[] phoneList;
		 int sizeofList;
		 long phoneNum;
		 System.out.println("How many conatact  numbers would you like to enter?");
		 sizeofList=stdIn.nextInt();
		 phoneList=new long[sizeofList];
		 for(int i=0;i<sizeofList;i++){
			 System.out.println("Enter phone number: ");
			 phoneNum=stdIn.nextLong();
			 phoneList[i]=phoneNum;
		 }
		 System.out.println("\n contacts list:");
		 for(int i=0;i<sizeofList;i++){
			 System.out.println((i+1)+" . " +phoneList[i]);
		 }

	}

}

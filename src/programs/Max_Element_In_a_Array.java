package programs;

import java.util.Scanner;
public class Max_Element_In_a_Array {

public static void main(String[]args) {
	Scanner dd = new Scanner(System.in);
	System.out.println("Enter the size of Array");
	int n =  dd.nextInt();
	int []arr = new int[n];
	System.out.println("Enter Array Elements");
	 for(int i=0;i<n;i++) {
		 arr[0] = dd.nextInt();
	 }
	 int max_Ele = 0;
	 for(int x:arr) {
		 if(x>max_Ele) {
			 max_Ele = x;
		 }
	 }
	 System.out.println("Max Element in a Array = "+ max_Ele);
	 System.out.println("Program execute Successfuly Thank you ");
dd.close();
}
}

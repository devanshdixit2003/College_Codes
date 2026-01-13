package programs;

import java.util.Scanner;
public class Palindrome_no {

	public static void main(String[] args) {
		 Scanner dd = new Scanner(System.in);
			System.out.println("Enter a Number to check Palindrome number");
			int number  = dd.nextInt();
			 int original_No = number;
			 int Palindrome_No = 0;
			 while(number>0) {
				 int no = number%10;
				 Palindrome_No = Palindrome_No*10+no;
				 number/=10;
			 }
			 System.out.println(Palindrome_No);
			 System.out.println(original_No==Palindrome_No?"Given Number is palindrome":"Given Number is not palindrome");

	}

}

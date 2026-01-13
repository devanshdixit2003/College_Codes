package programs;

import java.util.Scanner;
public class ArmstrongN_Number {

 public static void main(String[] args) {
	  Scanner dd = new Scanner(System.in);
		System.out.println("Enter a Number to check Armstrong number");
		int number  = dd.nextInt();
		 int copy_no = number;
		int power = (int)Math.log10(number)+1;
		int armstrong_No = 0;
		while(number>0) {
			int a = number%10;
			armstrong_No+=(int)Math.pow(a, power);
			number/=10;
		}
		System.out.println(armstrong_No);
		System.out.println(copy_no==armstrong_No?"Given No is armstrong":"Given No is not armstrong");
		 
	}

}

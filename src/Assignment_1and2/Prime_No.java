package Assignment_1and2;
import java.util.Scanner;
public class Prime_No {
	
	public static void main(String[] args) {
		Scanner dd = new Scanner(System.in);
		int num = dd.nextInt();
		System.out.println(prime_No(num)?"Given number is prime":"Given number is not prime");
		dd.close();
	}
    public static boolean prime_No (int num) {
	if(num<=1) return false;
	if(num%2==0) return false;
	if(num%3==0) return false;
	 for(int i=5;i<i*i;i+=2) {
		 if(num%i==0) return false;
	 }
	 return true;
}

}

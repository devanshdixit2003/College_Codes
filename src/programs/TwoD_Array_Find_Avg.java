package programs;

import java.util.Scanner;
public class TwoD_Array_Find_Avg {

	public static void main(String[] args) {
	Scanner dd =  new  Scanner(System.in);
	 System.out.print("Enter the size of row");
	 int m =  dd.nextInt();
	 System.out.print("Enter the size of column");
	 int n = dd.nextInt();
	 int [][]arr = new int[m][n];
	 System.out.println("Enter the element of array");
	 for(int i=0;i<m;i++) {
		 for(int j=0;j<n;j++) {
			 arr[i][j] = dd.nextInt();
		 }
	 }
	 int sum_Of_Element = 0;
	 for(int []x :arr) {
		 for(int y :x) {
			 sum_Of_Element+=y;
		 }
	 }
	 
	 int avg = sum_Of_Element/(m+n);
	 System.out.println("Avg of 2d array is :"+avg);
	}

}

package programs;
import java.util.Scanner;
public class Square_Matrix {
	
	                       // Method for addition
    static void addition(int[][] matrixA, int[][] matrixB,int [][]result,int m, int n) {
        System.out.println("Addition is going:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                result[i][j] = matrixA[i][j]+ matrixB[i][j];
            }
        }
        System.out.println("Addition is Completed:"); 
        System.out.println("Matrix element print after adding");
        printMatrix(result,m,n);
        
    }
                        // Method for subtraction
    static void substraction(int[][] matrixA, int[][] matrixB,int [][]result,int m, int n) {
        System.out.println("Substraction is going:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                result[i][j] = matrixA[i][j]-matrixB[i][j];
            }
        }
        System.out.println("Substraction is Completed:"); 
        System.out.println("Matrix element print after substraction");
        printMatrix(result,m,n);
        
    }
    
                            // Method for Multiplication
    static void multiplication(int[][] matrixA, int[][] matrixB,int [][]result,int m, int n) {
    	              if (m != n) {
                    System.out.println("Multiplication not possible.");
                          return;
                         }
    	System.out.println("Multiplication is going:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                result[i][j] = matrixA[i][j]*matrixB[i][j];
            }
        }
        System.out.println("multiplication is Completed:"); 
        System.out.println("Matrix element print after multiplication");
        printMatrix(result,m,n);
        
    }
    
              // Method for transpose
    static void transpose(int[][] matrix, int m, int n,int[][]result) {
        System.out.println("Transpose is going on:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix[j][i];
            }   
        }
        System.out.println("Transpose is Completed:"); 
        System.out.println("Matrix element print after Transposation");
        printMatrix(result,m,n);
    }  
    
    
         
	
	                 // For print matrix element
      	 static void printMatrix(int[][] matrix, int m, int n) {
               for (int i = 0; i < m; i++) {
                       for (int j = 0; j < n; j++) {
                           System.out.print(matrix[i][j] + " ");
            }
                            System.out.println();
        }
    }
	
	 
	                 // for read matrix element 
	 static void readElement(int [][]arr, int m,int n,Scanner dd) {
		for(int i=0;i<m;i++) {
			System.out.println("Enter the "+(i+1)+"row elements");
			for(int j=0;j<n;j++) {
				arr[i][j] = dd.nextInt();
			}
		}
	 }
		   
		// for check square matrix
	static void squareCheck(int m,int n){
			 if (m == n)
		            System.out.println("Matrix is a Square Matrix.");
		        else
		            System.out.println("Matrix is NOT a Square Matrix.");
		}
	
		 
		 // for Diagonal check
	    
	  static boolean diagonalCheck(int[][] A, int n) {
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            if (i != j && A[i][j] != 0) {
	                return false;
	            }
	        }
	    }
	    return true;
	}
	
	  
	                  // for IdentityMatrixCheck
		  static boolean identityCheck(int[][] matrixA, int m,int n) {
			    for (int i = 0; i < m; i++) {
			        for (int j = 0; j < n; j++) {
			            if ((i == j && matrixA[i][j] != 1) || (i != j && matrixA[i][j] != 0)) {
			                return false;
			            }
			        }
			    }
			    return true;
			}
	  
	

	public static void main(String[] args) {
		Scanner dd = new Scanner(System.in);
		System.out.println("Enter the details for matrix A");
		System.out.println("Enter the row size");
		int m = dd.nextInt();
		System.out.println("Enter the cloumn size");
		int n = dd.nextInt();
		int [][]matrixA = new int[m][n];
		int [][]matrixB = new int[m][n];
		System.out.println("Enter matrixA element");
		readElement(matrixA,m,n,dd);
		System.out.println("Enter matrixB element");
		readElement(matrixB,m,n,dd);
		int [][]result = new int[m][n];
		int choice =-1;
		while(choice!=0) {
			System.out.println("Press 1 for Addition");
			System.out.println("Press 2 for Substraction");
			System.out.println("Press 3 for Multiplication");
			System.out.println("Press 4 for Print MatrixA");
			System.out.println("Press 5 for Print MatrixB");
			System.out.println("Press 6 for Transpose");
			System.out.println("Press 7 for squareCheck");
			System.out.println("Press 8 for diagonalCheck");
			System.out.println("Press 9 for IdentityCheck");
			System.out.println("Enter the choice to perform task on matrix");
			choice = dd.nextInt();
		     
			switch(choice){
			
			case 1: 
				System.out.println("MatrixA = "+"\n");
				printMatrix(matrixA,m,n);
				System.out.println("MatrixB = "+"\n");
				printMatrix(matrixB,m,n);
				addition(matrixA,matrixB,result,m,n);
				break;
			case 2: 
				System.out.println("MatrixA = "+"\n");
				printMatrix(matrixA,m,n);
				System.out.println("MatrixB = "+"\n");
				printMatrix(matrixB,m,n);
				substraction(matrixA,matrixB,result,m,n);
				break;
				
		   case 3:
		   System.out.println("MatrixA = "+"\n");
			printMatrix(matrixA,m,n);
			System.out.println("MatrixB = "+"\n");
			printMatrix(matrixB,m,n);
			    multiplication(matrixA,matrixB,result,m,n);
			       break;
		   case 4:
			   printMatrix(matrixA,m,n);
			   break;
		   case 5:
			   printMatrix(matrixB,m,n);
			   break;
		   case 6: 
			   transpose(matrixA,m,n,result);
			   break;
		   case 7:
			    squareCheck(m,n);
			    break;
		   case 8:
			   if (diagonalCheck(matrixA, n))
				    System.out.println("Matrix is Diagonal");
				else
				    System.out.println("Matrix is NOT Diagonal");
			   break;
		   case 9:
			   if (identityCheck(matrixA,m,n))
				    System.out.println("Matrix is Identity");
				else
				    System.out.println("Matrix is NOT Identity");
			   break;
		   case 0:
			   System.out.println("Program executed successfully");
			   return ;
	
		  default:
			   System.out.println("Enter valid number");
			   
				
		}
		}
		
	}

}

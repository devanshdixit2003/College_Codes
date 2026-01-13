package programs;

import java.util.Scanner;

public class Calculator {

    // ---------- Methods for Operations ----------
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static int square(int a) {
        return a * a;
    }

    public static int cube(int a) {
        return a * a * a;
    }

    public static int absolute(int a) {
        return Math.abs(a);
    }

    // ---------- Main Menu ----------
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n===== Calculator Menu =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Square");
            System.out.println("7. Cube");
            System.out.println("8. Absolute");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = dd.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    int a1 = dd.nextInt();
                    int b1 = dd.nextInt();
                    System.out.println("Addition = " + add(a1, b1));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    int a2 = dd.nextInt();
                    int b2 = dd.nextInt();
                    System.out.println("Subtraction = " + subtract(a2, b2));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    int a3 = dd.nextInt();
                    int b3 = dd.nextInt();
                    System.out.println("Multiplication = " + multiply(a3, b3));
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    double a4 = dd.nextDouble();
                    double b4 = dd.nextDouble();
                    System.out.println("Division = " + divide(a4, b4));
                    break;

                case 5:
                    System.out.print("Enter two numbers: ");
                    int a5 = dd.nextInt();
                    int b5 = dd.nextInt();
                    System.out.println("Remainder = " + remainder(a5, b5));
                    break;

                case 6:
                    System.out.print("Enter a number: ");
                    int a6 = dd.nextInt();
                    System.out.println("Square = " + square(a6));
                    break;

                case 7:
		          System.out.print("Enter a number: ");
		           int a7 = dd.nextInt();
		           System.out.println("Cube = " + cube(a7));
		             break;

                case 8:
                    System.out.print("Enter a number: ");
                    int a8 = dd.nextInt();
                    System.out.println("Absolute = " + absolute(a8));
                    break;

                case 9:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 9);

        dd.close();
    }
}

package programs;

import java.util.Scanner;

class BankAccount {
    String name;
    int accountNumber;
    double balance;

    BankAccount(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully!");
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = null;

        while (true) {
            System.out.println("\n--- BANK MANAGEMENT SYSTEM ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); // buffer clear
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    account = new BankAccount(name, accNo);
                    System.out.println("Account created successfully!");
                    break;

                case 2:
                    if (account != null) {
                        System.out.print("Enter amount to deposit: ");
                        double dep = sc.nextDouble();
                        account.deposit(dep);
                    } else {
                        System.out.println("Please create account first!");
                    }
                    break;

                case 3:
                    if (account != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double wit = sc.nextDouble();
                        account.withdraw(wit);
                    } else {
                        System.out.println("Please create account first!");
                    }
                    break;

                case 4:
                    if (account != null) {
                        account.checkBalance();
                    } else {
                        System.out.println("Please create account first!");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using Bank Management System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}


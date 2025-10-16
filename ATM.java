import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 1000.00; 
        boolean running = true;

        System.out.println("Welcome to the BSCI ATM Simulator!");
        System.out.println("------------------------------------");

        while (running) {
            
            System.out.println("\nChoose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("\nYour current balance is: $" + balance);
            } else if (choice == 2) {
                System.out.print("Enter amount to deposit: $");
                double deposit = input.nextDouble();
                if (deposit > 0) {
                    balance += deposit;
                    System.out.println("Successfully deposited $" + deposit);
                } else {
                    System.out.println("Invalid deposit amount!");
                }
            } else if (choice == 3) {
                System.out.print("Enter amount to withdraw: $");
                double withdraw = input.nextDouble();
                if (withdraw > balance) {
                    System.out.println("Insufficient funds!");
                } else if (withdraw <= 0) {
                    System.out.println("Invalid withdrawal amount!");
                } else {
                    balance -= withdraw;
                    System.out.println("You withdrew $" + withdraw);
                }
            } else if (choice == 4) {
                System.out.println("\nThank you for using the BSCI ATM!");
                running = false;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }

        input.close();
    }
}

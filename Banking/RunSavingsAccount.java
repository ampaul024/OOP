package Banking;

import java.util.Scanner;

public class RunSavingsAccount {

    public static void main(String[] args) {

        Scanner jp = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount();

        System.out.print("Enter an amount to deposit: ");
        double interestRate = jp.nextDouble();
        SavingsAccount.setInterestRate(interestRate);

        System.out.print("Enter an amount to deposit: ");
        double amount = jp.nextDouble();
        savings.deposit(amount);

        while (true) {
            System.out.print("Enter D for another deposit or W for withdraw: ");
            String choice = jp.next();
            if (choice.equalsIgnoreCase("D")) {
                System.out.print("Enter an amount to deposit: ");
                amount = jp.nextDouble();
                savings.deposit(amount);

            } else if (choice.equalsIgnoreCase("W")) {
                System.out.print("Enter an amount to withdraw: ");
                amount = jp.nextDouble();
                savings.withdraw(amount);

            } else {
                System.out.println("Invalid input");
                continue;

            }

            SavingsAccount.showBalance(savings);
            if (savings.getBalance() > 1000) {
                savings.addInterest();
                System.out.println("New balance with applied interest: " + savings.getBalance());
            }
        }
    }
}

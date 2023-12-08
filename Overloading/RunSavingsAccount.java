package Overloading;

import java.util.Scanner;

import Banking.SavingsAccount;

public class RunSavingsAccount {
  public static void main(String[] args) {

    SavingsAccount savings = new SavingsAccount();

    double inRate, aMount;
    char choice;

    try (Scanner sc = new Scanner(System.in)) {

      System.out.println("Enter interest rate: ");
      inRate = sc.nextDouble();

      SavingsAccount.setInterestRate(inRate);
      System.out.println("Enter deposit amount: ");

      aMount = sc.nextDouble();
      savings.deposit(aMount);

      SavingsAccount.showBalance(savings);

      System.out.println("Press D for another deposit or W to withdraw: ");
      choice = sc.next().charAt(0);

      if (choice == 'd' || choice == 'D') {

        System.out.println("Enter the deposit amount: ");
        aMount = sc.nextDouble();
        savings.deposit(aMount);

        if (aMount >= 1000) {

          savings.addInterest();

        }

        System.out.println("Your new balance is: " + savings.getBalance());
      }

      if (choice == 'w' || choice == 'W') {

        System.out.println("Enter the amount: ");
        aMount = sc.nextDouble();
        savings.withDraw(aMount);
        System.out.println("Your new balance is: " + savings.getBalance());
      }
    }

  }

}

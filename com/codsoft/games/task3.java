package com.codsoft.games;

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}

class ATM {
    private BankAccount bankAccount;
    private Scanner scanner;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("\nWelcome to the Unique ATM Experience");
        System.out.println("1. Grab Cash");
        System.out.println("2. Save Treasure");
        System.out.println("3. Check Fortune");
        System.out.println("4. Exit the Adventure");
    }

    public void handleChoice(int choice) {
        switch (choice) {
            case 1:
                grabCash();
                break;
            case 2:
                saveTreasure();
                break;
            case 3:
                checkFortune();
                break;
            case 4:
                System.out.println("Thank you for your adventurous spirit. Farewell!");
                System.exit(0);
                break;
            default:
                System.out.println("It seems you've encountered a mystical realm. Please choose again.");
        }
    }

    private void grabCash() {
        System.out.print("Enter the amount you wish to unearth: $");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("You must unearth a positive treasure. Try again.");
        } else if (bankAccount.withdraw(amount)) {
            System.out.println("Your treasure hunt was successful! You now have $"
                    + bankAccount.getBalance() + " remaining.");
        } else {
            System.out.println("Alas! Your expedition did not yield the desired fortune. Seek again!");
        }
    }

    private void saveTreasure() {
        System.out.print("Enter the amount of treasure you wish to save: $");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Your treasure chest yearns for positive riches. Try again.");
        } else {
            bankAccount.deposit(amount);
            System.out.println("Your treasure has been safely stored. You now have $"
                    + bankAccount.getBalance() + " in your chest.");
        }
    }

    private void checkFortune() {
        System.out.println("Your current fortune stands at: $" + bankAccount.getBalance());
    }
}

public class task3 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000.0);
        ATM atm = new ATM(bankAccount);
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                atm.displayMenu();
                System.out.print("Select your adventure: ");
                int choice = scanner.nextInt();
                atm.handleChoice(choice);
            }
        }
    }
}

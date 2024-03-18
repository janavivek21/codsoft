package com.codsoft.games;

import java.util.Scanner;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Enigma of Numbers!");
        System.out.println("A mystery number between 1 and 100 awaits your discovery.");

        int secretNumber = random.nextInt(100) + 1; // Generate random number between 1 and 100
        int attempts = 0;
        int maxAttempts = 10; // Maximum number of attempts

        while (true) {
            System.out.print("\nEnter your guess (1-100): ");
            int guess;
            try {
                guess = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Oops! That was not a valid number. Please try again.");
                scanner.nextLine(); // Clear the input buffer
                continue;
            }

            if (guess < 1 || guess > 100) {
                System.out.println("Hmm... Please enter a number between 1 and 100.");
                continue;
            }

            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You've found the hidden number in " + attempts + " attempts.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Your guess is lower than the hidden number. Aim a bit higher.");
            } else {
                System.out.println("Your guess is higher than the hidden number. Try a bit lower.");
            }

            if (attempts >= maxAttempts) {
                System.out.println("You've used up all your attempts. The hidden number was: " + secretNumber);
                break;
            }
        }

        System.out.println("\nThanks for playing!");

        scanner.close();
    }
}

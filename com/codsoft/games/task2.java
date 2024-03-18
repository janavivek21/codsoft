package com.codsoft.games;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks obtained in each subject
        System.out.println("\uD83C\uDF93 Welcome to the Grade Calculator! \uD83C\uDF93\n");
        System.out.println("Please enter marks obtained in each subject (out of 100):");
        int[] marks = new int[5]; // Assuming 5 subjects
        String[] subjects = {"Math", "Science", "English", "History", "Art"};
        for (int i = 0; i < marks.length; i++) {
            System.out.print(subjects[i] + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculate Total Marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate Average Percentage
        double averagePercentage = (double) totalMarks / marks.length;

        // Grade Calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Results with Creativity
        System.out.println("\uD83C\uDF89\uD83D\uDCD6 Results \uD83D\uDCD6\uD83C\uDF89");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade + "\n");

        // Personalized Message
        String message = "";
        if (grade == 'A') {
            message = "Congratulations! You did an excellent job. Keep up the good work!";
        } else if (grade == 'B') {
            message = "Well done! You have performed very well. Keep striving for excellence!";
        } else if (grade == 'C') {
            message = "Good job! You have passed, but there's always room for improvement. Keep pushing yourself!";
        } else if (grade == 'D') {
            message = "You've made it through, but there's definitely room for improvement. Keep working hard!";
        } else {
            message = "Hmm, it seems like there's some room for improvement. Don't lose heart, keep pushing forward!";
        }
        System.out.println(message + "\n");

        // Farewell
        System.out.println("Thank you for using the Grade Calculator. Study hard and aim high! Goodbye! \uD83D\uDC4B");

        scanner.close();
    }
}

package com.colak.checkstyle;

public class Example {
    public static void main(String args[]) {
        System.out.println("Hello, World!");  // Incorrect indentation
        int number=5; // No space around the assignment operator

        if (number>0) { // No space after the comma and before the opening brace
            System.out.println("Positive Number");
        }else{
            System.out.println("Non-positive Number"); // No space before the opening brace
        }

        for(int i=0; i<5; i++) // No space after `for`, `i`, and `5`
        {
            System.out.println("Count: " + i); // Opening brace should be on the same line
        }
    }
}

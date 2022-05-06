//Tony Fusco
//CSC160680
//Homework 7
//3/26/22

package edu.arapahoe.csc160;

// Java program to Sort a String
// Using toCharArray() method
// With using the sort() method

// Importing Arrays class from java.util package
import java.util.Arrays;
import java.util.Scanner;

// Main class
public class Main {
    //  string alphabetically
    public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Custom string as input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = input.nextLine();
        String outputString = sortString(inputString);

        // Print and display commands

        // Input string
        System.out.println("Input String: " + inputString);
        // Output string
        System.out.println("Output String : "
                + outputString);
    }
}
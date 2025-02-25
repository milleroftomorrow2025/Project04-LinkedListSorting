/** CSC6031 Week4 - SortedLinkedListApp in Java - A Miller */

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * SortedLinkedListApp
 * 
 * <p>This program reads a list of integer numbers from the standard input,
 * saves them into a LinkedList, sorts them from smallest to largest,
 * and then prints the sorted list. It is designed to be executed via the command
 * line, and it leverages the Java Collections Framework for data storage and sorting.</p>
 * 
 * <p>Example command-line usage:
 * <br>Compile: javac SortedLinkedListApp.java
 * <br>Run: java SortedLinkedListApp
 * <br>Generate Javadoc: javadoc -d doc SortedLinkedListApp.java
 * </p>
 * 
 * <p>This infrastructure will be reused in future assignments, making it
 * essential to follow best practices in design, documentation, and code reuse.</p>
 * 
 * @author Andrew Miller
 */
public class SortedLinkedListApp {

    /**
     * The main method reads integers from the standard input, stores them in a LinkedList,
     * sorts the list, and prints the sorted list.
     *
     * <p>It instructs the user to enter integer values separated by whitespace.
     * Input continues until a non-integer token is encountered.</p>
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a Scanner object to read from standard input (System.in)
        Scanner scanner = new Scanner(System.in);
        
        // Create a LinkedList to store integer values
        LinkedList<Integer> numbers = new LinkedList<>();
        
        // Prompt the user for input
        System.out.println("Enter integer numbers separated by whitespace.");
        System.out.println("Input a non-integer value to finish:");

        // Read input tokens until a non-integer is encountered
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                // Read the next integer and add it to the LinkedList
                int number = scanner.nextInt();
                numbers.add(number);
            } else {
                // Break the loop if the token is not an integer
                break;
            }
        }
        
        // Close the scanner to free resources
        scanner.close();
        
        // Sort the LinkedList using the Collections Framework's sort method
        Collections.sort(numbers);
        
        // Print the sorted LinkedList
        System.out.println("Sorted LinkedList: " + numbers);
    }
}

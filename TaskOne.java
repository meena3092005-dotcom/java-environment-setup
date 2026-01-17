// Task 1 - Java Environment Setup & First Executable Program
// Author: Meena

public class TaskOne {

    public static void main(String[] args) {

        System.out.println("Java Environment Setup Successful!");
        System.out.println("This is my first executable Java program.");

        // Display command-line arguments
        if (args.length > 0) {
            System.out.println("\nCommand Line Arguments:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + " : " + args[i]);
            }
        } else {
            System.out.println("\nNo Command Line Arguments Provided.");
        }
    }
}


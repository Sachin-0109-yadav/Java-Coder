package com.company;

// Customized exception class
class CustomizedException extends Exception {
    public CustomizedException(String message) {
        super(message);
    }
}
class ExceptionExample {
    // Method that throws a checked exception
    public static void methodWithCheckedException() throws CustomizedException {
        throw new CustomizedException("This is a checked exception.");
    }
    // Method that throws an unchecked exception
    public static void methodWithUncheckedException() {
        throw new RuntimeException("This is an unchecked exception.");
    }

    public static void main(String[] args) {
        try {
            // Code that may throw exceptions
            methodWithCheckedException();
            methodWithUncheckedException();
        } catch (CustomizedException e) {
            // Catching the checked exception
            System.out.println("Caught checked exception: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catching the unchecked exception
            System.out.println("Caught unchecked exception: " + e.getMessage());
        } finally {
            // Code that will always be executed, whether an exception occurs or not
            System.out.println("Finally block executed.");
        }

        // Using the throw keyword to throw an exception
        try {
            throw new CustomizedException("Using throw keyword to throw an exception.");
        } catch (CustomizedException e) {
            System.out.println("Caught exception using throw keyword: " + e.getMessage());
        }

        // Using the throws keyword in a method declaration
        try {
            methodWithCheckedException();
        } catch (CustomizedException e) {
            System.out.println("Caught exception using throws keyword: " + e.getMessage());
        }
    }
}
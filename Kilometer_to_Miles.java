import java.util.Scanner;

public class Kilometer_to_Miles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the distance in kilometers from the user.
        System.out.println("Enter the distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        // Convert kilometers to miles.
        double miles = kilometers * 0.621371;

        // Print the result.
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
    }
}
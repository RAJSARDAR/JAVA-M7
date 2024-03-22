import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the Celsius degree
        System.out.print("Enter temperature in Celsius: ");
        
        // Read the Celsius degree from the console
        double celsius = scanner.nextDouble();
        
        // Close the Scanner object to prevent resource leak
        scanner.close();
        
        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        
        // Display the result
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
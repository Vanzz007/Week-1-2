import java.util.Scanner;
public class L3Q1 {   
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert to Fahrenheit
        double fahrenheitResult = (celsius * 9/5) + 32;

        // Print result
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
        
        scanner.close();
    }
}
    


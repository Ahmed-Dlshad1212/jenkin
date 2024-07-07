import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1 = 10.0; // Default value for num1
        double num2 = 5.0;  // Default value for num2
        char operation = '+'; // Default operation

        System.out.println("Running arithmetic operations...");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Operation: " + operation);

        double result = calculateResult(num1, num2, operation);
        System.out.println("The result is: " + result);
    }

    private static double calculateResult(double num1, double num2, char operation) {
        double result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Error: invalid operation");
                break;
        }
        return result;
    }
}

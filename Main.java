import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user and handle input gracefully
        double num1 = readDouble(scanner, "Enter first number: ");
        double num2 = readDouble(scanner, "Enter second number: ");
        char operation = readOperation(scanner);

        double result = calculateResult(num1, num2, operation);
        System.out.println("The result is: " + result);
    }

    private static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextDouble();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // consume invalid input
            }
        }
    }

    private static char readOperation(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Enter an operation (+, -, *, /): ");
                return scanner.next().charAt(0);
            } catch (java.util.InputMismatchException | StringIndexOutOfBoundsException e) {
                System.out.println("Invalid input. Please enter a valid operation (+, -, *, /).");
                scanner.next(); // consume invalid input
            }
        }
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

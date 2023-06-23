// 1. Import package Scanner.
import java.util.Scanner;

// 2. Create the main method.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 3. Declare variables to store the operands, operator, and result.
        double operandOne;
        double operandTwo;
        String operator;
        double result = 0;

        // 4. Prompt the user to enter the first operand and store.

        System.out.println("Enter first number: ");
        operandOne = scanner.nextDouble();
        scanner.nextLine();

        // 5. Prompt the user to enter the operator (+, -, *, /) and store.

        System.out.println("Enter your operator: ");
        operator = scanner.nextLine();

        // 6. Prompt the user to enter the second operand and store.

        System.out.println("Enter second number: ");
        operandTwo = scanner.nextDouble();

        // 7. Use a switch statement to perform the calculation.

        switch (operator) {

        // 8. For each case, calculate the result.

            case "-":
                result = operandOne - operandTwo;
                // System.out.println("Result" + result);
                break;
            case "+":
                result = operandOne + operandTwo;
                // System.out.println("Result" + result);
                break;
            case "*":
                result = operandOne * operandTwo;
                // System.out.println("Result" + result);
                break;
            case "/":
                result = operandOne / operandTwo;
                // System.out.println("Result: " + result);
                break;

            // 9. If the operator is invalid, display an error message.
            default:
                System.out.println("False value: " + operator);
        }
      
        // 10. Display the result.

        System.out.println("Result: " + result);

    }
}
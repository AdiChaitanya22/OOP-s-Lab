public class CommandLineCalculator {
    public static void main(String[] args) {
        // Check if sufficient arguments are provided
        if (args.length != 3) {
            System.out.println("Usage: java CommandLineCalculator <num1> <operator> <num2>");
            System.out.println("Example: java CommandLineCalculator 20 + 30");
            return;
        }

        try {
            // Parse the command-line arguments
            int num1 = Integer.parseInt(args[0]);
            String operator = args[1];
            int num2 = Integer.parseInt(args[2]);
            int result = 0;

            // Perform the operation based on the operator
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    System.out.println("Sum of " + num1 + " and " + num2 + " is " + result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println("Difference of " + num1 + " and " + num2 + " is " + result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println("Product of " + num1 + " and " + num2 + " is " + result);
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Quotient of " + num1 + " and " + num2 + " is " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Use +, -, *, or /.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please provide integers as operands.");
        }
    }
}

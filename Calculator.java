public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Create an object of the Calculator class
        Calculator calc = new Calculator();

        // Demonstrate all method variations
        int sum1 = calc.add(5, 10);               // Two integers
        double sum2 = calc.add(5.5, 10.3);        // Two doubles
        int sum3 = calc.add(1, 2, 3);             // Three integers

        // Print the results
        System.out.println("Sum of two integers (5 + 10): " + sum1);
        System.out.println("Sum of two doubles (5.5 + 10.3): " + sum2);
        System.out.println("Sum of three integers (1 + 2 + 3): " + sum3);
    }
}

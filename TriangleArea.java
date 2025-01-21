import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and height of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area
        double area = 0.5 * base * height;

        // Display the area
        System.out.println("The area of the triangle is: " + area);

        scanner.close(); // Close the scanner
    }
}

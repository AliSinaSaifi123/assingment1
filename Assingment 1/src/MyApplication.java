import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for ten points
        Point[] points = new Point[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter x coordinate for point " + (i + 1) + ": ");
            double x = scanner.nextDouble();
            System.out.print("Enter y coordinate for point " + (i + 1) + ": ");
            double y = scanner.nextDouble();
            points[i] = new Point(x, y);
        }

        scanner.close();

        Shape shape = new Shape(points);

        // Display results
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Longest Side: " + shape.longestSide());
        System.out.println("Average Side: " + shape.averageSide());
    }
}

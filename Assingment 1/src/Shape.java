// Shape.java

public class Shape {
    private Point[] points;

    // Constructor to initialize a shape with an array of points.
    public Shape(Point[] points) {
        this.points = points;
    }

    // Calculate and return the perimeter of the shape.
    public double perimeter() {
        double perimeter = 0;
        int n = points.length;

        for (int i = 0; i < n; i++) {
            Point current = points[i];
            Point next = points[(i + 1) % n];
            perimeter += current.distanceTo(next);
        }

        return perimeter;
    }

    // Find and return the length of the longest side in the shape.
    public double longestSide() {
        double longest = 0;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = points[i].distanceTo(points[j]);
                if (distance > longest) {
                    longest = distance;
                }
            }
        }

        return longest;
    }

    // Calculate and return the average length of the sides in the shape.
    public double averageSide() {
        double totalLength = 0;
        int n = points.length;

        for (int i = 0; i < n; i++) {
            Point current = points[i];
            Point next = points[(i + 1) % n];
            totalLength += current.distanceTo(next);
        }

        return totalLength / n;
    }
}

package Day2;
// LineComparison.java
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

        // Example points
        double x1 = 1.0, y1 = 2.0;
        double x2 = 3.0, y2 = 4.0;

        double length = calculateLength(x1, y1, x2, y2);
        System.out.println("Length of the line is: " + length);
    }

    public static double calculateLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}



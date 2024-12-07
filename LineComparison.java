package Day2;// LineComparison.java
// LineComparison.java
public class LineComparison {
    private double length;

    public LineComparison(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

        // Example points for length calculation
        double x1 = 1.0, y1 = 2.0;
        double x2 = 3.0, y2 = 4.0;

        double length1 = calculateLength(x1, y1, x2, y2);
        System.out.println("Length of the first line is: " + length1);

        // Example points for equality check
        LineComparison line1 = new LineComparison(length1);
        LineComparison line2 = new LineComparison(2.83); // Change value for testing equality

        if (line1.equals(line2)) {
            System.out.println("Both lines are equal.");
        } else {
            System.out.println("Lines are not equal.");
        }

        // Comparing two lengths
        compareLines(line1, line2);
    }

    public static double calculateLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof LineComparison)) return false;
        LineComparison other = (LineComparison) obj;
        return Double.compare(length, other.length) == 0;
    }

    public static void compareLines(LineComparison line1, LineComparison line2) {
        if (line1.getLength() == line2.getLength()) {
            System.out.println("Both lines are equal.");
        } else if (line1.getLength() > line2.getLength()) {
            System.out.println("Line 1 is greater than Line 2.");
        } else {
            System.out.println("Line 1 is less than Line 2.");
        }
    }
}

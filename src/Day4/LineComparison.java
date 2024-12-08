package Day4; // package names should be in lower case

import java.util.Scanner;

class Line implements Comparable<Line> { // Implement Comparable<Line>
    private double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double length() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line line = (Line) obj;
        return (x1 == line.x1 && y1 == line.y1 && x2 == line.x2 && y2 == line.y2);
    }

    @Override
    public int compareTo(Line other) { // Corrected instance method
        return Double.compare(this.length(), other.length());
    }
}

public class LineComparison { // Class names should be in PascalCase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get coordinates for Line 1
        System.out.println("Enter coordinates for Line 1 (x1, y1, x2, y2): ");
        double x1_1 = scanner.nextDouble();
        double y1_1 = scanner.nextDouble();
        double x2_1 = scanner.nextDouble();
        double y2_1 = scanner.nextDouble();
        Line line1 = new Line(x1_1, y1_1, x2_1, y2_1);

        // Get coordinates for Line 2
        System.out.println("Enter coordinates for Line 2 (x1, y1, x2, y2): ");
        double x1_2 = scanner.nextDouble();
        double y1_2 = scanner.nextDouble();
        double x2_2 = scanner.nextDouble();
        double y2_2 = scanner.nextDouble();
        Line line2 = new Line(x1_2, y1_2, x2_2, y2_2);
        System.out.println("Length of the Line: " + line2.length());


        // Check equality
        if (line1.equals(line2)) {
            System.out.println("Line 1 is equal to Line 2.");
        } else {
            System.out.println("Line 1 is not equal to Line 2.");
        }

        // Compare lengths
        int comparison = line1.compareTo(line2); // Corrected to call on instance
        if (comparison == 0) {
            System.out.println("Line 1 is equal to Line 2 based on length.");
        } else if (comparison > 0) {
            System.out.println("Line 1 is greater than Line 2 based on length.");
        } else {
            System.out.println("Line 1 is less than Line 2 based on length.");
        }

        scanner.close();
    }
}


package Day4; // Package names should be in lowercase

import java.util.Scanner;

class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Line implements Comparable<Line> {
    private Point startPoint, endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double length() {
        return Math.sqrt(Math.pow((endPoint.getX() - startPoint.getX()), 2) +
                Math.pow((endPoint.getY() - startPoint.getY()), 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line otherLine = (Line) obj;
        return Double.compare(this.length(), otherLine.length()) == 0;
    }

    @Override
    public int compareTo(Line other) {
        return Double.compare(this.length(), other.length());
    }
}

public class LineComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get coordinates for Line 1
        System.out.println("Enter coordinates for Line 1 (x1, y1, x2, y2): ");
        Point startPoint1 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point endPoint1 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Line line1 = new Line(startPoint1, endPoint1);

        // Get coordinates for Line 2
        System.out.println("Enter coordinates for Line 2 (x1, y1, x2, y2): ");
        Point startPoint2 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point endPoint2 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Line line2 = new Line(startPoint2, endPoint2);

        // Display lengths
        System.out.println("Length of Line 1: " + line1.length());
        System.out.println("Length of Line 2: " + line2.length());

        // Check equality
        if (line1.equals(line2)) {
            System.out.println("Line 1 is equal to Line 2.");
        } else {
            System.out.println("Line 1 is not equal to Line 2.");
        }

        // Compare lengths
        int comparison = line1.compareTo(line2);
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

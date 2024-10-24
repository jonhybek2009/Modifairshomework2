public class Circle {
    private static final double PI = 3.14159;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double areasCalculate() {
        return PI * (radius * radius);
    }

    public static double Circumference(double radius) {
        return PI * 2 * radius;
    }
}


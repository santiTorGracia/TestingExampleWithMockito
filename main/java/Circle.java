public class Circle {

    private int radius;

    public Circle(int radius) {
        if (radius <= 0) throw new IllegalArgumentException("Radius can't be zero or smaller.");
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}

public class Circle extends GeometricFigure {
    private double radius;

    public Circle () {
        radius = 1;
    }

    public Circle (double radius) {
        this.radius = radius;
    }

    public Circle (double radius, String color, boolean filling) {
        super (color,filling);
        this.radius = radius;
    }

    public double getArea () {
        return 2 * Math.PI * Math.pow(radius,2);
    }

    public double getPerimeter () {
        return 2 * Math.PI * radius;
    }

    public String toString () {
        return "Soy un círculo con radio = " + radius + ", esta es mi superclase: " + super.toString();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

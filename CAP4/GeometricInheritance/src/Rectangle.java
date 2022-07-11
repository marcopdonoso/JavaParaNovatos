public class Rectangle extends GeometricFigure {
    private double width;
    private double height;

    public Rectangle () {
        width = 1;
        height = 1;
    }

    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle (double width, double height, String color, boolean filling) {
        super(color, filling);
        this.width = width;
        this.height = height;
    }

    public double getArea () {
        return width * height;
    }

    public double getPerimeter () {
        return 2 * width + 2 * height;
    }

    public String toString () {
        return "Soy un rectángulo con ancho = " + width + " y alto = " + height + ", esta es mi superclase: " + super.toString();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

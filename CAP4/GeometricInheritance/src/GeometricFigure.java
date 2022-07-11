public class GeometricFigure {
    private String color;
    private boolean filling;

    public GeometricFigure() {
        color = "Red";
        filling = true;
    }

    public GeometricFigure (String color, boolean filling) {
        this.color = color;
        this.filling = filling;
    }

    public String toString() {
        String s = "Soy una figura de color " + color + " y ";
        if (filling) {
            s += "rellena";
        } else {
            s += "no rellena";
        }
        return s;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilling() {
        return filling;
    }

    public void setFilling(boolean filling) {
        this.filling = filling;
    }
}

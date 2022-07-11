public class Square extends Rectangle {
    public Square () {
        super();
    }

    public Square (double side) {
        super(side,side);
    }

    public Square (double side, String color, boolean filling) {
        super(side,side,color,filling);
    }

    public void setWidth (double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    public void setHeight (double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    public String toString () {
        return "Soy un cuadrado de lado = " + super.getWidth() + ", esta es mi super clase: " + super.toString();
    }
}

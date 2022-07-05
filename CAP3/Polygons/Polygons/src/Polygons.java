public class Polygons {
    private int sidesNumber;
    private double sideLength;
    private double apothem;
    Polygons(int sidesNumber) {
        this.sidesNumber = sidesNumber;
    }
    public double areaCalc() {
        return (sidesNumber * sideLength * apothem) / 2;
    }

    public double periCalc() {
        return (sidesNumber * sideLength);
    }

    public String polyDen() {
        String denomination;
        switch (sidesNumber) {
            case 3:
                denomination = "Triangulo";
                break;
            case 4:
                denomination = "Cuadrilatero";
                break;
            case 5:
                denomination = "Pentagono";
                break;
            case 6:
                denomination = "Hexagono";
                break;
            case 7:
                denomination = "Heptagono";
                break;
            case 8:
                denomination = "Octagono";
                break;
            case 9:
                denomination = "Eneagono";
                break;
            case 10:
                denomination = "Decagono";
                break;
            case 11:
                denomination = "Endecagono";
                break;
            case 12:
                denomination = "Dodecagono";
                break;
            default:
                denomination = "Invalid Polygon";
        }
        return denomination;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public void setApothem(double apothem) {
        this.apothem = apothem;
    }
}

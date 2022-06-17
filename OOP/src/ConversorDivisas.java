public class ConversorDivisas {

    double changeType;

    // Constructors
    ConversorDivisas() {
        this.changeType = 0.85;
    }

    ConversorDivisas(double changeType) {
        this.changeType = changeType;
    }

    //Methods
    public double librasToEuros(double libras) {
        return libras * changeType;
    }

    public  double eurosToLibras(double euros) {
        return euros / changeType;
    }
}

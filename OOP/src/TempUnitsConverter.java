public class TempUnitsConverter {

    public double celciusToFarenheit(double tempCelcius) {
        return 1.8 * tempCelcius + 32;
    }

    public double farenheitToCelcius(double tempFarenheit) {
        return (tempFarenheit - 32)/1.8;
    }
}

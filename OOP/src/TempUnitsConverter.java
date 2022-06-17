import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class TempUnitsConverter {

    public double celciusToFarenheit(double tempCelcius) {
        double tempFarenheit;
        return tempFarenheit = 1.8 * tempCelcius + 32;
    }

    public double farenheitToCelcius(double tempFarenheit) {
        double tempCelcius;
        return tempCelcius = (tempFarenheit - 32)/1.8;
    }
}

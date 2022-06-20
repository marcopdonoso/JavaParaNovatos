import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DigitCounter {
    private String num;

    public void readKey() {
        System.out.println("Introduzca un numero");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            num = String.valueOf(Math.abs(Long.parseLong(bufferedReader.readLine())));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void countingDigits() {
        System.out.println("El numero tiene " + num.length() + " cifras.");
    }
}

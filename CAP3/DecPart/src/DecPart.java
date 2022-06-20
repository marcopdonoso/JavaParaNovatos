import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DecPart {
    private double num = 0;

    public void readKey() {
        System.out.println("Introduzca un numero real");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            num = Double.parseDouble(bufferedReader.readLine());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void detDecPart() {
        if (num != Math.round(num)) {
            System.out.println("El numero SI tiene parte decimal");
        } else {
            System.out.println("El numero NO tiene parte decimal");
        }
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PositiveNegative {
    private double number = 0;

    public void readKeyboard() {
        System.out.println("Introduzca un número");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            number = Double.parseDouble(bufferedReader.readLine());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void determineSign() {
        if (number > 0){
            System.out.println("El número " + number + " es positivo");
        } else if (number < 0) {
            System.out.println("El número " + number + " es negativo");
        } else {
            System.out.println("El número es CERO");
        }
    }
}

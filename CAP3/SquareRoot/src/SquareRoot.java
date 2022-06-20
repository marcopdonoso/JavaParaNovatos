import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SquareRoot {
    private double number = 0;

    public void readKey() {
        System.out.println("Introduzca un numero");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            number = Double.parseDouble(bufferedReader.readLine());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void rootCalc() {
        if (number >= 0) {
            System.out.println("El resultado es: " + Math.sqrt(number));
        } else {
            System.out.println("Debe introducir un numero positivo para poder calcular su raiz cuadrada");
        }
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calc {

    public int add(int a, int b) {
        return a + b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public double div(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error al realizar la división");
            return 0;
        }
    }

    public int mod(int a, int b) {
        try {
            return a % b;
        } catch (ArithmeticException e) {
            System.out.println("Error al sacar el módulo");
            return 0;
        }
    }

    public int readNumber() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduzca un número: ");
        try {
            return Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e) {
            e.fillInStackTrace();
            return 0;
        }
    }
}


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Substract {
    private double numberA = 0;
    private double numberB = 0;
    private boolean flag = false;

    public void readKey() {
        System.out.println("Por favor introduzca un numero");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            if (!flag) {
                numberA = Double.parseDouble(bufferedReader.readLine());
                flag = true;
            } else {
                numberB = Double.parseDouble(bufferedReader.readLine());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void majorSub() {
        if(numberA >= numberB) {
            System.out.println("El resultado de la resta: " + numberA + " - " + numberB + " es: " + (numberA - numberB));
        } else {
            System.out.println("El resultado de la resta: " + numberB + " - " + numberA + " es: " + (numberB - numberA));
        }
    }
}

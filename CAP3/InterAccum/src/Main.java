import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        int number = 0;

        InterAcc interAcc = new InterAcc();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (number >= 0) {
            System.out.print("Introduzca un numero: ");
            try {
                number = Integer.parseInt(bufferedReader.readLine());
                interAcc.setAcc(number);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

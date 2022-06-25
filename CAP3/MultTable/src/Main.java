import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        int number = 0;

        MultTabGen multTabGen = new MultTabGen();

        System.out.println("Teclee un número y presione Enter para conocer su tabla de multiplicar");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            number = Integer.parseInt(bufferedReader.readLine());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        multTabGen.genTable(number);
    }
}

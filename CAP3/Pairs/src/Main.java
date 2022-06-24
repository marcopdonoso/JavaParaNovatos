import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int sel = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el primer numero del rango");
        try {
            a = Integer.parseInt(bufferedReader.readLine());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Introduce el ultimo numero del rango");
        try {
            b = Integer.parseInt(bufferedReader.readLine());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Deseas ver los numeros Pares (1) o Impares (2)?");
        try {
            sel = Integer.parseInt(bufferedReader.readLine());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        Pairs pairs = new Pairs(a, b);

        switch (sel) {
            case 1:
                pairs.pairs();
                break;
            case 2:
                pairs.odds();
                break;
            default:
                System.out.println("Opcion Invalida, programa terminado");
        }
    }
}

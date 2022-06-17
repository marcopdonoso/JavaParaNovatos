import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProbarMyNumber {
    public static void main(String[] args) {
        int x = 0;

        MyNumber n1 = new MyNumber();

        System.out.println("Por favor introduzca un número entero:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            x = Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        MyNumber n2 = new MyNumber(x);

        n1.changeNum(5);
        n1.sus(1);
        n2.add(n1.getValue());

        System.out.println("Probando la clase NyNumber");
        System.out.println("N1:");
        System.out.println("Valor actual: " + n1.getValue());
        System.out.println("Doble: " + n1.getDouble());
        System.out.println("Triple: " + n1.getTriple());
        System.out.println("Cuádruple: " + n1.getQuad() + "\n");

        System.out.println("N2:");
        System.out.println("Valor actual: " + n2.getValue());
        System.out.println("Doble: " + n2.getDouble());
        System.out.println("Triple: " + n2.getTriple());
        System.out.println("Cuádruple: " + n2.getQuad());


    }
}

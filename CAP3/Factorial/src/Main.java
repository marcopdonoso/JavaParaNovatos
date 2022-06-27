import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        long number = Integer.parseInt(scanner.nextLine());
        Factorial factorial = new Factorial(number);
        System.out.println(number + "!= " + factorial.factorialCalc());
    }
}

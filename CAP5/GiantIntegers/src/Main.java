import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GiantInteger giantInteger1 = new GiantInteger();
        GiantInteger giantInteger2 = new GiantInteger();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número de max. 50 dígitos: ");
        giantInteger1.readGiantNumber(scanner.next());
        System.out.print("Introduzca otro número de max. 50 dígitos: ");
        giantInteger2.readGiantNumber(scanner.next());
        System.out.println();

        GiantInteger giantIntegerSum = giantInteger1.add(giantInteger2);

        System.out.print("El resultado de la suma es:  ");
        giantIntegerSum.printGiantNumber();
        System.out.println();

        GiantInteger giantIntegerDiff = giantInteger1.sus(giantInteger2);

        System.out.print("El resultado de la resta es: ");
        giantIntegerDiff.printGiantNumber();
    }
}

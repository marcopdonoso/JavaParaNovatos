import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GiantInteger giantInteger1 = new GiantInteger();
        GiantInteger giantInteger2 = new GiantInteger();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número de max. 50 dígitos: ");
        giantInteger1.readGiantNumber(scanner.next());
        System.out.println();
        System.out.print("Introduzca otro número de max. 50 dígitos: ");
        giantInteger2.readGiantNumber(scanner.next());
        System.out.println();

        GiantInteger giantIntegerR = giantInteger1.add(giantInteger2);

        System.out.print("El resultado de la suma es: ");
        giantIntegerR.printGiantNumber();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Numeros Primos");
        System.out.print("Introduzca el numero que quiere consultar: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        PrimeNumber primeNumber = new PrimeNumber();

        if (primeNumber.primeDet(n)) {
            if (primeNumber.omirpDet(n)) {
                System.out.println("El numero " + n + " es primo y ademas es omirp");
            } else {
                System.out.println("El numero " + n + " SI es numero primo");
            }
        } else {
            System.out.println("El numero " + n + " NO es numero primo");
        }

        System.out.println();
        System.out.println("Desea ver la criba de Eratostenes? Si (1)  - No (2)");
        int opt = scanner.nextInt();
        if (opt == 1) {
            primeNumber.eratosthenesSieve();
        } else {
            System.out.println("Bueno, ni modo... Sigamos");
        }

        System.out.println();
        System.out.println("Quieres ver una lista de numeros Omirp? Si (1)  - No (2)");
        opt = scanner.nextInt();
        if (opt == 1) {
            System.out.print("Hasta que numero deseas que llegue la lista?: ");
            int emirpLimit = scanner.nextInt();
            primeNumber.emirpList(emirpLimit);
        } else {
            System.out.println("Bueno, hasta aqui entonces. Chauuuu");
        }

    }
}

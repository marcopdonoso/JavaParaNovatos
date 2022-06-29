import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("SERIE FIBONACCI");
        System.out.print("Introduzca la cantidad de numeros de la sucesion que quiera ver: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Fibonacci fibonacci = new Fibonacci(n);
        int[] succession;
        succession = fibonacci.makeFibonacci();

        System.out.println("Primeros " + n + " numeros de la sucesion de Fibonacci:");
        for (int j = 0; j < succession.length; j++) {
            if (j < succession.length - 1) {
                System.out.print(succession[j] + ", ");
            } else {
                System.out.print(succession[j]);
            }
        }
    }
}

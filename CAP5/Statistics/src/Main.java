import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < statistics.getArray().length; i++) {
            System.out.print("Dato nro " + (i + 1) + ": ");
            statistics.setArray(scanner.nextInt(),i);
        }

        statistics.setAverage();
        System.out.println();
        System.out.println("El promedio es: " + statistics.getAverage());
        System.out.println();
        statistics.overBelowAverage();
    }
}

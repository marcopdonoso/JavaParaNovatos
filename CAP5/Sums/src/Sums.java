import java.util.Scanner;

public class Sums {
    private final double[] realNumbers;
    private double positives = 0;
    private double negatives = 0;

    Scanner scanner = new Scanner(System.in);

    public Sums(int size) {
        realNumbers = new double[size];
    }

    public void setRealNumbers() {
        for (int i = 0; i < realNumbers.length; i++) {
            System.out.print("Introduzca un numero real: ");
            realNumbers[i] = scanner.nextDouble();
        }
        System.out.println("Arreglo lleno.");
    }

    public void sums() {
        for (double number : realNumbers) {
            if (number > 0) {
                this.positives += number;
            } else if (number < 0) {
                this.negatives += number;
            }
        }
        System.out.println("Suma positivos: " + positives);
        System.out.println("Suma negativos: " + negatives);
    }
}

import java.util.Scanner;

public class MatrixGeometry {
    private final int[][] matrix = new int[5][5];

    public MatrixGeometry() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Introduzca el elemento " + i + "-" + j + ":");
                Scanner scanner = new Scanner(System.in);
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("LISTO.");
    }

    public void printMatrix() {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%5d",anInt);
            }
            System.out.println();
        }
    }

    public void printMainDiagonal() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("     ");
            }
            System.out.printf("%5d",matrix[i][i]);
            System.out.println();
        }
    }

    public double upperTriangularMean() {
        int elementsCounter = 0;
        int acc = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int k = i; k < matrix[i].length; k++) {
                acc += matrix[i][k];
                elementsCounter++;
            }
        }
        System.out.println("Numero de elementos sumados: " + elementsCounter);
        System.out.println("Suma total triangular superior: " + acc);
        return (double) acc / elementsCounter;
    }
}

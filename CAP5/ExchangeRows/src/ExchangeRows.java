import java.util.Arrays;
import java.util.Scanner;

public class ExchangeRows {

        private final int[][] matrix = new int[3][5];
        private Scanner scanner = new Scanner(System.in);

        public void fillMatrix() {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print("Introduzca el valor para el elemento " + (i + 1) + " - " + (j + 1) + " : ");
                    matrix[i][j] = scanner.nextInt();
                }
            }
            System.out.println("MATRIZ LLENA");
        }

        public void printMatrix() {
            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    System.out.printf("%5d",anInt);
                }
                System.out.println();
            }
        }

        public void exchangeRows(int rowA, int rowB) {
            int[] buffer = new int[matrix[1].length];
            for (int i = 0; i < matrix[rowA - 1].length; i++) {
                buffer[i] = matrix[rowA - 1][i];
                matrix[rowA - 1][i] = matrix[rowB - 1][i];
                matrix[rowB - 1][i] = buffer[i];
            }
        }
}

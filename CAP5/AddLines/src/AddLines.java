import java.util.Scanner;

public class AddLines {
    private final int[][] matrix = new int[3][3];
    Scanner scanner = new Scanner(System.in);

    public void fillMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Introduzca el valor para el elemento " + (i + 1) + " - " + (j + 1) + " : ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("MATRIZ LLENA");
    }

    public void addLines() {
        int accCol1 = 0;
        int accCol2 = 0;
        int accCol3 = 0;

        for (int i = 0; i < matrix.length; i++) {
            int accRows = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%5d",matrix[i][j]);
                accRows += matrix[i][j];
                if (j == 0) {
                    accCol1 += matrix[i][j];
                } else if (j == 1) {
                    accCol2 += matrix[i][j];
                } else {
                    accCol3 += matrix[i][j];
                }
            }
            System.out.println(" = " + accRows);
        }
        System.out.printf("%5s%5s%5s\n","=","=","=");
        System.out.printf("%5d%5d%5d",accCol1,accCol2,accCol3);
    }
}

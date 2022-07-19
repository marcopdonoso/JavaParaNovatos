import java.util.Arrays;

public class SimpleMatrix {
    private final int[][] matrix = new int[10][10];

    public void initializeMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = -1;
                } else {
                    matrix[i][j] = 0;
                }

            }
        }
    }

    public void readMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d",matrix[i][j]);
            }
            System.out.println();
        }
    }
}

public class AddMatrices {

    private final int[][] matrizA = new int[10][5];
    private final int[][] matrizB = new int[10][5];
    private final int[][] matrizC = new int[10][5];
    
    public AddMatrices() {
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = (int)(Math.random() * 255);
                matrizB[i][j] = (int)(Math.random() * 255);
            }
        }

    }

    public void addMatrices() {
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
    }

    public void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%5d",anInt);
            }
            System.out.println();
        }
    }

    public int[][] getMatrizA() {
        return matrizA;
    }

    public int[][] getMatrizB() {
        return matrizB;
    }

    public int[][] getMatrizC() {
        return matrizC;
    }
}

public class Main {
    public static void main(String[] args) {
        MatrixGeometry matrixGeometry = new MatrixGeometry();
        System.out.println("MATRIZ INTRODUCIDA");
        matrixGeometry.printMatrix();
        System.out.println("DIAGONAL PRINCIPAL");
        matrixGeometry.printMainDiagonal();
        System.out.println();
        System.out.println("Media triangular superior: " + matrixGeometry.upperTriangularMean());
    }
}

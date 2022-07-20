public class Main {
    public static void main(String[] args) {
        AddMatrices addMatrices = new AddMatrices();
        System.out.println("MATRIZ A");
        addMatrices.printMatrix(addMatrices.getMatrizA());
        System.out.println();
        System.out.println("MATRIZ B");
        addMatrices.printMatrix(addMatrices.getMatrizB());
        addMatrices.addMatrices();
        System.out.println();
        System.out.println("MATRIZ C (SUMA A Y B)");
        addMatrices.printMatrix(addMatrices.getMatrizC());
    }
}

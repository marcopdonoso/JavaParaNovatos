public class FiddlingWithArrays {
    private int[][] array2d;

    public FiddlingWithArrays(final int N) {
        array2d = new int[N][N];
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = (int) (Math.random() * 9);
            }
        }
    }

    public int[] perimeter() {
        int colNum = array2d[0].length;
        int[] perimeterArray = new int[2 * colNum + 2 * (array2d.length - 2)];
        int indexPerimeterArray = 0;
        for (int i = 0; i < colNum - 1; i++) {
            perimeterArray[indexPerimeterArray] = array2d[0][i];
            indexPerimeterArray++;
        }
        for (int i = 0; i < array2d.length - 1; i++) {
            perimeterArray[indexPerimeterArray] = array2d[i][colNum - 1];
            indexPerimeterArray++;
        }
        for (int i = colNum - 1; i > 0; i--) {
            perimeterArray[indexPerimeterArray] = array2d[colNum - 1][i];
            indexPerimeterArray++;
        }
        for (int i = array2d.length - 1; i > 0; i--) {
            perimeterArray[indexPerimeterArray] = array2d[i][0];
        }
        return perimeterArray;
    }

    public int[][] getArray2d() {
        return array2d;
    }
}

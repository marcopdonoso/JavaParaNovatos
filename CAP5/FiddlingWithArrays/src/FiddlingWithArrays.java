import java.util.ArrayList;

public class FiddlingWithArrays {
    private final int[][] array2d;

    public FiddlingWithArrays(final int N) {
        array2d = new int[N][N];
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = (int) (Math.random() * 9);
            }
        }
    }

    public ArrayList<Integer> perimeter(int left, int right, int up, int down) {
        ArrayList<Integer> elementCollector = new ArrayList<>();

        for (int i = left; i < right - 1; i++) {
            elementCollector.add(array2d[left][i]);
        }
        for (int i = up; i < down - 1; i++) {
            elementCollector.add(array2d[i][down - 1]);
        }
        for (int i = right - 1; i > left; i--) {
            elementCollector.add(array2d[right - 1][i]);
        }
        for (int i = down - 1; i > up; i--) {
            elementCollector.add(array2d[i][up]);
        }
        return elementCollector;
    }

    public ArrayList<Integer> spiral() {
        ArrayList<Integer> elementCollector = new ArrayList<>();
        int rightDown = array2d.length;
        int leftUp = 0;
        do {
            elementCollector.addAll(perimeter(leftUp,rightDown,leftUp,rightDown));
            rightDown--;
            leftUp++;
        } while ((rightDown - leftUp) > 0);
        if(array2d.length % 2 != 0) {
            elementCollector.add(array2d[(array2d.length - 1) / 2][(array2d.length - 1) / 2]);
        }
        return elementCollector;
    }

    public void getArray2d() {
        printArray2d(array2d);
    }

    public void printArray2d(int[][] array2d) {
        for (int[] ints : array2d) {
            for (int anInt : ints) {
                System.out.printf("%5d",anInt);
            }
            System.out.println();
        }
    }
}

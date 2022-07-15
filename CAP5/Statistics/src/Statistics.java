import java.util.Arrays;

public class Statistics {
    private final int[] array = new int[10];
    private int average;

    public Statistics() {
        Arrays.fill(array,0);
    }

    public void overBelowAverage() {
        System.out.println("Numeros por encima y por debajo del promedio");
        System.out.println("Encima   Debajo");
        for (int i : array) {
            if (i > average) {
                System.out.printf("%6d\n",i);
            } else if (i < average) {
                System.out.printf("          %6d\n",i);
            }
        }
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int value, int index) {
        array[index] = value;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage() {
        int acc = 0;
        for (int i : array) {
            acc = acc + i;
        }
        average = acc / array.length;
    }

}

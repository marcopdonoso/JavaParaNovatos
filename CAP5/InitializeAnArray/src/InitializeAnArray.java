import java.util.Arrays;

public class InitializeAnArray {
    int[] array = new int[100];

    public void initializer() {
        Arrays.fill(array, -1);
    }

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Posicion %3d: %3d\n",i + 1,array[i]);
        }
    }
}

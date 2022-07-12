public class InitializeAnArray {
    int[] array = new int[100];

    public void initializer() {
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
    }

    public void printArray() {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);
    }
}

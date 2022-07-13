public class GiantArray {
    public static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 2000000);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] orderArray(int [] array) {
        int elem;
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i ; j--) {
                if (array[j - 1] > array[j]) {
                    elem = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = elem;
                }
            }
        }
        return array;
    }

    public static int searchNumber(int[] array, int number) {
        int i = 0;
        int flag = -1;
        while (i < array.length && flag == -1) {
            if (array[i] == number) {
                flag = i;
            }
            i++;
        }
        return flag;
    }
}

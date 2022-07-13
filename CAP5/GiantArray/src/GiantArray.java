import java.util.ArrayList;

public class GiantArray {
    public static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 2000000);
        }
        return array;
    }

    public static ArrayList<Integer> generateArrayList(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add((int) (Math.random() * 2000000));
        }
        return arrayList;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void printArray(ArrayList<Integer> arrayList) {
        for (int i : arrayList) {
            System.out.print(i + " ");
        }
    }

    public static void orderArray(int [] array) {
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
    }

    public static void orderArrayList(ArrayList<Integer> arrayList) {
        int elem;
        for (int i = 1; i < arrayList.size(); i++) {
            for (int j = arrayList.size() - 1; j >= i ; j--) {
                if (arrayList.get(j - 1) > arrayList.get(j)) {
                    elem = arrayList.get(j - 1);
                    arrayList.set(j - 1,arrayList.get(j));
                    arrayList.set(j,elem);
                }
            }
        }
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

    public static int searchNumberInArrayList(ArrayList<Integer> arrayList, int number) {
        return arrayList.indexOf(number);
    }
}

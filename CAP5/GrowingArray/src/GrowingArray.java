import java.util.Arrays;
import java.util.Scanner;

public class GrowingArray {
    private int[] array;

    Scanner scanner = new Scanner(System.in);

    public GrowingArray() {
        array = new int[10];
        int temp;
        array[0] = (int)(Math.random() * 10);
        for (int i = 1; i < array.length; i++) {
            temp = (int) (Math.random() * ((i + 1) * 10));
            if (temp > array[i - 1]) {
                array[i] = temp;
            } else {
                i--;
            }
        }
    }

    public void printArray() {
        for (int i : array) {
            System.out.printf("%4d",i);
        }
        System.out.println();
    }

    public void findingPlace() {
        int userNumber;
        System.out.print("Introduzca un numero entre 1 y " + array[array.length - 1] + ": ");
        userNumber = scanner.nextInt();
        while (userNumber != -1) {
            int i = 0;
            boolean flag = false;
            do {
                if (userNumber < array[i]) {
                    for (int j = array.length - 1; j > i ; j--) {
                        array[j] = array[j - 1];
                    }
                    array[i] = userNumber;
                    printArray();
                    flag = true;
                }
                i++;
            } while (!flag);
            System.out.print("Introduzca un numero entre 1 y " + array[array.length - 1] + ": ");
            userNumber = scanner.nextInt();
        }
        System.out.println("Hasta luego");
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);

        int[] array = GiantArray.generateArray(1000);

        ArrayList<Integer> arrayList = GiantArray.generateArrayList(1000);

        GiantArray.printArray(array);
        GiantArray.orderArray(array);
        System.out.println();
        GiantArray.printArray(array);

        System.out.print("Introduzca el número que desea buscar en Array: ");
        number = scanner.nextInt();
        int position = GiantArray.searchNumber(array,number);
        if (position != -1) {
            System.out.println("El número está en la posición: " + position);
        } else {
            System.out.println("No se encontró el número en el arreglo.");
        }

        System.out.println();
        GiantArray.printArray(arrayList);
        System.out.print("Introduzca el número que desea buscar en ArrayList: ");
        number = scanner.nextInt();
        position = GiantArray.searchNumberInArrayList(arrayList,number);
        if (position != -1) {
            System.out.println("El número está en la posición: " + position);
        } else {
            System.out.println("No se encontró el número en el arreglo.");
        }

    }
}

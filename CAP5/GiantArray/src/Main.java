import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        int[] array = GiantArray.generateArray(100000);
        GiantArray.printArray(array);
        GiantArray.orderArray(array);
        System.out.println();
        GiantArray.printArray(array);

        System.out.print("Introduzca el número que desea buscar: ");
        number = scanner.nextInt();
        int position = GiantArray.searchNumber(array,number);
        if (position != -1) {
            System.out.println("El número está en la posición: " + position);
        } else {
            System.out.println("No se encontró el número en el arreglo.");
        }
    }
}

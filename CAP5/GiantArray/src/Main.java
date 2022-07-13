import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables
        int numberInArray;
        int size = 1000000;

        int[] array = GiantArray.generateArray(size); // Creación de arreglo de enteros y uso de método para rellenar arreglo con enteros aleatorios
        ArrayList<Integer> arrayList = GiantArray.generateArrayList(size); // Creación de un ArrayList con datos tipo entero y uso de método para rellenar un ArrayList con enteros aleatorios

        // Instanciación de un objeto tipo Scanner para ingreso de datos por teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println("Arreglo convencional");
        GiantArray.printArray(array); // Imprimir el arreglo convencional
        System.out.println();
        System.out.println("Arraylist");
        GiantArray.printArray(arrayList); // Imprimir el ArrayList
        System.out.println();
        System.out.println();

        long start = System.currentTimeMillis(); // Captura de temporizador de programa para inicio de medición
        GiantArray.orderArray(array); // Ordenado de arreglo de menor a mayor por método de burbuja
        long end = System.currentTimeMillis(); // Captura de temporizador de programa para final de medición
        long durationOrder1 = end - start; // Resultado de la temporización para ordenación de arreglo

        start = System.currentTimeMillis(); // Temporizado de ordenación de ArrayList
        Collections.sort(arrayList);
        end = System.currentTimeMillis();
        long durationOrder2 = end - start;

        System.out.println("Arreglo convencional ordenado");
        GiantArray.printArray(array); // Imprimir el arreglo convencional
        System.out.println();
        System.out.println("Arraylist ordenado");
        GiantArray.printArray(arrayList); // Imprimir el ArrayList
        System.out.println();
        System.out.println();

        System.out.println("Tiempo de ordenación de arreglo convencional con " + array.length + " elementos (método burbuja): " + durationOrder1 + "ms");
        System.out.println("Tiempo de ordenación de ArrayList con " + arrayList.size() + " elementos (método sort() de clase Collections): " + durationOrder2 + "ms");
        System.out.println();

        // Búsqueda en array, método secuencial
        System.out.print("Introduzca el número que desea buscar en Array: ");
        numberInArray = scanner.nextInt();
        start = System.currentTimeMillis();
        int position = GiantArray.searchNumber(array,numberInArray);
        end = System.currentTimeMillis();
        long durationSearch1 = end - start;
        if (position != -1) {
            System.out.println("El número está en la posición: " + position);
        } else {
            System.out.println("No se encontró el número en el arreglo.");
        }
        System.out.println("Tiempo de búsqueda del número " + numberInArray + " con método secuencial: " + durationSearch1 + "ms");
        System.out.println();

        // Búsqueda en ArrayList, método indexOf() de la clase ArrayList
        System.out.print("Introduzca el número que desea buscar en ArrayList: ");
        numberInArray = scanner.nextInt();
        start = System.currentTimeMillis();
        position = GiantArray.searchNumberInArrayList(arrayList,numberInArray);
        end = System.currentTimeMillis();
        long durationSearch2 = end - start;
        if (position != -1) {
            System.out.println("El número está en la posición: " + position);
        } else {
            System.out.println("No se encontró el número en el arreglo.");
        }
        System.out.println("Tiempo de busqueda del número " + numberInArray + " con metodo indexOf() en ArrayList: " + durationSearch2 + "ms");
    }
}

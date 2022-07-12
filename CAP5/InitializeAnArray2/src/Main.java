import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        // Solución con arrays convencionales
        int[] pairs = new int[100];
        int[] odds = new int[100];

        InitializeArrays initializeArrays = new InitializeArrays();
        initializeArrays.pairsInitializer(pairs);
        initializeArrays.oddsInitializer(odds);
        initializeArrays.print(pairs);
        System.out.println();
        initializeArrays.print(odds);
         */

        // Solución con ArrayList
        ArrayList<Integer> pairs = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();

        InitializeArrays initializeArrays = new InitializeArrays();
        initializeArrays.initializerTwoArrays(pairs,odds);
        initializeArrays.printTwoArrays(pairs,odds);
    }
}

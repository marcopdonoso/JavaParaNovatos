import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class InitializeArrays {

    /*
    // Solución con arrays convencionales
    public void pairsInitializer(int @NotNull [] array) {
        for (int i = 1; i <= array.length; i++) {
            array[i - 1] = i * 2;
        }
    }

    public void oddsInitializer(int @NotNull [] array) {
        int j = 1;
        for (int i = 1; i <= array.length; i++) {
            array[i - 1] = j;
            j += 2;
        }
    }

    public void print(int @NotNull [] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

     */

    // Solución con ArrayList

    public void initializerTwoArrays(ArrayList<Integer> pairs,ArrayList<Integer> odds) {
        int j = 1;
        for (int i = 0; i < 100; i++) {
            pairs.add(j + 1);
            odds.add(j);
            j += 2;
        }
    }

    public void printTwoArrays(ArrayList<Integer> pairs, ArrayList<Integer> odds) {
        System.out.println("PARES    IMPARES");
        for (int i = 0; i < pairs.size(); i++) {
            System.out.format("%1$5d %2$5d\n",pairs.get(i),odds.get(i));
        }
    }
}

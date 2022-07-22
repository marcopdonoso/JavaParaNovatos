import java.util.Scanner;

public class SubString {
    private String string1;
    private String string2;

    public void setStrings() {
        System.out.print("Introduce un String: ");
        Scanner scanner = new Scanner(System.in);
        string1 = scanner.nextLine();
        System.out.print("Introduce otro String: ");
        string2 = scanner.nextLine();
    }

    public char[] searchAndDestroy() {
        char[] charactersArray1 = string1.toCharArray();
        char[] charactersArray2 = string2.toCharArray();
        int i1 = 0, index = 0;
        boolean coincident;
        do {
            if (charactersArray1[i1] == charactersArray2[0]) {
                index = i1;
                int i = 0;
                coincident = true;
                while (coincident && i < charactersArray2.length) {
                    coincident = charactersArray2[i] == charactersArray1[i + index];
                    i++;
                }
            } else {
                coincident = false;
            }
            i1++;
        } while (charactersArray1.length - i1 > charactersArray2.length && !coincident);
        if (coincident) {
            for (int i = index; i < (charactersArray2.length + index); i++) {
                charactersArray1[i] = '*';
            }
        }
        return charactersArray1;
    }
}

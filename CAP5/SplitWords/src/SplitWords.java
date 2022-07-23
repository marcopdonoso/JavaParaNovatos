import java.util.Scanner;
import java.util.StringTokenizer;

public class SplitWords {
    private String phrase;

    public void readTextFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca una frase: ");
        phrase = scanner.nextLine();
    }

    public void separateWords() {
        StringTokenizer separatedWords = new StringTokenizer(phrase);
        int i = 0;
        while (separatedWords.hasMoreTokens()) {
            i++;
            System.out.println("Palabra " + i + ": " + separatedWords.nextToken());
        }
        System.out.println("La frase tiene " + i + " palabras.");
    }
}

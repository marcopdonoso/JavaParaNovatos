import java.util.Scanner;

public class AlphabetSoupGenerator {
    private final String word;
    private char[][] matrix;

    public AlphabetSoupGenerator() {
        System.out.print("Escriba una palabra: ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.next();
    }

    public void generateMatrix() {
        matrix = new char[8][8];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (char) (Math.random() * 25 + 65);
            }
        }
    }

    public void showMatrix() {
        for (char[] chars : matrix) {
            for (char anChar : chars) {
                System.out.printf("%3c",anChar);
            }
            System.out.println();
        }
    }

    public void insertWordIntoMatrix() {
        int row = (int) (Math.random() * 8);
        char[] wordInChars = word.toCharArray();
        for (int i = 0; i < wordInChars.length; i++) {
            matrix[row][i] = wordInChars[i];
        }
    }
}

import java.util.Random;
import java.util.Scanner;

public class WordSearchGenerator {
    private final String[] wordsList;
    private char[][] wordSearchMatrix;
    private char[][] solutionMatrix;

    public WordSearchGenerator() {
        wordsList = new String[20];
        wordsList[0] = "VIOLIN";
        wordsList[1] = "TROMPETA";
        wordsList[2] = "CLARINETE";
        wordsList[3] = "FAGOT";
        wordsList[4] = "FLAUTA";
        wordsList[5] = "TIMPANI";
        wordsList[6] = "CONTRABAJO";
        wordsList[7] = "VIOLA";
        wordsList[8] = "VIOLONCHELO";
        wordsList[9] = "OBOE";
        wordsList[10] = "CORNO";
        wordsList[11] = "TROMBON";
        wordsList[12] = "TUBA";
        wordsList[13] = "VIBRAFONO";
        wordsList[14] = "REDOBLANTE";
        wordsList[15] = "TRIANGULO";
        wordsList[16] = "PICCOLO";
        wordsList[17] = "PIANO";
        wordsList[18] = "PLATILLOS";
        wordsList[19] = "ARPA";
    }

    public void generateWordSearchGame() {
        int size;
        int wordsQuan;
        int position;
        boolean direction;
        int[] initialBox;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Size of the larger side: ");
        size = scanner.nextInt();
        System.out.print("Square or Rectangular? (s) or (r): ");
        String shape = scanner.nextLine();
        System.out.print("How many words?: ");
        wordsQuan = scanner.nextInt();
        wordSearchMatrix = generateRandomMatrix(size,shape);
        for (int i = 0; i < wordsQuan; i++) {
            String word = selectWord();
            position = (int) (Math.random() * 2);
            direction = random.nextBoolean();
            initialBox = setInitialBox(position,word.length());
            
        }
    }

    public char[][] generateRandomMatrix(int size, String shape) {
        char[][] randomMatrix;
        if (shape.equals("r")) {
            randomMatrix = new char[size / 2][size];
        } else {
            randomMatrix = new char[size][size];
        }
        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix[i].length; j++) {
                randomMatrix[i][j] = (char) (Math.random() * 25 + 65);
            }
        }
        return randomMatrix;
    }

    public String selectWord() {
        return wordsList[(int) (Math.random() * 19)];
    }

    public int[] setInitialBox(int position, int size) {
        int[] initialBox = new int[2];
        int limitRow;
        int limitCol;
        switch (position) {
            case 0:
                limitRow = wordSearchMatrix.length - 1;
                limitCol = wordSearchMatrix[0].length - 1 - size;
                break;
            case 1:
                limitRow = wordSearchMatrix.length - 1 - size;
                limitCol = wordSearchMatrix[0].length - 1;
                break;
            case 2:
                limitRow = wordSearchMatrix.length - 1 - size;
                limitCol = wordSearchMatrix[0].length - 1 - size;
                break;
            default:
                limitRow = wordSearchMatrix.length - 1;
                limitCol = wordSearchMatrix[0].length - 1;
                break;
        }
        initialBox[0] = (int) (Math.random() * limitRow);
        initialBox[1] = (int) (Math.random() * limitCol);
        return initialBox;
    }

    public void horizontal(String wordString, int row, int column, boolean direction) {
        char[] wordChar = wordString.toCharArray();
        int j = 0;
        int k = wordChar.length - 1;
        if (!direction) {
            for (int i = column; i < column + wordChar.length; i++) {
                wordSearchMatrix[row][i] = wordChar[j];
                j++;
            }
        } else {
            for (int i = column; i < column + wordChar.length; i++) {
                wordSearchMatrix[row][i] = wordChar[k];
                k--;
            }
        }
    }

    public void vertical(String wordString, int row, int column, boolean direction) {
        char[] wordChar = wordString.toCharArray();
        int j = 0;
        int k = wordChar.length - 1;
        if (!direction) {
            for (int i = row; i < row + wordChar.length; i++) {
                wordSearchMatrix[i][column] = wordChar[j];
                j++;
            }
        } else {
            for (int i = row; i < row + wordChar.length; i++) {
                wordSearchMatrix[i][column] = wordChar[k];
                k--;
            }
        }
    }
}

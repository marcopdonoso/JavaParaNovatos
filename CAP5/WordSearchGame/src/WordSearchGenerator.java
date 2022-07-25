import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WordSearchGenerator {
    private final String[] wordsList;
    private char[][] wordSearchMatrix;
    private boolean[][] availabilityMatrix;
    private char[][] solutionMatrix;
    private ArrayList<String> selectedWords;

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
        String shape;
        int wordsQuan;
        String word;
        int position;
        boolean direction;
        int[] initialBox;
        char[] wordChar;
        selectedWords = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Size of the larger side?: ");
        size = scanner.nextInt();
        System.out.print("Square or Rectangular? (s) or (r): ");
        shape = scanner.next();
        System.out.print("How many words?: ");
        wordsQuan = scanner.nextInt();
        wordSearchMatrix = generateRandomMatrix(size,shape);
        if (shape.equals("r")) {
            availabilityMatrix = new boolean[size / 2][size];
        } else {
            availabilityMatrix = new boolean[size][size];
        }
        for (int i = 0; i < wordsQuan; i++) {

            do {
                word = selectWord();
            } while (word.length() > size);

            position = (int) (Math.round(Math.random() * 2));
            direction = random.nextBoolean();

            if (direction) {
                word = reverseWord(word);
            }

            wordChar = word.toCharArray();
            initialBox = setInitialBox(position,wordChar.length);

            if (checkAvailability(wordChar,initialBox,position)) {
                System.out.println(word + " - " + position + " " + Arrays.toString(initialBox));
                if (direction) {
                    word = reverseWord(word);
                }
                selectedWords.add(word);
                switch (position) {
                    case 0:
                        horizontal(wordChar, initialBox);
                        break;
                    case 1:
                        vertical(wordChar,initialBox);
                        break;
                    case 2:
                        diagonal(wordChar,initialBox);
                        break;
                }
            } else {
                i--;
            }
        }
        showMatrix(wordSearchMatrix);

        for (String selectedWord : selectedWords) {
            System.out.print(selectedWord);
            System.out.println();
        }

        System.out.println();
        for (boolean[] booleans : availabilityMatrix) {
            for (boolean anBoolean : booleans) {
                if (anBoolean) {
                    System.out.printf("%3d",1);
                } else {
                    System.out.printf("%3d",0);
                }
            }
            System.out.println();
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
                randomMatrix[i][j] = (char) (Math.round(Math.random() * 25) + 65);
            }
        }
        return randomMatrix;
    }

    public String selectWord() {
        String selectedWord;
        do {
            selectedWord = wordsList[(int) (Math.round(Math.random() * 19))];
        } while (selectedWords.contains(selectedWord));
        return selectedWord;
    }

    public String reverseWord(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        return stringBuilder.reverse().toString();
    }

    public int[] setInitialBox(int position, int wordLength) {
        int[] initialBox = new int[2];
        int limitRow = 0;
        int limitCol = 0;
        switch (position) {
            case 0:
                limitRow = wordSearchMatrix.length - 1;
                limitCol = wordSearchMatrix[0].length - wordLength;
                break;
            case 1:
                limitRow = wordSearchMatrix.length - wordLength;
                limitCol = wordSearchMatrix[0].length - 1;
                break;
            case 2:
                limitRow = wordSearchMatrix.length - wordLength;
                limitCol = wordSearchMatrix[0].length - wordLength;
                break;
        }
        initialBox[0] = (int) (Math.round(Math.random() * limitRow));
        initialBox[1] = (int) (Math.round(Math.random() * limitCol));
        return initialBox;
    }

    public void horizontal(char[] wordChar, int[] initialBox) {
        int row = initialBox[0];
        int column = initialBox[1];
        for (char c : wordChar) {
            wordSearchMatrix[row][column] = c;
            availabilityMatrix[row][column] = true;
            column++;
        }
    }

    public void vertical(char[] wordChar, int[] initialBox) {
        int row = initialBox[0];
        int column = initialBox[1];
        for (char c : wordChar) {
            wordSearchMatrix[row][column] = c;
            availabilityMatrix[row][column] = true;
            row++;
        }
    }

    public void diagonal(char[] wordChar, int[] initialBox) {
        int row = initialBox[0];
        int column = initialBox[1];
        for (char c : wordChar) {
            wordSearchMatrix[row][column] = c;
            availabilityMatrix[row][column] = true;
            row++;
            column++;
        }
    }

    public boolean checkAvailability(char[] wordChar, int[] initialBox, int position) {
        boolean available = true;
        int row = initialBox[0];
        int column = initialBox[1];
        int i;
        switch (position) {
            case 0:
                i = 0;
                while (available && i < wordChar.length) {
                    if (availabilityMatrix[row][column]) {
                        if (wordChar[i] != wordSearchMatrix[row][column]) {
                            available = false;
                        }
                    }
                    i++;
                    column++;
                }
                break;
            case 1:
                i = 0;
                while (available && i < wordChar.length) {
                    if (availabilityMatrix[row][column]) {
                        if (wordChar[i] != wordSearchMatrix[row][column]) {
                            available = false;
                        }
                    }
                    i++;
                    row++;
                }
                break;
            case 2:
                i = 0;
                while (available && i < wordChar.length) {
                    if (availabilityMatrix[row][column]) {
                        if (wordChar[i] != wordSearchMatrix[row][column]) {
                            available = false;
                        }
                    }
                    i++;
                    row++;
                    column++;
                }
                break;
        }
        return available;
    }

    public void showMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            for (char anChar : chars) {
                System.out.printf("%3c",anChar);
            }
            System.out.println();
        }
    }
}

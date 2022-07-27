import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordSearchGenerator {
    private final String[] wordsList;
    private char[][] wordSearchMatrix;
    private boolean[][] availabilityMatrix;
    private ArrayList<String> selectedWords;

    public WordSearchGenerator() {
        wordsList = new String[89];
        wordsList[0] = "ACCIO";
        wordsList[1] = "ACROMANTULA";
        wordsList[2] = "AAETHONAN";
        wordsList[3] = "AGUAMENTI";
        wordsList[4] = "ALOHOMORA";
        wordsList[5] = "AMORTENTIA";
        wordsList[6] = "ANAPNEO";
        wordsList[7] = "ANIMAGO";
        wordsList[8] = "ARPIAS";
        wordsList[9] = "ASHWINDERS";
        wordsList[10] = "AUGUREY";
        wordsList[11] = "AVIS";
        wordsList[12] = "BANSHEE";
        wordsList[13] = "BASILISCO";
        wordsList[14] = "BEZOAR";
        wordsList[15] = "BICORNIO";
        wordsList[16] = "BILLYWING";
        wordsList[17] = "BLUDGER";
        wordsList[18] = "BOGGART";
        wordsList[19] = "BOWTRUCKLE";
        wordsList[20] = "BUNDIMUN";
        wordsList[21] = "BUTTERBEER";
        wordsList[22] = "CHIVATOSCOPIO";
        wordsList[23] = "CHIZPURFLE";
        wordsList[24] = "CLABBERT";
        wordsList[25] = "CRUCIATUS";
        wordsList[26] = "CRUP";
        wordsList[27] = "DELETRIUS";
        wordsList[28] = "DEMENTOR";
        wordsList[29] = "DEMIGUISE";
        wordsList[30] = "DENSAUGEO";
        wordsList[31] = "DESILUMINADOR";
        wordsList[32] = "DESMAIUS";
        wordsList[33] = "DIFFINDO";
        wordsList[34] = "DIRICAWL";
        wordsList[35] = "DISSENDIUM";
        wordsList[36] = "DOXY";
        wordsList[37] = "DUGBOG";
        wordsList[38] = "ELFO";
        wordsList[39] = "ENGORDIO";
        wordsList[40] = "EXPELLIARMUS";
        wordsList[41] = "FERULA";
        wordsList[42] = "FIDELIUS";
        wordsList[43] = "FIREBOLT";
        wordsList[44] = "FLAGRATE";
        wordsList[45] = "GLISSEO";
        wordsList[46] = "GOBLINS";
        wordsList[47] = "GOBSTONES";
        wordsList[48] = "GRINDYLOW";
        wordsList[49] = "HIPOGRIFO";
        wordsList[50] = "HORROCRUX";
        wordsList[51] = "IMPEDIMENTA";
        wordsList[52] = "IMPERIUS";
        wordsList[53] = "IMPERVIOUS";
        wordsList[54] = "INCENDIO";
        wordsList[55] = "INFERI";
        wordsList[56] = "INMOBILUS";
        wordsList[57] = "JARVEY";
        wordsList[58] = "KAPPAS";
        wordsList[59] = "KELPIE";
        wordsList[60] = "KNEAZLE";
        wordsList[61] = "LEVICORPUS";
        wordsList[62] = "MANDRAGORA";
        wordsList[63] = "MANTICORA";
        wordsList[64] = "MOBILICORPUS";
        wordsList[65] = "MORSMORDRE";
        wordsList[66] = "MUFFLIATO";
        wordsList[67] = "NAGINI";
        wordsList[68] = "NUNDU";
        wordsList[69] = "OBLIVIATE";
        wordsList[70] = "OCCAMY";
        wordsList[71] = "ORQUIDEUS";
        wordsList[72] = "PENSADERO";
        wordsList[73] = "POGREBIN";
        wordsList[74] = "PORLOCK";
        wordsList[75] = "PORTUS";
        wordsList[76] = "QUAFFLE";
        wordsList[77] = "QUIMERA";
        wordsList[78] = "QUINTAPED";
        wordsList[79] = "RAMORA";
        wordsList[80] = "REDUCIO";
        wordsList[81] = "RICTUNSEMPRA";
        wordsList[82] = "RUNESPOOR";
        wordsList[83] = "SNIDGET";
        wordsList[84] = "SNITCH";
        wordsList[85] = "SONORUS";
        wordsList[86] = "TARANTALLEGRA";
        wordsList[87] = "TROL";
        wordsList[88] = "WADDIWASSI";
    }

    public void generateWordSearchGame() {
        int averageWordLength = 0;
        int size;
        String shape;
        int wordsQuan;
        String word;
        int position;
        boolean direction;
        int[] initialBox;
        char[] wordChar;
        int requiredLength = 0;
        selectedWords = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (String anWord : wordsList) {
            averageWordLength += anWord.length();
        }
        averageWordLength /= wordsList.length;
        System.out.print("Square or Rectangular? (s) or (r): ");
        shape = scanner.next();
        System.out.print("How many words?: ");
        wordsQuan = scanner.nextInt();
        size = (int) (Math.ceil(Math.sqrt((wordsQuan * averageWordLength) * 2)));
        wordSearchMatrix = generateRandomMatrix(size,shape);
        if (shape.equals("r")) {
            size *= 1.3;
            availabilityMatrix = new boolean[size / 2][size];
        } else {
            availabilityMatrix = new boolean[size][size];
        }
        for (int i = 0; i < wordsQuan; i++) {
            do {
                word = selectWord();
                position = (int) (Math.round(Math.random() * 2));
                switch (position){
                    case 0:
                        requiredLength = size;
                        break;
                    case 1, 2:
                        requiredLength = size / 2;
                        break;
                }
            } while (word.length() > requiredLength);
            direction = random.nextBoolean();
            if (direction) {
                word = reverseWord(word);
            }
            wordChar = word.toCharArray();
            initialBox = setInitialBox(position,wordChar.length);
            if (checkAvailability(wordChar,initialBox,position)) {
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
    }

    public char[][] generateRandomMatrix(int size, String shape) {
        char[][] randomMatrix;
        if (shape.equals("r")) {
            size *= 1.3;
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
            selectedWord = wordsList[(int) (Math.round(Math.random() * 88))];
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

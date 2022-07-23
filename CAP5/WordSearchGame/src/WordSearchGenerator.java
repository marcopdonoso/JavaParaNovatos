public class WordSearchGenerator {
    private String[] wordsList;
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

    private char[][] generateRandomMatrix(int size, char shape) {
        char[][] randomMatrix;
        if (shape == 'r') {
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

}

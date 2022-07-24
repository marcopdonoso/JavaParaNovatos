public class Main {
    public static void main(String[] args) {
        WordSearchGenerator wordSearchGenerator = new WordSearchGenerator();
        char[][] matrix = wordSearchGenerator.generateRandomMatrix(10,"s");
        for (char[] chars : matrix) {
            for (char unChar : chars) {
                System.out.printf("%3c",unChar);
            }
            System.out.println();
        }
    }
}

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DecomposeText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence;
        System.out.println("Write a sentence: ");
        sentence = scanner.nextLine();
        System.out.println("Sentence saved in out.txt");
        System.out.println("Your sentence will be decomposed, each word on a line.");
        try {
            FileWriter fileWriter = new FileWriter("out.txt");
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    fileWriter.write("\n");
                } else {
                    fileWriter.write(sentence.charAt(i));
                }
            }
            fileWriter.close();
        } catch (IOException ioException) {
            ioException.fillInStackTrace();
        }


    }
}

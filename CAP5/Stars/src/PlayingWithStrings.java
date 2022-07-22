import java.util.Scanner;

public class PlayingWithStrings {
    private String string;

    public void readString() {
        Scanner scanner = new Scanner(System.in);
        string = scanner.nextLine();
    }

    public char[] vocalsToStars() {
        char[] charString = string.toCharArray();
        for (int i = 0; i < charString.length; i++) {
            switch (charString[i]) {
                case 'a','e','i','o','u':
                    charString[i] = '*';
                    break;
            }
        }
        return charString;
    }



}

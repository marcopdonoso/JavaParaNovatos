import java.io.BufferedReader;
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
                case 'a','e','i','o','u','A','E','I','O','U':
                    charString[i] = '*';
                    break;
            }
        }
        return charString;
    }

    public StringBuffer invertString() {
        StringBuffer stringBuffer = new StringBuffer(string);
        return stringBuffer.reverse();
    }

    public boolean alphabetic() {
        boolean isOrdered = true;
        int i = 1;
        char[] charString = string.toCharArray();
        while (isOrdered && i < charString.length) {
                isOrdered = (int) charString[i] > (int) charString[i - 1];
                i++;
        }
        return isOrdered;
    }

    public void countingVocals() {
        int a = 0,e = 0,i = 0,o = 0,u = 0;
        char[] charString = string.toCharArray();
        for (int j = 0; j < charString.length; j++) {
            switch (charString[j]) {
                case 'a','A':
                    a++;
                    break;
                case 'e','E':
                    e++;
                    break;
                case 'i','I':
                    i++;
                    break;
                case 'o','O':
                    o++;
                    break;
                case 'u','U':
                    u++;
                    break;
            }
        }
        System.out.println("A = " + a + ", E = " + e + ", I = " + i + ", O = " + o + ", U = " + u);
    }
}

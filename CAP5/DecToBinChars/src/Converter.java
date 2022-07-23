import java.util.Scanner;

public class Converter {
    private String decNumStr;

    public void readNum() {
        System.out.print("Por favor introduzca un numero decimal: ");
        Scanner scanner = new Scanner(System.in);
        decNumStr = scanner.next();
    }

    public void decToBin() {
        char[] numChars = decNumStr.toCharArray();
        int decNum = 0;
        for (int i = 0; i < numChars.length; i++) {
            if (numChars[i] != 0) {
                decNum += (numChars[i] - 48) * Math.pow(10,(numChars.length - (i + 1)));
            }
        }
        System.out.println(decNum);
        System.out.println(Integer.toBinaryString(decNum));
    }
}

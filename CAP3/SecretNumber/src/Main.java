import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userNumber;
        int attemptsCounter = 0;
        String answer;

        SecretNumber secretNumber = new SecretNumber();
        Scanner scanner = new Scanner(System.in);
        secretNumber.secretNumberGen();

        System.out.println("NUMERO SECRETO");
        System.out.println("______________");
        System.out.println("Adivina el numero secreto!");
        do {
            System.out.print("Intenta a continuacion: ");
            attemptsCounter++;
            userNumber = scanner.nextInt();
            answer = secretNumber.comparator(userNumber);
            System.out.println();
            System.out.println(answer);
            System.out.println();
        } while (!Objects.equals(answer, "ACERTASTE!!! :)"));
        if(attemptsCounter > 5) {
            System.out.println("Pero lo hiciste en " + attemptsCounter + " intentos!... inutil!!! jajaja XD");
            System.out.println("VETE A LLORAR!!! PERDEDOOOOOOR!!!");
        } else if (attemptsCounter == 1) {
            System.out.println("A LA PRIMERA!!!\nMASTER OF PUPPETS!!!\nIDOLO!!!\nCRACK!!!");
        } else {
            System.out.println("Y lo hiciste en tan solo " + attemptsCounter + " intentos!");
        }
    }
}

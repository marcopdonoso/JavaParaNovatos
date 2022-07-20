import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UI ui = new UI();
        final int N;
        int sel;
        System.out.println("JUGANDO CON MATRICES");
        System.out.println("--------------------");
        System.out.println();
        System.out.print("INGRESE EL VALOR DE N PARA LA MATRIZ DE NxN: ");
        N = scanner.nextInt();
        FiddlingWithArrays fiddlingWithArrays = new FiddlingWithArrays(N);
        ui.mainMenu();
        sel = scanner.nextInt();

        if (sel == 1) {

        }

    }

}

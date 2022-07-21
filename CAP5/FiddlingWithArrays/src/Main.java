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

        do {
            ui.mainMenu();
            sel = scanner.nextInt();
            switch (sel) {
                case 1:
                    fiddlingWithArrays.getArray2d();
                    break;
                case 2:
                    System.out.println(fiddlingWithArrays.perimeter(0,N,0,N));
                    break;
                case 4:
                    System.out.println("HASTA LA VISTA");
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }
            System.out.println();
        } while (sel != 4);

    }

}

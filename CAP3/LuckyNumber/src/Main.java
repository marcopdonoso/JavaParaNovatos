import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day;
        int month;
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("LUCKY NUMBER");
        System.out.println("Introduzca su fecha de nacimiento");
        System.out.print("Day: ");
        day = scanner.nextInt();
        System.out.print("Month: ");
        month = scanner.nextInt();
        System.out.print("Year: ");
        year = scanner.nextInt();
        LuckyNumber luckyNumber = new LuckyNumber(day,month,year);
        System.out.println("Tu numero de la suerte es: " + luckyNumber.luckyGen());
    }
}

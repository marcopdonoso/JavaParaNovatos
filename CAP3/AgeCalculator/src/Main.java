import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int birthYear;
        final int birthMonth;
        final int birthDay;
        final int currentYear;
        final int currentMonth;
        final int currentDay;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Año de nacimiento: ");
        birthYear = scanner.nextInt();
        System.out.println("Mes de nacimiento: ");
        birthMonth = scanner.nextInt();
        System.out.println("Dia de nacimiento: ");
        birthDay = scanner.nextInt();

        System.out.println();

        System.out.println("Año actual: ");
        currentYear = scanner.nextInt();
        System.out.println("Mes actual: ");
        currentMonth = scanner.nextInt();
        System.out.println("Dia actual: ");
        currentDay = scanner.nextInt();

        System.out.println();

        AgeCalculator ageCalculator = new AgeCalculator(birthYear,birthMonth,birthDay,currentYear,currentMonth,currentDay);

        System.out.println("Tú tienes " + ageCalculator.ageCalc() + " años");
    }
}

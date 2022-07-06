import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birthYear;
        int currYear;
        int birthMonth;
        int currMonth;
        int birthDay;
        int currDay;

        Scanner scanner = new Scanner(System.in);
        AgeCalculator ageCalculator = new AgeCalculator();
        Calendar actualDate = Calendar.getInstance();

        currYear = actualDate.get(Calendar.YEAR);
        currMonth = actualDate.get(Calendar.MONTH) + 1;
        currDay = actualDate.get(Calendar.DAY_OF_MONTH);

        System.out.println("La fecha actual es: " + currYear + "/" + currMonth + "/" + currDay);
        System.out.println("Introduzca su fecha de nacimiento");
        System.out.print("Año: ");
        birthYear = scanner.nextInt();
        System.out.print("Mes: ");
        birthMonth = scanner.nextInt();
        System.out.print("Día: ");
        birthDay = scanner.nextInt();

        System.out.println("Edad en años: " + ageCalculator.yearsCalc(birthYear,currYear,birthMonth,currMonth,birthDay,currDay));
        System.out.println("Edad en meses: " + ageCalculator.monthsCalc(birthYear,currYear,birthMonth,currMonth,birthDay,currDay));
        System.out.println("Edad en días: " + ageCalculator.daysCalc(birthYear,currYear,birthMonth,currMonth,birthDay,currDay));
        System.out.println("Edad en horas: " + ageCalculator.hoursCalc(birthYear,currYear,birthMonth,currMonth,birthDay,currDay));
        System.out.println("Edad en minutos: " + ageCalculator.minutesCalc(birthYear,currYear,birthMonth,currMonth,birthDay,currDay));
        System.out.println("Edad en segundos: " + ageCalculator.secondsCalc(birthYear,currYear,birthMonth,currMonth,birthDay,currDay));
    }
}

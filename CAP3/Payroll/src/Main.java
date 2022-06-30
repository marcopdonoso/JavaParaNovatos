import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double hourly;
        double workedHours1;
        double workedHours2;
        double workedHours3;
        double workedHours4;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Precio por hora: ");
        hourly = scanner.nextDouble();
        System.out.print("Horas trabajadas en semana 1: ");
        workedHours1 = scanner.nextDouble();
        System.out.print("Horas trabajadas en semana 2: ");
        workedHours2 = scanner.nextDouble();
        System.out.print("Horas trabajadas en semana 3: ");
        workedHours3 = scanner.nextDouble();
        System.out.print("Horas trabajadas en semana 4: ");
        workedHours4 = scanner.nextDouble();

        System.out.println();

        Payroll payForWorker1 = new Payroll(hourly, workedHours1, workedHours2, workedHours3, workedHours4);
        System.out.println("El pago de la semana 1 es: " + payForWorker1.weekPay(workedHours1));
        System.out.println("El pago de la semana 2 es: " + payForWorker1.weekPay(workedHours2));
        System.out.println("El pago de la semana 3 es: " + payForWorker1.weekPay(workedHours3));
        System.out.println("El pago de la semana 4 es: " + payForWorker1.weekPay(workedHours4));

        System.out.println();

        System.out.println("El pago bruto del mes es: " + payForWorker1.monthGrossPay());
        System.out.println("Los descuentos por impuestos son: " + payForWorker1.discountByTaxes());
        System.out.println("El pago neto del mes es: " + payForWorker1.netEarnings());
    }
}

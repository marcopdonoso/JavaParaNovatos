import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TimesTable timesTable  = new TimesTable();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a Number for a Times Table: ");
        timesTable.writeTable(scanner.nextInt());

        timesTable.readTable();
    }
}

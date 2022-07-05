import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double amount;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba una cantidad en euros: ");
        amount = scanner.nextDouble();

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.changeCalc(amount);

        System.out.println("El cambio en monedas es:");
        System.out.println(vendingMachine.getEuros() + " Monedas de 1 Euro");
        System.out.println(vendingMachine.getFifties() + " Monedas de 50ctvs");
        System.out.println(vendingMachine.getTwenties() + " Monedas de 20ctvs");
        System.out.println(vendingMachine.getTens() + " Monedas de 10ctvs");
        System.out.println(vendingMachine.getFives() + " Monedas de 5ctvs");
    }
}

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        String op;
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora basica");

        do {
            System.out.print("Introduzca el primer numero: ");
            a = calculator.readNumber();
            System.out.print("Introduzca el segundo numero: ");
            b = calculator.readNumber();
            System.out.print("Seleccione la operacion a realizar (+  -  *  /): ");
            op = calculator.readOp();
            System.out.println(a + " " + op + " " + b + " = " + calculator.calc(a, b, op));
            System.out.print("Desea continuar? (N para salir, cualquier tecla para continuar): ");

        } while (!Objects.equals(sc.next(), "N"));
    }
}

import java.util.Scanner;

public class Calculator {
     Scanner scanner = new Scanner(System.in);

     public double readNumber() {
         return scanner.nextDouble();
     }

     public String readOp() {
          return scanner.next();
     }

     public double calc(double a, double b, String op) {
          double result = 0;
          switch (op) {
               case "+":
                    result = a + b;
                    break;
               case "-":
                    result = a - b;
                    break;
               case "*":
                    result = a * b;
                    break;
               case "/":
                    result = a / b;
                    break;
               default:
                    System.out.println("Operacion Invalida");
          }
          return result;
     }
}

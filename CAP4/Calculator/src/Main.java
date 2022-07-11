public class Main {
    public static void main(String[] args) {
        int a;
        int b;

        Calc calc = new Calc();
        a = calc.readNumber();
        b = calc.readNumber();

        System.out.println(a + " + " + b + " = " + calc.add(a,b));
        System.out.println(a + " * " + b + " = " + calc.multi(a,b));
        System.out.println(a + " / " + b + " = " + calc.div(a,b));
        System.out.println(a + " mod " + b + " = " + calc.mod(a,b));
    }
}

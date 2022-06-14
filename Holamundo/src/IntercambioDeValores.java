public class IntercambioDeValores {
    public static void main(String[] args) {
        /*
        int a, b, x;

        a = 5;
        b = 8;

        System.out.println("Valor de a: " + a + ", valor de b: " + b);

        x = a;
        a = b;
        b = x;

        System.out.println("Valor de a: " + a + ", valor de b: " + b);
         */

        int a, b, c, aux;

        a = 1;
        b = 2;
        c = 3;

        System.out.println("a: " + a + "\nb: " + b + "\nc: " + c);

        // b toma valor de a
        // c toma valor de b
        // a toma valor de c

        aux = b;
        b = a;
        a = c;
        c = aux;

        System.out.println("a: " + a + "\nb: " + b + "\nc: " + c);
    }
}

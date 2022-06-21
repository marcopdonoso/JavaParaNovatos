public class Pairs {
    private int a;
    private int b;
    private int aux;

    Pairs(int a, int b) {
        this.a = a;
        this.b = b;
        if (this.a >= this.b) {
            aux = this.a;
            this.a = this.b;
            this.b = aux;
        }
    }

    public void pairs() {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void odds() {
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

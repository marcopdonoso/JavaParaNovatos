public class Pairs {
    private int a;
    private int b;

    Pairs(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void pairs() {
        if (a >= b) {
            System.out.println("IDIOTA!!! el primer numero debe ser menor al segundo!!!, vuelve a nacer!!!");
        } else {
            for (int i = a + 1; i < b; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}

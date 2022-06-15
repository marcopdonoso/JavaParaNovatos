public class MiSegundoPrograma {
    public static void main(String[] args) {
        int i = 0;
        char x;

        while (i < 5) {
            x = (char) (Math.random()*21 + 'A');
            if (x == 65 || x == 69 || x == 73 || x == 79 || x == 86) {
                System.out.println(x);
                i++;
            }
        }
    }
}

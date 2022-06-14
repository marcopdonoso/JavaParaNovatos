public class GeneradorDeLetras {
    public static void main(String[] args) {
        System.out.println(getLetra());
        System.out.println(getLetra());
        System.out.println(getLetra());
        System.out.println(getLetra());
    }
    public static char getLetra() {
        return (char) (Math.random()*26 + 'a');
    }
}
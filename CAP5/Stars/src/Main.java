public class Main {
    public static void main(String[] args) {
        Stars stars = new Stars();
        System.out.print("Introduce una cadena: ");
        stars.readString();
        for (char anChar : stars.vocalsToStars()) {
            System.out.print(anChar);
        }
    }
}

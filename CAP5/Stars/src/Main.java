public class Main {
    public static void main(String[] args) {
        PlayingWithStrings playingWithStrings = new PlayingWithStrings();
        System.out.print("Introduce una cadena: ");
        playingWithStrings.readString();
        for (char anChar : playingWithStrings.vocalsToStars()) {
            System.out.print(anChar);
        }
    }
}

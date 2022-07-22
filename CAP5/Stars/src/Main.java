public class Main {
    public static void main(String[] args) {
        PlayingWithStrings playingWithStrings = new PlayingWithStrings();
        System.out.print("Introduce una cadena: ");
        playingWithStrings.readString();
        System.out.println();
        System.out.println("Vocales por *");
        for (char anChar : playingWithStrings.vocalsToStars()) {
            System.out.print(anChar);
        }
        System.out.println();
        System.out.println();
        System.out.println("Invertido");
        System.out.println(playingWithStrings.invertString());
        System.out.println();
        System.out.println("Esta ordenado alfabeticamente?");
        System.out.println(playingWithStrings.alphabetic());
        System.out.println();
        System.out.println("Contando vocales:");
        playingWithStrings.countingVocals();
        System.out.println();
        System.out.println("Es un Palindromo?");
        System.out.println(playingWithStrings.palindrome());
    }
}

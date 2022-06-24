public class Main {
    public static void main(String[] args) {
        MajMinMid majMinMid = new MajMinMid();
        for (int i = 0; i < 3; i++) {
            majMinMid.readKey();
        }
        majMinMid.detMajMinMid();
    }
}

public class Main {
    public static void main(String[] args) {
        OrderedNumbers orderedNumbers = new OrderedNumbers();
        for (int i = 0; i < 3; i++) {
            orderedNumbers.readKey();
        }
        orderedNumbers.ordDet();
        orderedNumbers.consNum();
    }
}

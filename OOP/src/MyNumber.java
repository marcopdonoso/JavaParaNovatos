public class MyNumber {
    private int num;

    MyNumber(){
        num = 0;
    }

    MyNumber(int num) {
        this.num = num;
    }

    void changeNum (int newValue) {
        num = newValue;
    }

    void add(int num2) {
        num = num + num2;
    }

    void sus(int num2) {
        num = num - num2;
    }

    int getValue() {
        return num;
    }

    int getDouble() {
        return num * 2;
    }

    int getTriple() {
        return num * 3;
    }

    int getQuad() {
        return num * 4;
    }
}

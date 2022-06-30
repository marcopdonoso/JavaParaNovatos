public class Quiniela {

    private char valGen() {
        int numericVal;
        numericVal = (int) Math.ceil(Math.random() * 3 - 1);
        if (numericVal == 0) {
            return 'X';
        } else {
            return (char) (numericVal + '0');
        }
    }

    public void quiniela() {
        for (int i = 0; i < 13; i++) {
            System.out.print(valGen() + " - ");
        }
        System.out.print(valGen());
    }
}

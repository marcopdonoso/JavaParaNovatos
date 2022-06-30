public class PrimitiveLottery {

    public int randomNum() {
        return (int) (Math.random() * 49);
    }

    public void lottery() {
        for (int i = 0; i < 6; i++) {
            System.out.print(randomNum() + "  ");
        }
    }
}

public class InterAcc {
    private int acc = 0;
    private int counter = 0;

    public double midValCalc(int acc, int counter) {
        return (double) acc / counter;
    }

    public void setAcc(int number) {
        if (number >= 0) {
            this.acc += number;
            this.counter++;
        } else {
            System.out.println("El valor medio es: " + midValCalc(this.acc,this.counter));
        }
    }
}

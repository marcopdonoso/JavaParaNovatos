public class VendingMachine {
    private int euros;
    private int fifties;
    private int twenties;
    private int tens;
    private int fives;

    public void changeCalc(double amount) {
        euros = penniesCalc(amount, 100);
        amount -= euros;
        amount = calcCorrection(amount);
        fifties = penniesCalc(amount, 50);
        amount -= fifties * 0.50;
        amount = calcCorrection(amount);
        twenties = penniesCalc(amount, 20);
        amount -= twenties * 0.20;
        amount = calcCorrection(amount);
        tens = penniesCalc(amount, 10);
        amount -= tens * 0.10;
        amount = calcCorrection(amount);
        fives = penniesCalc(amount, 5);
    }

    public int penniesCalc(double amount, int coinCut) {
        amount = amount * 100 / coinCut;
        return (int) Math.floor(amount);
    }

    public double calcCorrection(double amount) {
        amount *= 100;
        amount = Math.round(amount);
        amount /= 100;
        return amount;
    }

    public int getEuros() {
        return euros;
    }

    public int getFifties() {
        return fifties;
    }

    public int getTwenties() {
        return twenties;
    }

    public int getTens() {
        return tens;
    }

    public int getFives() {
        return fives;
    }
}

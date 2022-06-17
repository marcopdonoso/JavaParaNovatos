public class Restaurante {

    private int eggs;
    private double sausage;

    Restaurante(int eggsDozens, double sausageKg) {
        this.eggs = eggsDozens * 12;
        this.sausage = sausageKg * 1000;
    }

    public void addEggs(int dozens) {
        eggs += dozens * 12;
    }

    public void addSausages(double kg) {
        sausage += kg * 1000;
    }

    public double getNumPlates() {
        double platesBasedOnEggs, platesBasedOnSausage;
        platesBasedOnEggs = eggs / 2;
        platesBasedOnSausage = sausage / 200;
        if (platesBasedOnEggs <= platesBasedOnSausage) {
            return platesBasedOnEggs;
        } else {
            return platesBasedOnSausage;
        }
    }

    public void plateServe(){

    }
}

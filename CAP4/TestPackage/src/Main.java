import utilities.math.Add;
import utilities.math.Pow;

public class Main {
    public static void main(String[] args) {
        Add add = new Add();
        Pow pow = new Pow();

        System.out.println(add.addition(5,8));
        System.out.println(add.addition(2.5,8.5));

        System.out.println(pow.raise(2,3));
        System.out.println(pow.raise(2.5,3));
    }
}

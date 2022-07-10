public class Riddle {

    Riddle (int i) {
        this("Soy un enigma");
        System.out.println("Mi número es " + i);
    }

    Riddle (String s) {
        System.out.println(s);
    }

    void saluda() {
        System.out.println("Hola.");
    }
}

public class Color {

    public void fillWhite () {
        White white = new White();
    }

    public void fillBlack () {
        Black black = new Black();
    }

    // Clases anidadas (nested classes)
    public class White {
        public White () {
            System.out.println("Pinto blanco");
        }
    }

    public class Black {
        public Black () {
            System.out.println("Pinto negro");
        }
    }
}

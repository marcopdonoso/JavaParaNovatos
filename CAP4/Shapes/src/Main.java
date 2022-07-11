public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.id();
        System.out.println(shape);

        Circle circle = new Circle();
        circle.id();
        System.out.println(shape);

        Shape shape1 = new Triangle();
        shape1.id();
        System.out.println(shape1);
    }
}

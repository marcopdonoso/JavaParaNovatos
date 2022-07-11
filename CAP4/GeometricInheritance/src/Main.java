public class Main {
    public static void main(String[] args) {
        GeometricFigure geometricFigure1, geometricFigure2;
        Circle circle1, circle2;
        Rectangle rectangle1, rectangle2;
        Square square1, square2;

        // Probando los métodos constructores
        geometricFigure1 = new GeometricFigure();
        System.out.println(geometricFigure1.toString());

        circle1 = new Circle();
        System.out.println(circle1.toString());

        rectangle1 = new Rectangle();
        System.out.println(rectangle1.toString());

        square1 = new Square();
        System.out.println(square1.toString());

        System.out.println();

        // Probando métodos setters y getters
        geometricFigure1.setColor("Blue");
        geometricFigure1.setFilling(false);
        System.out.println(geometricFigure1.toString());

        circle1.setRadius(3);
        circle1.setColor("Green");
        System.out.println(circle1.toString() + " mi área es: " + circle1.getArea());

        rectangle1.setHeight(2);
        System.out.println(rectangle1.toString() + " mi perímetro es: " + rectangle1.getPerimeter());

        square1.setHeight(4);
        square1.setFilling(false);
        System.out.println(square1.toString() + " mi área es: " + square1.getArea());

        System.out.println();

        // Probando conversiones de tipo (castings)
        geometricFigure2 = (GeometricFigure) circle1; // upcasting (puede no ser explícito)

        circle2 = (Circle) geometricFigure2; // downcasting -> funciona porque geometricFigure2 fue instanciado antes como circle1.

        rectangle2 = (Rectangle) square1; // upcasting (puede no ser explícito)

        // square2 = (Square) geometricFigure1; // downcasting -> no funciona porque geometricFigure1 fue instanciado previamente como GeometricFigure

        square2 = (Square) rectangle2; // downcasting -> funciona porque rectangle2 fue instanciado antes como square1.

        // Resultados de las conversiones
        System.out.println(geometricFigure2.toString());
        System.out.println("Mi área es: " + ((Circle) geometricFigure2).getArea() + ", mi color es: " + geometricFigure2.getColor());

        System.out.println();

        System.out.println(circle2.toString());

        System.out.println();

        System.out.println(rectangle2.toString());

        System.out.println();

        System.out.println(square2.toString());
    }
}

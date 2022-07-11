public abstract class Shape {
    private static int objectCounter = 0;
    private int id;

    public Shape() {
        objectCounter++;
        id = objectCounter;
    }

    public abstract String toString();

    public void id() {
        System.out.println("Mi ID es: " + id);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sidesNumber;
        double sideLength;
        double apothem;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor introduzca el numero de lados del poligono: ");
        sidesNumber = scanner.nextInt();

        Polygons polygons = new Polygons(sidesNumber);

        if (sidesNumber < 3 || sidesNumber > 12) {
            System.out.println(polygons.polyDen());
        } else {
            System.out.print("Por favor introduzca la longitud de los lados: ");
            sideLength = scanner.nextDouble();
            polygons.setSideLength(sideLength);

            System.out.print("Por favor introduzca la apotema del poligono: ");
            apothem = scanner.nextDouble();
            polygons.setApothem(apothem);

            System.out.println("RESULTADOS");
            System.out.println("__________");
            System.out.println("El Area del " + polygons.polyDen() + " es: " + polygons.areaCalc());
            System.out.println("El Perimetro del " + polygons.polyDen() + " es: " + polygons.periCalc());
        }
    }
}

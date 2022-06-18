import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestComputingUnitConverter {
    public static void main(String[] args) {
        String unitFrom = "";
        String unitTo = "";
        double quantity = 0;

        System.out.println("Indique las unidades de partida");
        System.out.println("(1) bits\n(2) Bytes\n(3) Kb\n(4) Mb\n(5) Gb\n(6) Mebibits\n");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            unitFrom = bufferedReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Indique las unidades finales");
        System.out.println("(1) bits\n(2) Bytes\n(3) Kb\n(4) Mb\n(5) Gb\n(6) Mebibits\n");
        try {
            unitTo = bufferedReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Escriba la cantidad que desea convertir");
        try {
            quantity = Double.parseDouble(bufferedReader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }

        ComputingUnitConverter computingUnitConverter = new ComputingUnitConverter(quantity,unitFrom);
        switch (unitTo) {
            case "1":
                System.out.println("Son " + computingUnitConverter.getBits() + " bits");
                break;
            case "2":
                System.out.println("Son " + computingUnitConverter.getBytes() + " Bytes");
                break;
            case "3":
                System.out.println("Son " + computingUnitConverter.getKBits() + " Kilobits");
                break;
            case "4":
                System.out.println("Son " + computingUnitConverter.getMBits() + " Megabits");
                break;
            case "5":
                System.out.println("Son " + computingUnitConverter.getGBits() + " Gigabits");
                break;
            case "6":
                System.out.println("Son " + computingUnitConverter.getMiB() + " Mebibits");
                break;
            default:
                System.out.println("Opción No Válida: Programa terminado.");
        }
    }
}

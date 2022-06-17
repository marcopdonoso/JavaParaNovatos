import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProbarPeso {
    public static void main(String[] args) {
        double peso = 0;
        String unitsFrom = "";
        String unitsTo = "";
        double result = 0;

        System.out.println("");
        System.out.println("Por favor indique las unidades iniciales, pueden ser: lbs, oz, kg, g");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            unitsFrom = bufferedReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Indique las unidades a las que desea convertir, pueden ser: lbs, oz, kg, g");
        try {
            unitsTo = bufferedReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Introduzca la cantidad que desea convertir:");
        try {
            peso = Double.parseDouble(bufferedReader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Peso convPeso = new Peso(peso,unitsFrom);

        switch (unitsTo) {
            case "lbs":
                result = convPeso.getPounds();
                break;
            case "oz":
                result = convPeso.getOz();
                break;
            case "kg":
                result = convPeso.getKg();
                break;
            case "g":
                result = convPeso.getGrams();
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }

        System.out.println("\n" + peso + unitsFrom + " son " + result + unitsTo);
    }
}

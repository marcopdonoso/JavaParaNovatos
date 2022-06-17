import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProbarTempUnitsConverter {
    public static void main(String[] args) {
        String units = "";
        double temp = 0;

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Por favor selecciona el tipo de conversión de temperatura");
        System.out.println("(1) Celcius a Farenheit\n(2) Farenheit a Celsius");

        try {
            units = (buff.readLine());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        if(units.equals("1") || units.equals("2")) {
            System.out.println("Introduce el dato de temperatura a convertir");
            try {
                temp = Double.parseDouble(buff.readLine());
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            TempUnitsConverter tempUnitsConverter = new TempUnitsConverter();
            if (units.equals("1")) {
                System.out.println("La temperatura en °F es: " + tempUnitsConverter.celciusToFarenheit(temp));
            } else {
                System.out.println("La temperatura en °C es: " + tempUnitsConverter.farenheitToCelcius(temp));
            }
        } else {
            System.out.println("Seleccione una de las opciones de la lista...");
            System.out.println("Programa finalizado");
        }
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProbarConversorDivisas {
    public static void main(String[] args) {
        String convType = "";
        String op = "";
        double cant = 0;
        double changeType = 0;
        double convCant;

        System.out.println("Por favor introduzca el tipo de conversión de moneda");
        System.out.println("(1) Libras a Euros\n(2) Euros a Libras");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            convType = bufferedReader.readLine();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Por favor indique si quiere cambiar el tipo de cambio");
        System.out.println("EL TIPO DE CAMBIO POR DEFECTO ES: 1 Libra = 0.85 Euros");
        System.out.println("(1) Mantener tipo de cambio por defecto\n(2) Cambiar tipo de cambio");
        try {
            op = bufferedReader.readLine();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        if (op.equals("2")) {
            System.out.println("Introduzca el tipo de nuevo cambio: 1 Libra = ? Euros");
            try {
                changeType = Double.parseDouble(bufferedReader.readLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Introduzca la cantidad a convertir:");
        try {
            cant = Double.parseDouble(bufferedReader.readLine());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        ConversorDivisas conversorDivisas;
        if (op.equals("1")) {
            conversorDivisas = new ConversorDivisas();
        } else {
            conversorDivisas = new ConversorDivisas(changeType);
        }

        if (convType.equals("1")) {
            convCant = conversorDivisas.librasToEuros(cant);
            System.out.println(cant + " Libras son " + convCant + " Euros");
        } else {
            convCant = conversorDivisas.eurosToLibras(cant);
            System.out.println(cant + " Euros son " + convCant + " Libras");
        }
    }
}

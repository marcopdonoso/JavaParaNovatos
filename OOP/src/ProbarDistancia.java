import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProbarDistancia {
    public static void main(String[] args) {
        double distance = 0;

        System.out.println("Introduzca la distancia en millas:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            distance = Double.parseDouble(bufferedReader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Distancia distancia = new Distancia();
        System.out.println("Distancia en metros: " + distancia.milesToMeters(distance));
        System.out.println("Distancia en kilómetros: " + distancia.milesToKilometers(distance));
    }
}

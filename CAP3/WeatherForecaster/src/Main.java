import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pressure;
        int humidity;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Predictor Climatologico");
        System.out.println("-----------------------");
        System.out.print("Indique el nivel de presion atmosferica actual (1) Bajo (2) Medio (3) Alto: ");
        pressure = scanner.nextInt();

        System.out.print("Indique el nivel de humedad relativa actual (1) Bajo (2) Medio (3) Alto: ");
        humidity = scanner.nextInt();

        WeatherForecaster weatherForecaster = new WeatherForecaster(pressure, humidity);

        System.out.println("PREDICCION DEL CLIMA PARA EL DIA DE MAÑANA");
        System.out.println("------------------------------------------");
        System.out.println("Probabilidad de lluvia: " + weatherForecaster.rainProb());
        System.out.println("Probabilidad de sol: " + weatherForecaster.sunProb());
        System.out.println("Probabilidad de frio: " + weatherForecaster.coldProb());
    }
}

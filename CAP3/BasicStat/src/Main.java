import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        double number;
        double max = 0;
        double min = 0;
        int valQuan = 0;
        double mid = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BasicStat basicStat = new BasicStat();

        System.out.print("Indique la cantidad de valores a analizar: ");
        try {
            valQuan = Integer.parseInt(bufferedReader.readLine());
            basicStat.setValQuan(valQuan);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < valQuan; i++) {
            try {
                System.out.print((i + 1) + ") ");
                number = Double.parseDouble(bufferedReader.readLine());
                if (i == 0) {
                    basicStat.setMax(number);
                    basicStat.setMin(number);
                }
                max = basicStat.maxVal(number);
                min = basicStat.minVal(number);
                mid = basicStat.midVal(number);
                basicStat.setSeries(i,number);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("El valor maximo es: " + max);
        System.out.println("El valor minimo es: " + min);
        System.out.println("El valor medio es: " + mid);
        System.out.println("El valor de la desviacion estandar es: " + basicStat.stdDev());
        System.out.println("El valor de la mediana es: " + basicStat.median());
    }
}

import java.util.Arrays;

public class BasicStat {
    /**
     * Operaciones de estadística básica entre un serie de datos
     * Incluye: Valor máximo, Valor mínimo, Valor Medio, Desviación Típica y la Mediana
     */

    private double max = 0;
    private double min = 0;
    private double acc = 0;
    private double mid = 0;
    private int valQuan;
    private double[] series;

    public double maxVal(double number) {
        /**
         * Calcula el valor máximo entre un nuevo valor y un valor anterior
         *
         * @param number Nuevo valor
         */
        if (number > max) {
            max = number;
        }
        return max;
    }

    public double minVal(double number) {
        /**
         * Calcula el valor mínimo entre un nuevo valor y un valor anterior
         *
         * @param number Nuevo valor
         */
        if (number < min) {
            min = number;
        }
        return min;
    }

    public double midVal(double number) {
        /**
         * Calcula el valor medio de una serie de valores
         *
         * @param number Valor nuevo recibido por el acumulador
         */
        acc += number;
        mid = acc / valQuan;
        return mid;
    }

    public double stdDev() {
        /**
         * Calcula la desviación estándar de una serie de valores
         */
        double stdDev;
        double sumSqr = 0;
        for (int i = 0; i < valQuan; i++) {
            sumSqr += Math.pow(series[i] - mid,2);
        }
        return Math.sqrt(sumSqr / valQuan);
    }

    public double median() {
        /**
         * Calcula el valor de la mediana ordenando una serie
         * de valores, y verificando si la cantidad de valores en la serie
         * es par o impar para proceder con el cálculo adecuado
         */
        Arrays.sort(series);
        if (valQuan % 2 == 0) {
            int n1;
            int n2;
            n1 = (valQuan - 1) / 2;
            n2 = n1 + 1;
            return (series[n1] + series[n2]) / 2;
        } else {
            int n = (valQuan - 1) / 2;
            return series[n];
        }
    }

    public void setMax(double number) {
        this.max = number;
    }

    public void setMin(double number) {
        this.min = number;
    }

    public void setValQuan(int valQuan) {
        this.valQuan = valQuan;
         series = new double[valQuan];
    }

    public double getSeries(int index) {
        return series[index];
    }

    public void setSeries(int index, double value) {
        this.series[index] = value;
    }
}

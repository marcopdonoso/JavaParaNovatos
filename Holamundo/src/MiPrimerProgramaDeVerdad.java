public class MiPrimerProgramaDeVerdad {
    public static void main(String[] args) {
        int r;
        double area, circunferencia;

        r = 10;

        circunferencia = 2 * r * Math.PI;
        area = Math.PI * Math.pow(r,2);

        System.out.println("Radio: " + r + "\nLongitud de circunferencia: " + circunferencia + "\nArea de circulo: " + area);

    }
}

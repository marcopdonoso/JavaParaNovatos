import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderedNumbers {
    private int x;
    private int y;
    private int z;
    private int i = 0;

    public void readKey() {
        i++;
        System.out.println("Introduzca el " + i + "ª:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            if (i == 1) {
                x = Integer.parseInt(bufferedReader.readLine());
            } else if (i == 2) {
                y = Integer.parseInt(bufferedReader.readLine());
            } else {
                z = Integer.parseInt(bufferedReader.readLine());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ordDet() {
        if (y >= x && z >= y) {
            System.out.println("Los numeros estan ordenados de menor a mayor.");
        } else {
            System.out.println("Los numeros NO estan ordenados de menor a mayor.");
        }
    }

    public void consNum() {
        if ((y - x >= 0) && (y - x <= 1) && (z - y >= 0) && (z - y <= 1)) {
            System.out.println("Los numeros son consecutivos");
        } else {
            System.out.println("Los numeros NO son consecutivos");
        }
    }
}

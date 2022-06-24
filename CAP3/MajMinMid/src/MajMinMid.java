import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MajMinMid {
    private int a;
    private int b;
    private int c;
    private int i = 0;

    public void readKey() {
        i++;
        System.out.println("Introduzca un numero: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            if(i == 1) {
                a = Integer.parseInt(bufferedReader.readLine());
            } else if (i == 2) {
                b = Integer.parseInt(bufferedReader.readLine());
            } else {
                c = Integer.parseInt(bufferedReader.readLine());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void  detMajMinMid() {
        char major = ' ';
        char middle = ' ';
        char minor = ' ';
        if (a > b && a > c) {
            major = 'a';
            if (b > c) {
                middle = 'b';
                minor = 'c';
            } else {
                middle = 'c';
                minor = 'b';
            }
        } else if (b > a && b > c) {
            major = 'b';
            if (a > c) {
                middle = 'a';
                minor = 'c';
            } else {
                middle = 'c';
                minor = 'a';
            }
        }  else {
            major = 'c';
            if (a > b) {
                middle = 'a';
                minor = 'b';
            } else {
                middle = 'b';
                minor = 'a';
            }
        }

        System.out.println("El Mayor es: " + major);
        System.out.println("El Menor es: " + minor);
        System.out.println("El del Medio es: " + middle);
    }
}

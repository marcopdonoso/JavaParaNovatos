import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeapYearDeterminer {
    private int year;

    public void readKey() {
        System.out.println("Escriba el año en el formato YYYY para saber si es bisiesto o no");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            year = Integer.parseInt(bufferedReader.readLine());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void detLeapYear() {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("SI es bisiesto");
                } else {
                    System.out.println("NO es bisiesto");
                }
            } else {
                System.out.println("SI es bisiesto");
            }
        } else {
            System.out.println("NO es bisiesto");
        }
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NotesVerif {

    private final double[] notes = new double[30];

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public void setNotes() {
        double score;
        for (int i = 0; i < 30; i++) {
            System.out.print("Introduzca la calificacion Nro. " + (i + 1) + ": ");
            try {
                score = Double.parseDouble(bufferedReader.readLine());
                if (score >= 1 && score <= 10) {
                    notes[i] = score;
                } else {
                    System.out.println();
                    System.out.println("Calificacion invalida, el rango permitido es de 1 a 10");
                    System.out.println();
                    i--;
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int susCount() {
        int suspended = 0;
        for (double note : notes) {
            if (note <= 5) {
                suspended++;
            }
        }
        return suspended;
    }

    public int appCount() {
        int approved = 0;
        for (double note : notes) {
            if (note > 5) {
                approved++;
            }
        }
        return approved;
    }
}

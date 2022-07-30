import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TimesTable {
    public void writeTable(int n) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("table.txt");
            for (int i = 0; i <= 10; i++) {
                fileWriter.write(n + " x " + i + " = " + n * i + "\n");
            }
            fileWriter.close();
        } catch (IOException ioException) {
            ioException.fillInStackTrace();
        }
    }

    public void readTable() {
        FileReader fileReader;
        try {
            fileReader = new FileReader("table.txt");
            int c;
            while ((c = fileReader.read()) != -1) {
                System.out.print((char) c);
            }
            fileReader.close();
        } catch (IOException ioException) {
            ioException.fillInStackTrace();
        }
    }
}

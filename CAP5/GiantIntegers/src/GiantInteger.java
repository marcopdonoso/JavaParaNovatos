import java.util.Arrays;

public class GiantInteger {

    private final int[] giantNumber;
    private final int maxSize = 50;

    public GiantInteger() {
        giantNumber = new int[maxSize];
        Arrays.fill(giantNumber, 0);
    }

    public void readGiantNumber(String numberS) {
        int pointer = maxSize - 1;
        for (int i = numberS.length() - 1; i >= 0 ; i--) {
            giantNumber[pointer] = numberS.charAt(i) - 48;
            pointer--;
        }
    }

    public void printGiantNumber() {
        for (int i : giantNumber) {
            System.out.print(i);
        }
    }

    public GiantInteger add(GiantInteger giantInteger) {
        GiantInteger giantIntegerResult = new GiantInteger();
        int overflow = 0;
        int partialResult;
        for (int i = maxSize - 1; i >= 0 ; i--) {
            partialResult = giantNumber[i] + giantInteger.getDigit(i) + overflow;
            if (partialResult >= 10) {
                giantIntegerResult.setDigit(partialResult - 10, i);
                overflow = 1;
            } else {
                giantIntegerResult.setDigit(partialResult, i);
                overflow = 0;
            }
        }
        return giantIntegerResult;
    }

    public GiantInteger sus(GiantInteger subtrahend) {
        GiantInteger diff = new GiantInteger();
        char bigger = whoIsBigger(subtrahend);
        int[] min;
        int[] sub;
        if (bigger == 'E') {
            Arrays.fill(diff.giantNumber,0);
            return diff;
        } else {
            if (bigger == '2') {
                min = subtrahend.giantNumber.clone();
                sub = giantNumber.clone();
            } else {
                min = giantNumber.clone();
                sub = subtrahend.giantNumber.clone();
            }
            int buffer;
            for (int i = maxSize - 1; i >= 0; i--) {
                buffer = min[i] - sub[i];
                if (buffer < 0) {
                    int j = i - 1;
                    while (min[j] == 0) {
                        min[j] = 9;
                        j--;
                    }
                    min[j]--;
                    buffer = 10 + min[i] - sub[i];
                }
                diff.giantNumber[i] = buffer;
            }
        }
        return diff;
    }

    public char whoIsBigger(GiantInteger giantInteger) {
        char bigger = 'E';
        int index = 0;
        while (bigger == 'E' && index < 50) {
            if (giantNumber[index] > giantInteger.getDigit(index)) {
                bigger = '1';
            } else if (giantNumber[index] < giantInteger.getDigit(index)) {
                bigger = '2';
            }
            index++;
        }
        return bigger;
    }

    public int getDigit(int index) {
        return giantNumber[index];
    }

    public void setDigit(int value, int index) {
        giantNumber[index] = value;
    }
}

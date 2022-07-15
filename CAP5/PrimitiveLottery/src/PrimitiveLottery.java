import java.util.ArrayList;
import java.util.Iterator;

public class PrimitiveLottery {
    public static void main(String[] args) {
        int a;

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            a = (int) (Math.random() * 50);
            if (arrayList.contains(a)) {
                i--;
            } else {
                arrayList.add(a);
            }
        }

        for (Integer integer : arrayList) {
            System.out.printf("%3d",integer);
        }
    }
}


import java.util.ArrayList;

public class CharSet extends Sets {
    private ArrayList<Character> arrayList;
    public CharSet() {
        arrayList = new ArrayList<>();
    }

    @Override
    public void insertElement(Character c) {
        arrayList.add(c);
    }

    @Override
    public void eraseElement(Character c) {
        if(!arrayList.remove(c)){
            System.out.println("El objeto no pertenece al conjunto.");
        }
    }

    @Override
    public void emptySet() {

    }

    @Override
    public boolean is() {
        return false;
    }
}

import java.util.ArrayList;

public class CharSet extends Sets {

    private ArrayList<Character> arrayList = new ArrayList<>();

    public void getSet() {
        System.out.println(arrayList.toString());
    }

    @Override
    public void insertElement() {
        System.out.print("Teclee el caracter a insertar al conjunto: ");
        arrayList.add(scanner.next().charAt(0));
    }

    @Override
    public void eraseElement() {
        System.out.print("Teclee el caracter a eliminar del conjunto: ");
        Character element = scanner.next().charAt(0);
        if(!arrayList.remove(element)) {
            System.out.println("El caracter " + element + " no pertenece al conjunto.");
        }
    }

    @Override
    public void emptySet() {
        arrayList.clear();
        System.out.println("El conjunto ha sido vaciado");
    }

    @Override
    public boolean is() {
        System.out.print("Teclee el caracter a buscar en el conjunto: ");
        return arrayList.contains(scanner.next().charAt(0));
    }
}

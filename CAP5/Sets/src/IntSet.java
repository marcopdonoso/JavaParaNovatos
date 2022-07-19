import java.util.ArrayList;

public class IntSet extends Sets {

    private ArrayList<Integer> arrayList = new ArrayList<>();

    @Override
    public void insertElement() {
        System.out.print("Teclee el caracter a insertar al conjunto: ");
        arrayList.add(scanner.nextInt());
    }

    @Override
    public void eraseElement() {
        System.out.print("Teclee el caracter a insertar al conjunto: ");
        Integer element = scanner.nextInt();
        if (!arrayList.remove(element)) {
            System.out.println("El entero " + element + " no pertenece al conjunto.");
        }
    }

    @Override
    public void emptySet() {
        arrayList.clear();
        System.out.println("El conjunto ha sido vaciado");
    }

    @Override
    public boolean is() {
        System.out.print("Teclee el entero a buscar en el conjunto: ");
        return arrayList.contains(scanner.nextInt());
    }
}

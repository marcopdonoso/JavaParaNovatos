public class Main {
    public static void main(String[] args) {

        CharSet caracteres1 = new CharSet();

        IntSet enteros1 = new IntSet();

        System.out.println("CONJUNTO DE CARACTERES Nro 1");
        for (int i = 0; i < 4; i++) {
            caracteres1.insertElement();
        }
        System.out.println();
        caracteres1.getSet();
        System.out.println();
        System.out.println("BORRAR UN ELEMENTO DEL CONJUNTO");
        caracteres1.eraseElement();
        System.out.println();
        caracteres1.getSet();
        System.out.println("CONSULTAR SI UN ELEMENTO PERTENECE AL CONJUNTO");
        if (caracteres1.is()) {
            System.out.println("SI PERTENECE");
        } else {
            System.out.println("NO PERTENECE");
        }
        System.out.println();
        System.out.println("VACIAR EL CONJUNTO...");
        caracteres1.emptySet();
        caracteres1.getSet();
    }
}

public class Main {
    public static void main(String[] args) {
        NotesVerif notesVerif = new NotesVerif();
        notesVerif.setNotes();
        System.out.println("\nEl numero de estudiantes suspedidos es: " + notesVerif.susCount());
        System.out.println("El numero de estudiantes aprobados es: " + notesVerif.appCount());
    }
}

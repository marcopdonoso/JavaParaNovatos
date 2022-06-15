public class ProbarPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setName("Johnny");
        persona1.setLastname("Crespo");
        persona1.setAge(58);
        persona1.setGender('M');

        System.out.println("Nombre: " + persona1.getName() + " " + persona1.getLastname());
        System.out.println("Edad: " + persona1.getAge());
        System.out.println("Sexo: " + persona1.getGender());
    }
}

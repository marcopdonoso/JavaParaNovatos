public class Main {
    public static void main(String[] args) {
        Animal perro = new Animal("Firulais", 2);
        Animal perro2 = perro.clone();

        System.out.println("El primer perrito se llama: " + perro.getName() + " y tiene " + perro.getAge() + " años.");
        System.out.println("El segundo perrito se llama: " + perro2.getName() + " y tiene " + perro2.getAge() + " años.");
        System.out.print ("Por tanto son ");
        if (perro.equals(perro2)) {
            System.out.println("igualitos los animalitos");
        } else {
            System.out.println("distintos.");
        }

        perro2.setName("Draco");
        perro2.setAge(5);

        System.out.println("El primer perrito se llama: " + perro.getName() + " y tiene " + perro.getAge() + " años.");
        System.out.println("El segundo perrito se llama: " + perro2.getName() + " y tiene " + perro2.getAge() + " años.");
        System.out.print ("Por tanto son ");
        if (perro.equals(perro2)) {
            System.out.println("igualitos los animalitos");
        } else {
            System.out.println("distintos.");
        }

        System.out.println("Se han registrado " + perro.getAnimalsCounter() + " animalitos");
    }
}

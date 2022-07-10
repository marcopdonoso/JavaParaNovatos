public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Firulais", 2);
        Animal animal2 = animal.clone();

        System.out.println("El primer animal se llama: " + animal.getName() + " y tiene " + animal.getAge() + " años.");
        System.out.println("El segundo animal se llama: " + animal2.getName() + " y tiene " + animal2.getAge() + " años.");
        System.out.print ("Por tanto son ");
        if (animal.equals(animal2)) {
            System.out.println("igualitos los animalitos");
        } else {
            System.out.println("distintos.");
        }

        animal2.setName("Draco");
        animal2.setAge(5);

        System.out.println("El primer animal se llama: " + animal.getName() + " y tiene " + animal.getAge() + " años.");
        System.out.println("El segundo animal se llama: " + animal2.getName() + " y tiene " + animal2.getAge() + " años.");
        System.out.print ("Por tanto son ");
        if (animal.equals(animal2)) {
            System.out.println("igualitos los animalitos");
        } else {
            System.out.println("distintos.");
        }

        System.out.println("Se han registrado " + animal.getAnimalsCounter() + " animalitos");

        // Prueba de constructor copia
        Animal animal3 = new Animal(animal);
        System.out.println("El tercer animal se llama: " + animal3.getName() + " y tiene " + animal3.getAge() + " años.");
        System.out.println("Se han registrado " + animal.getAnimalsCounter() + " animalitos");

        //Prueba de las subclases de Animal: Dog y Cat
        Dog dog = new Dog("Haku", 4, "Pastor Alemán");
        Cat cat = new Cat("Mau", 3);

        System.out.println("Soy un perro llamado " + dog.getName() + " y tengo " + dog.getAge() + " años, además soy de raza " + dog.getRace());
        System.out.println("Soy un gato llamado " + cat.getName() + " y tengo " + cat.getAge() + " años, me quedan " + cat.getLives() + " vidas");
        System.out.println();

        dog.setAge(5);
        dog.setRace("German Shepherd");
        cat.subtractLives();
        cat.subtractLives();

        System.out.println("Soy un perro llamado " + dog.getName() + " y tengo " + dog.getAge() + " años, además soy de raza " + dog.getRace());
        System.out.println("Soy un gato llamado " + cat.getName() + " y tengo " + cat.getAge() + "años, me quedan " + cat.getLives() + " vidas");

        System.out.println("Se han registrado " + cat.getAnimalsCounter() + " animalitos");
    }
}

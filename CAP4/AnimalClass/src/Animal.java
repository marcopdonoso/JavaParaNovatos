public class Animal {
    protected String name;
    protected int age;
    protected static int animalsCounter = 0;

    public Animal (String name, int age) {
        this.name = name;
        this.age = age;
        animalsCounter++;
    }

    // Constructor copia
    public Animal (Animal animal) {
        this.name = animal.getName();
        this.age = animal.getAge();
        animalsCounter++;
    }

    public Animal clone () {
        return new Animal(this.name, this.age);
    }

    public boolean equals (Animal a) {
        return (this.name.equals(a.getName()) && this.age == a.getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAnimalsCounter() {
        return animalsCounter;
    }
}

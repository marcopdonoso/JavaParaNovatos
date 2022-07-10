public class Dog extends Animal{
    protected String race;

    public Dog(String name, int age, String race) {
        super(name, age);
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}

public class Cat extends Animal{
    protected int lives = 7;

    public Cat(String name, int age) {
        super(name, age);
    }

    public int getLives() {
        return lives;
    }

    public void subtractLives() {
        lives--;
    }
}

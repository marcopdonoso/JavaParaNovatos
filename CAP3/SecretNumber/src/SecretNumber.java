public class SecretNumber {
    int secretNumber;

    public void secretNumberGen() {
        secretNumber = (int) Math.ceil(Math.random() * 100);
    }

    public String comparator(int userNumber) {
        if (secretNumber < userNumber) {
            return "Mi numero es Menor :(";
        } else if (secretNumber > userNumber) {
            return "Mi numero es Mayor :(";
        } else {
            return "ACERTASTE!!! :)";
        }
    }
}

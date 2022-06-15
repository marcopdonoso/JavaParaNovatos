public class Persona {
    private String name;
    private String lastname;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        String gen = "";
        if (gender == 'M') gen = "Hombre";
        if (gender == 'F') gen = "Mujer";
        if (gender != 'M' && gender != 'F') gen = "Unknown";
        return gen;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

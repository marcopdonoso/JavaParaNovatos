public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setName("Wilfor");
        professor.setSalary(1000);

        Rector rector = new Rector();
        rector.setName("Marc");
        rector.setSalary(1000);

        System.out.println("Nombre profesor: " + professor.getName() + " Salario profesor: " + professor.getSalary());
        System.out.println("Nombre rector: " + rector.getName() + " Salario rector: " + rector.getSalary());

    }
}

public class ChristmasDance {
    static Student[] hogwarts;
    static Student[] beauxbatons;
    static Student[] durmstrang;

    static int[] selectedHogwarts;
    static int[] selectedBeauxbatons;
    static int[] selectedDurmstrang;

    static final int STUDENTS_NUMBER = 20;
    static final int COUPLES_NUMBER = STUDENTS_NUMBER + STUDENTS_NUMBER / 2;

    public static void main(String[] args) {
        createStudentsList();
        Student[][] couplesList = randomCouples();
        showCouplesList(couplesList);
    }

    public static void showCouplesList(Student[][] couplesList) {
        for (int i = 0; i < COUPLES_NUMBER; i++) {
            System.out.printf("Pareja %2d: ", i + 1);
            System.out.printf("%s (%s) (%c) - %s (%s) (%c)\n", couplesList[i][0].getName(),couplesList[i][0].getSchool(),couplesList[i][0].getGender(),couplesList[i][1].getName(),couplesList[i][1].getSchool(),couplesList[i][1].getGender());
        }
    }

    public static Student[][] randomCouples() {
        Student[][] couplesList = new Student[COUPLES_NUMBER][2];
        String school = "Hogwarts";
        char gender = 'M';
        int j = 0;
        for (int i = 0; i < COUPLES_NUMBER; i++) {
            couplesList[i][j] = selectStudent(school, gender);
            if (school.equals("Hogwarts")) {
                school = "Beauxbatons";
            } else if (school.equals("Beauxbatons")) {
                school = "Durmstrang";
            } else {
                school = "Hogwarts";
            }
            if (gender == 'M') {
                gender = 'F';
                j = 1;
                i--;
            } else {
                gender = 'M';
                j = 0;
            }
        }
        return couplesList;
    }

    public static Student selectStudent(String school, char gender) {
        int n;
        boolean valid;
        Student student = null;
        do {
            valid = true;
            n = (int) (Math.random() * STUDENTS_NUMBER);
            if (school.equals("Hogwarts")) {
                if (hogwarts[n].getGender() != gender || selectedHogwarts[n] == 1){
                    valid = false;
                } else {
                    student = hogwarts[n];
                    selectedHogwarts[n] = 1;
                }
            }
            if (school.equals("Beauxbatons")) {
                if (beauxbatons[n].getGender() != gender || selectedBeauxbatons[n] == 1){
                    valid = false;
                } else {
                    student = beauxbatons[n];
                    selectedBeauxbatons[n] = 1;
                }
            }
            if (school.equals("Durmstrang")) {
                if (durmstrang[n].getGender() != gender || selectedDurmstrang[n] == 1){
                    valid = false;
                } else {
                    student = durmstrang[n];
                    selectedDurmstrang[n] = 1;
                }
            }
        } while (!valid);
        return student;
    }

    public static void createStudentsList() {
        hogwarts = new Student[STUDENTS_NUMBER];
        beauxbatons = new Student[STUDENTS_NUMBER];
        durmstrang = new Student[STUDENTS_NUMBER];

        selectedHogwarts = new int[STUDENTS_NUMBER];
        selectedBeauxbatons = new int[STUDENTS_NUMBER];
        selectedDurmstrang = new int[STUDENTS_NUMBER];

        // Hogwarts
        hogwarts[0] = new Student("Harry Potter", 'M', "Hogwarts");
        hogwarts[1] = new Student("Ron Weasley", 'M', "Hogwarts");
        hogwarts[2] = new Student("Leville Longbottom", 'M', "Hogwarts");
        hogwarts[3] = new Student("Fred Weasley", 'M', "Hogwarts");
        hogwarts[4] = new Student("George Weasley", 'M', "Hogwarts");
        hogwarts[5] = new Student("Draco Malfoy", 'M', "Hogwarts");
        hogwarts[6] = new Student("Seamus Finnigan", 'M', "Hogwarts");
        hogwarts[7] = new Student("Dean Thomas", 'M', "Hogwarts");
        hogwarts[8] = new Student("Lee Jordan", 'M', "Hogwarts");
        hogwarts[9] = new Student("Cedric Diggory", 'M', "Hogwarts");

        hogwarts[10] = new Student("Hermione Granger",'F',"Hogwarts");
        hogwarts[11] = new Student("Ginny Weasley",'F',"Hogwarts");
        hogwarts[12] = new Student("Luna Lovegood",'F',"Hogwarts");
        hogwarts[13] = new Student("Lavender Brown",'F',"Hogwarts");
        hogwarts[14] = new Student("Parvati Patil",'F',"Hogwarts");
        hogwarts[15] = new Student("Hanna Abbot",'F',"Hogwarts");
        hogwarts[16] = new Student("Angelina Johnson",'F',"Hogwarts");
        hogwarts[17] = new Student("Pansy Parkinson",'F',"Hogwarts");
        hogwarts[18] = new Student("Katie Bell",'F',"Hogwarts");
        hogwarts[19] = new Student("Cho Chang",'F',"Hogwarts");

        // Beauxbatons
        beauxbatons[0] = new Student("Damien Bordeau", 'M', "Beauxbatons");
        beauxbatons[1] = new Student("Didier Girardon", 'M', "Beauxbatons");
        beauxbatons[2] = new Student("Edouard Pinaud", 'M', "Beauxbatons");
        beauxbatons[3] = new Student("Fabien Rouseau", 'M', "Beauxbatons");
        beauxbatons[4] = new Student("François Eluchans", 'M', "Beauxbatons");
        beauxbatons[5] = new Student("Gabriel Lombard", 'M', "Beauxbatons");
        beauxbatons[6] = new Student("Gaston Abbadie", 'M', "Beauxbatons");
        beauxbatons[7] = new Student("Adolph Barraud", 'M', "Beauxbatons");
        beauxbatons[8] = new Student("Bastian Briand", 'M', "Beauxbatons");
        beauxbatons[9] = new Student("Colin Camus", 'M', "Beauxbatons");

        beauxbatons[10] = new Student("Fleur Delacour",'F',"Beauxbatons");
        beauxbatons[11] = new Student("Catherine Leduc",'F',"Beauxbatons");
        beauxbatons[12] = new Student("Audrey Vien",'F',"Beauxbatons");
        beauxbatons[13] = new Student("Bérénice Dugès",'F',"Beauxbatons");
        beauxbatons[14] = new Student("Laure Champollion",'F',"Beauxbatons");
        beauxbatons[15] = new Student("Léonore Chifflet",'F',"Beauxbatons");
        beauxbatons[16] = new Student("Lucette Toussaint",'F',"Beauxbatons");
        beauxbatons[17] = new Student("Magadlène Lemond",'F',"Beauxbatons");
        beauxbatons[18] = new Student("Nélie Levallois",'F',"Beauxbatons");
        beauxbatons[19] = new Student("Nicole Fontaine",'F',"Beauxbatons");

        // Durmstrang
        durmstrang[0] = new Student("Viktor Krum", 'M', "Durmstrang");
        durmstrang[1] = new Student("Andrei Voyanov", 'M', "Durmstrang");
        durmstrang[2] = new Student("Anton Chilikov", 'M', "Durmstrang");
        durmstrang[3] = new Student("Boris Andreev", 'M', "Durmstrang");
        durmstrang[4] = new Student("Damyan Mihov", 'M', "Durmstrang");
        durmstrang[5] = new Student("Dragomir Nikolaev", 'M', "Durmstrang");
        durmstrang[6] = new Student("Emil Petrov", 'M', "Durmstrang");
        durmstrang[7] = new Student("Georgi Maksimov", 'M', "Durmstrang");
        durmstrang[8] = new Student("Milen Ivov", 'M', "Durmstrang");
        durmstrang[9] = new Student("Pavel Kaloyanchev", 'M', "Durmstrang");

        durmstrang[10] = new Student("Anka Lazarov",'F',"Durmstrang");
        durmstrang[11] = new Student("Dana Marinov",'F',"Durmstrang");
        durmstrang[12] = new Student("Donka Minkov",'F',"Durmstrang");
        durmstrang[13] = new Student("Emiliya Hristov",'F',"Durmstrang");
        durmstrang[14] = new Student("Irina Vanev",'F',"Durmstrang");
        durmstrang[15] = new Student("Ivana Viktorov",'F',"Durmstrang");
        durmstrang[16] = new Student("Katerina Vasilev",'F',"Durmstrang");
        durmstrang[17] = new Student("Nevelka Popov",'F',"Durmstrang");
        durmstrang[18] = new Student("Nikol Zahariev",'F',"Durmstrang");
        durmstrang[19] = new Student("Olga Vodenicharov",'F',"Durmstrang");

        for (int i = 0; i < STUDENTS_NUMBER; i++) {
            selectedHogwarts[i] = 0;
            selectedBeauxbatons[i] = 0;
            selectedDurmstrang[i] = 0;
        }

    }


}

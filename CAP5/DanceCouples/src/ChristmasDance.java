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
        hogwarts[20] = new Student("Damien Bordeau", 'M', "Beauxbatons");
        hogwarts[21] = new Student("Didier Girardon", 'M', "Beauxbatons");
        hogwarts[22] = new Student("Edouard Pinaud", 'M', "Beauxbatons");
        hogwarts[23] = new Student("Fabien Rouseau", 'M', "Beauxbatons");
        hogwarts[24] = new Student("François Eluchans", 'M', "Beauxbatons");
        hogwarts[25] = new Student("Gabriel Lombard", 'M', "Beauxbatons");
        hogwarts[26] = new Student("Gaston Abbadie", 'M', "Beauxbatons");
        hogwarts[27] = new Student("Adolph Barraud", 'M', "Beauxbatons");
        hogwarts[28] = new Student("Bastian Briand", 'M', "Beauxbatons");
        hogwarts[29] = new Student("Colin Camus", 'M', "Beauxbatons");

        hogwarts[30] = new Student("Fleur Delacour",'F',"Beauxbatons");
        hogwarts[31] = new Student("Catherine Leduc",'F',"Beauxbatons");
        hogwarts[32] = new Student("Audrey Vien",'F',"Beauxbatons");
        hogwarts[33] = new Student("Bérénice Dugès",'F',"Beauxbatons");
        hogwarts[34] = new Student("Laure Champollion",'F',"Beauxbatons");
        hogwarts[35] = new Student("Léonore Chifflet",'F',"Beauxbatons");
        hogwarts[36] = new Student("Lucette Toussaint",'F',"Beauxbatons");
        hogwarts[37] = new Student("Magadlène Lemond",'F',"Beauxbatons");
        hogwarts[38] = new Student("Nélie Levallois",'F',"Beauxbatons");
        hogwarts[39] = new Student("Nicole Fontaine",'F',"Beauxbatons");

        // Durmstrang
        hogwarts[40] = new Student("Viktor Krum", 'M', "Durmstrang");
        hogwarts[41] = new Student("Andrei Voyanov", 'M', "Durmstrang");
        hogwarts[42] = new Student("Anton Chilikov", 'M', "Durmstrang");
        hogwarts[43] = new Student("Boris Andreev", 'M', "Durmstrang");
        hogwarts[44] = new Student("Damyan Mihov", 'M', "Durmstrang");
        hogwarts[45] = new Student("Dragomir Nikolaev", 'M', "Durmstrang");
        hogwarts[46] = new Student("Emil Petrov", 'M', "Durmstrang");
        hogwarts[47] = new Student("Georgi Maksimov", 'M', "Durmstrang");
        hogwarts[48] = new Student("Milen Ivov", 'M', "Durmstrang");
        hogwarts[49] = new Student("Pavel Kaloyanchev", 'M', "Durmstrang");

        hogwarts[50] = new Student("Anka Lazarov",'F',"Durmstrang");
        hogwarts[51] = new Student("Dana Marinov",'F',"Durmstrang");
        hogwarts[52] = new Student("Donka Minkov",'F',"Durmstrang");
        hogwarts[53] = new Student("Emiliya Hristov",'F',"Durmstrang");
        hogwarts[54] = new Student("Irina Vanev",'F',"Durmstrang");
        hogwarts[55] = new Student("Ivana Viktorov",'F',"Durmstrang");
        hogwarts[56] = new Student("Katerina Vasilev",'F',"Durmstrang");
        hogwarts[57] = new Student("Nevelka Popov",'F',"Durmstrang");
        hogwarts[58] = new Student("Nikol Zahariev",'F',"Durmstrang");
        hogwarts[59] = new Student("Olga Vodenicharov",'F',"Durmstrang");

        for (int i = 0; i < STUDENTS_NUMBER; i++) {
            selectedHogwarts[i] = 0;
            selectedBeauxbatons[i] = 0;
            selectedDurmstrang[i] = 0;
        }

    }

    
}

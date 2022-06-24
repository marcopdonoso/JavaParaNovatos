public class StarDrawing {
    private int j;

    public void triangle() {
        j = 1;
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < ((7 - j) / 2); k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < j; k++) {
                System.out.print("*");
            }
            System.out.println();
            j+=2;
        }
    }

    public void diamond() {
        j = 1;
        for (int i = 0; i < 7; i++) {
            for (int k = 0; k < ((7 - j) / 2); k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < j; k++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < 3) {
                j+=2;
            } else {
                j-=2;
            }
        }
    }

    public void emptyDiamond() {
        j = 1;
        for (int i = 0; i < 7; i++) {
            for (int k = 0; k < ((7 - j) / 2); k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < j; k++) {
                if (k == 0 || k == (j-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (i < 3) {
                j+=2;
            } else {
                j-=2;
            }
        }
    }

    public void christmasTree() {
        for (int l = 0; l < 3; l++) {
            j = 1;
            for (int i = 0; i < (2 + (int)((l * 5) / 2)); i++) {
                for (int k = 0; k < ((13 - j) / 2); k++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < j; k++) {
                    System.out.print("*");
                }
                System.out.println();
                j+=2;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 5; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 3; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

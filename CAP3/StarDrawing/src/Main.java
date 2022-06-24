public class Main {
    public static void main(String[] args) {
        /*
        StarDrawing starDrawing = new StarDrawing();
        starDrawing.triangle();
        System.out.println();
        starDrawing.diamond();
        System.out.println();
        starDrawing.emptyDiamond();
        System.out.println();
        starDrawing.christmasTree();*/

        System.out.println("Triángulo altura: 4");
        StarForms starForms = new StarForms();
        starForms.triangle(4,'*',false,false,0);

        System.out.println("Rombo altura: 7");
        starForms.triangle(4,'*',false,false,0);
        starForms.triangle(3,'*',true,false,1);

        System.out.println("Rombo vacio, altura 7");
        starForms.triangle(4,'*',false,true,0);
        starForms.triangle(3,'*',true,true,1);

        System.out.println("Arbolito de Navidad");
        starForms.triangle(2,'*',false,false,5);
        starForms.triangle(4,'*',false,false,3);
        starForms.triangle(7,'*',false,false,0);
        starForms.rectangle(4,3,'*',false,5);

    }
}

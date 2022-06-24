public class StarForms {
    /**
     * Dibuja formas básicas con cualquier caracter del teclado.
     * (Primer uso de comentarios en formato Javadoc)
     */

    private void printChar(char character, int times, boolean empty) {
        /**
         * Imprime caracteres en forma lineal
         * @param character Caracter utilizado para dibujar en pantalla
         * @param times Veces que se repite el caracter
         * @param empty Difine si el dibujo tiene relleno o es hueco
         */
        for (int i = 0; i < times; i++) {
            if (empty == false) {
                System.out.print(character);
            } else {
                // Si el dibujo es hueco, entonces solamente imprime el caracter seleccionado al inicio y al final de la linea
                if (i == 0 || i == times - 1) {
                    System.out.print(character);
                } else {
                    System.out.print(' ');
                }
            }

        }
    }

    public void triangle(int height, char character, boolean inverted, boolean empty, int offset) {
        /**
         * Dibuja un triángulo en pantalla
         * @param height Altura del triángulo
         * @param character Caracter utilizado para dibujar en pantalla
         * @param inverted Indicar si el triángulo está invertido o no
         * @param empty Define si el dibujo tiene relleno o es hueco
         * @param offset Añade espacios a la izquierd para mover el dibujo hacia la derecha
         */
        int spacing;
        int drawing = 0;

        if (!inverted) {
            spacing = height - 1 + offset;
            drawing = 1;
        } else {
            spacing = offset;
            drawing = (height * 2) - 1;
        }
        for (int i = 0; i < height; i++) {
            printChar(' ', spacing, false);
            printChar(character, drawing, empty);
            if (!inverted) {
                spacing--;
                drawing += 2;
            } else {
                spacing++;
                drawing -= 2;
            }
            System.out.println();
        }
    }

    public void rectangle(int height, int width, char character, boolean empty, int offset) {
        /**
         * Dibuja un rectángulo en pantalla
         * @param height Altura del rectángulo
         * @param width Ancho del rectángulo
         * @param character Caracter utilizado para dibujar en pantalla
         * @param empty Define si el dibujo tiene relleno o es hueco
         * @param offset Añade espacios a la izquierd para mover el dibujo hacia la derecha
         */
        for (int i = 0; i < height; i++) {
            printChar(' ',offset,false);
            printChar(character, width,empty);
            System.out.println();
        }
    }
}

public class TestRestaurante {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante(1,2);

        System.out.println("Stock Huevos: " + restaurante.getEggs() + " unidades" + ", Stock Chorizos: " + restaurante.getSausage() + " gramos");
        System.out.println("Stock Número de platos completos: " + restaurante.getNumPlates());

        restaurante.addEggs(2);
        restaurante.addSausages(1);

        System.out.println("Stock Huevos: " + restaurante.getEggs() + " unidades" + ", Stock Chorizos: " + restaurante.getSausage() + " gramos");
        System.out.println("Stock Número de platos completos: " + restaurante.getNumPlates());

        restaurante.plateServe();

        System.out.println("Stock Huevos: " + restaurante.getEggs() + " unidades" + ", Stock Chorizos: " + restaurante.getSausage() + " gramos");
        System.out.println("Stock Número de platos completos: " + restaurante.getNumPlates());



    }
}

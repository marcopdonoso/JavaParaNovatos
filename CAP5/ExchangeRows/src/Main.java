public class Main {
    public static void main(String[] args) {
        ExchangeRows exchangeRows = new ExchangeRows();

        exchangeRows.fillMatrix();
        exchangeRows.printMatrix();
        System.out.println();

        System.out.println("INTERCAMBIANDO FILAS");
        exchangeRows.exchangeRows(2,3);
        exchangeRows.printMatrix();
    }
}

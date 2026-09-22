public class SalesTax {
    static void main() {
        double purchaseprice = 23.50;
        double salesTax = 0;
        double total = 0;
        final double  Rate =.05;
        salesTax = Rate * purchaseprice;

        total = salesTax + purchaseprice;
        IO.println ("The total is " + total + " and the tax is " + salesTax);
    }
}

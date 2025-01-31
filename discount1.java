@author:DAVID MUCHIRI 
ADM :CT101/G/19119/23.
CS Y2 S2
@VERSION 1.0.1
DATE : 1/19/2025
6:40 PM
*/

/*Program that calculate discount according to the value
 assigned to the price variable. The program uses functions
  where the function is called in the main function. */
public class discount1 {
    public static double getDiscount(double price) {
        double discount = 0;

        if (price > 5000) {
            discount = 0.1 * price;
        } else if (price >= 1000 && price <= 5000) {
            discount = 0.05 * price;
        } else {
            discount = 0;
        }
        return discount;
    }
/*main function that outputs the calculated discount
 according to the value assigned to variable price */
    public static void main(String[] args) {
        double price = 10000;
        double discount = getDiscount(price);
        System.out.println("Discount is: " + discount);
    }
}

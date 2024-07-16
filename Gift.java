
import java.util.Scanner;

public class Gift {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product code");

        char product_code = sc.next().charAt(0);
        System.out.println("Enter the quantity of code");
        int Quantity = sc.nextInt();
        System.out.println("Enter the rate of one piece of product ");
        int product_rate = sc.nextInt();
        int purchase_amount = product_rate * Quantity;
        System.out.println("purchase ammount is: " + purchase_amount);
        if (200 < purchase_amount && purchase_amount < 700) {
            System.out.println("A key Chain");
        } else if (700 < purchase_amount && 1200 > purchase_amount) {
            System.out.println("A carry bag");
        } else {
            System.out.println("a electronic calculator");

        }
        sc.close();
    }

}


import java.util.Scanner;

public class item {
    public static void main(String[] args) {
        System.out.println("Item Price (considering tax, discount, shipping)\n\n" );
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Item price: ");
        double price=sc.nextDouble();
        System.out.print("Enter the tax_percent : ");
        double tax_percent=sc.nextDouble();
        double total_tax= (tax_percent/100)*price;
        System.out.print("total_tax is: "+total_tax);
        System.out.println();
        System.out.print("enter the percent_discount in this product: ");
        double percent_discount=sc.nextDouble();
        double total_discount=(percent_discount/100)*price;
        System.out.println("total discount price is: "+total_discount);
        System.out.println(" enter the shipping charges: ");
        double shipping=sc.nextDouble();
        double total_item_price=(price+total_tax-total_discount+shipping);
        System.out.println("total_item_price is: "+total_item_price);
        System.out.println(price+"item price me"+total_tax+"mila ke"+total_discount+"discount hta ke"+shipping+"charges add krke total item price nikla"+total_item_price);
 }



    
}


import java.util.Scanner;

public class tip {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the price: ");
        double price=sc.nextDouble();
        System.out.print("enter the tip percent: ");
        double tip=sc.nextDouble();
        double total_tip=(tip/100)*price;
        System.out.println("total tip is: "+total_tip);
       double total_price=price+total_tip;
       System.out.println("total_price is"+total_price);


    }
}

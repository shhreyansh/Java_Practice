
import java.util.Scanner;



public class shopkeeper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the printed price of the phone : ");
        int printed_price=sc.nextInt();
        double discount=(10/100.0)*printed_price;
        System.out.println("discounted price: "+discount);
        double original_price=printed_price-discount;
System.out.println("original_price with 10% discount: "+original_price);
double gst=(9/100.0)*original_price;
System.out.println(" Gst of 9%: " +gst);
double Customer_paying=original_price+gst;
System.out.println("Total Ammount Customer Pays With 9% Gst: " +Customer_paying);
    }
    
}


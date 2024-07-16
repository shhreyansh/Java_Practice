
import java.util.Scanner;



public class Price {
    public static void main(String[] args) {
        System.out.println("12% discount");
        Scanner sc=new Scanner(System.in);
        
        
        
        System.out.println("Enter the price");
        Double Price=sc.nextDouble();
        System.out.println("Enter the Quantity");
        Double Quantity=sc.nextDouble();

        Double Total=Quantity*Price;
        System.out.println("Total amount before discount "+Total);
        Double discount=(12/100.0)*Total;
        System.out.println("discount price is "+discount);
        double Netcost=Total-discount;
        System.out.println("total me  12% discount krke netcost nikla "+Netcost);


        
        

    }
    
}

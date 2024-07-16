
import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the indian currency ");
        double currency=sc.nextInt();
        double dollar=currency/83;
        System.out.println("Dollar rate is: "+dollar);
        double euro=currency/91.08;
        System.out.println("euro rate is: "+euro);
        double pakistani_rupee=currency/0.30;
        System.out.println("pakistani_rupee"+pakistani_rupee);
        double yen=currency/0.53;
        System.out.println("yen rate is: "+yen);
        double dinar=currency/273.40;
        System.out.println("dinar rate is: "+dinar);
        double won=currency/0.060;
        System.out.println("won rate is: "+won);


    }
    
}

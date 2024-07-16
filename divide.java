
import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        System.out.println("find the quotient and remainder");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number");
        double dividend=sc.nextDouble();
        double x=dividend/6;
        
        
        Double Quotient=dividend/6;
        System.out.println("Quotient is "+Quotient);
        Double remainder= dividend%6;
        System.out.println("remainder is"+remainder);
    }
    
}

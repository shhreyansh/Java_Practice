
import java.util.Scanner;

public class loan_emi {
    public static void main(String[] args) {
        System.out.print("loan emi calculator: \n\n");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the loan Ammount: ");
        double ammount=sc.nextDouble();
        System.out.print("Enter the time period months: ");
        double months=sc.nextDouble();
        double loan_emi=ammount/months;
        System.out.println("Emi of one month is: "+loan_emi);

        
    }
}

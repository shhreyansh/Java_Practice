
import java.util.Scanner;

public class fix_deposit {
    public static void main(String[] args) {
        System.out.println("fixed deposit return calculator\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the principle ammount deposited by customer: " );
        double principle_ammount=sc.nextDouble();
        System.out.print("Enter the rate of fd interest: ");
        double rate=sc.nextDouble();
        System.out.print("Enter the time of fd in years: ");
        double time=sc.nextDouble();
        double interest=(principle_ammount*rate* time)/100.0;
        System.out.println("the interest of the fd is: "+interest);
System.out.println();
double total_ammount=principle_ammount+interest;
System.out.print("total ammount of the fd is: "+total_ammount);


    }
    
}

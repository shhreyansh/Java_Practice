
import java.util.Scanner;

public class interestcalc {
    public static void main(String[] args) {
        System.out.println("interest calculator");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the principle ammount: ");
        double principle_ammount=sc.nextDouble();
        System.out.print("enter the rate of interest: ");
        double rate=sc.nextDouble();
        System.out.print("enter the time: ");
        double time=sc.nextDouble();
        System.out.println();

double interest=(principle_ammount*rate*time)/100.0;
System.out.println("interest is: "+interest);
System.out.println(principle_ammount+" principle ammount me: "+rate+ " percent interest lga ke: " +time+"saal  ke liye toh final interest ho gya hai"+interest);
    
}
}
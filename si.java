import java.util.Scanner;
public class si {
    public static void main(String[]args){
        System.out.println("Simple Interest \n\n\n");
        Scanner sc=new Scanner(System.in);
System.out.print("Enter the Principle_amount:" );
double Principle=sc.nextDouble();
System.out.print("Enter the Rate:" );
double Rate=sc.nextDouble();
System.out.print("Enter the Time:");
double Time=sc.nextDouble();
System.out.println();
double si= (Principle*Rate*Time/100);
System.out.println("the simple interest is ="+si);
    }
    
}

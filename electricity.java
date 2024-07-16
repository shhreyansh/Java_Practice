
import java.util.Scanner;

public class electricity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the consumer number ");
        int consumer=sc.nextInt();
        System.out.println("Enter the number of unit consumed");
        int unit=sc.nextInt();
        if(unit<=200){
            System.out.println("toh apko meter rent 500 dena hai");
        }
        else if(201<unit && 400>unit){
            int total=unit*1+500;
            System.out.println("total bill is: "+total);
        }
        else if(401<unit && 600>unit)
        {
            double total=unit*1.55+500;
            System.out.println("total bill is: "+total);
        }
        
else{
    double total=unit*2.10+500;
    System.out.println("toh apko itna pay krna hai "+total );
}
    }
}

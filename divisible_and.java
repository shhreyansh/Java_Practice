
import java.util.Scanner;


public class divisible_and {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("enter the number: ");
    int number=sc.nextInt();
    if((number%2==0) && (number%3==0))
    {
        System.out.println(" it is divisible");
    }
    else
    {
        System.out.println("not divisible");

    }


}
    
}

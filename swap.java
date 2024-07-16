
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        System.out.println("Swapp the Number");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the A");
        int A=sc.nextInt();
        System.out.println("Enter the B ");
        int B=sc.nextInt();
    System.out.println("Before swapping A: "+A);
    System.out.println("");
    System.out.println("Before swapping B: "+B);
         A=A+B;
         B=A-B;
         A=A-B; 
         System.out.println("");
System.out.println("After swapping A: "+A);
System.out.println("");
System.out.println("After swapping b: "+B);
    }
    
}

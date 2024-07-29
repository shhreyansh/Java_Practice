
import java.util.Scanner;

public class pass_fail {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         System.out.print("enter the marks: ");
         int marks=sc.nextInt();
         if(marks>=40){
            System.out.println("Ap pass ho gye");
         }
         else{
            System.out.println("ap fail ho gye");
         }
    }
}

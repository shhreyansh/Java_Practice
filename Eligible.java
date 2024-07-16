
import java.util.Scanner;

public class Eligible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age");
        int x=sc.nextInt();
        if(18<=x){
            System.out.println("You are eligible to vote");
        }
        else{
System.out.println("you are not eligible to vote" );
        }

    }
}

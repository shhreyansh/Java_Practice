
import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in kilometer");
        int kilometer=sc.nextInt();
        System.out.println("kilometer is: "+kilometer);
        double miles=kilometer*0.621371;
        System.out.println("miles: "+miles);

    }
    
}


import java.util.Scanner;

public class driving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        if(age>18){
            System.out.println("eligible to drive the car");
        }
        else
        {
            System.out.println("not eligible");
        }
    }
    
}

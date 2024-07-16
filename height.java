
import java.util.Scanner;

public class height {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the height in cm: ");
        int cm=sc.nextInt();
        int m=cm/100;
        System.out.println("after converting cm to m: "+m);
        double inch=cm*0.393701;
        System.out.println("after converting cm to inch: "+inch);
        double feet=cm*0.0328;
        System.out.println("after converting cm to feet: "+feet);
    }
    
}

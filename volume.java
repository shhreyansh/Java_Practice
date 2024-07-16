
import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the volume in ltr: ");
        int ltr=sc.nextInt();
        double gallons=ltr*3.78541;
        System.out.println("Gallons: "+gallons);

    }
}

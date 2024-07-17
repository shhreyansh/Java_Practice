
import java.util.Scanner;

public class right_triangle {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st side: ");
        double a=sc.nextDouble();
        System.out.println("first side of triangle is:"+a);
        
System.out.println("enter the second side of triangle: ");
        double b=sc.nextDouble();
        System.out.println("second side of a triangle is: "+b);

        double c=Math.sqrt((a*a)+(b*b));
        System.out.println("third side of a triangle is: "+c);


    }
    
}


import java.util.Scanner;

public class perimeter_rect {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length ");
        double length=sc.nextDouble();
        System.out.println("Enter the breadth");
        double breadth=sc.nextDouble();
        double perimeter_of_rectangle=2*(length+breadth);
        System.out.println("perimeter of a rectangle is: "+perimeter_of_rectangle);
    }
    
}

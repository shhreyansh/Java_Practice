
import java.util.Scanner;

public class area_square {
    public static void main(String[] args) {
        System.out.println("area of square\n\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sides of a square");
        double side=sc.nextDouble();
        double area=4*side;
        System.out.println("area of square is: "+area);

    }
    
}

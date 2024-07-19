import java.util.Scanner;

public class area_of_ring {
     public static void main(String[] args) 
  {


        System.out.println("area of Ring\n\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius");
        double radius=sc.nextDouble();
        double pi=3.14;
        System.out.println("Enter the height ");
        double height=sc.nextDouble();
        double area_of_Ring =pi*radius*radius*height;
        System.out.println("area of Ring is: "+area_of_Ring);
    }
    
}
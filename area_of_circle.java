import java.util.Scanner;

public class area_of_circle {
     public static void main(String[] args) 
  {


        System.out.println("area of circle");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius");
        double radius=sc.nextDouble();
        double pi=3.14;
        double area_of_circle =pi*radius*radius;
        System.out.println("area of circle is: "+area_of_circle);
    }
    
}

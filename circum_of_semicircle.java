import java.util.Scanner;

public class circum_of_semicircle {
     public static void main(String[] args) 
  {


        System.out.println("circumference of semi circle");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius");
        double radius=sc.nextDouble();
        double pi=3.14;
        double circumference_of_semi_circle =radius*(pi+2);
        System.out.println("Circumference of semicircle is "+circumference_of_semi_circle);
    }
    
}
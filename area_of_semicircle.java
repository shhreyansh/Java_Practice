
    import java.util.Scanner;

public class area_of_semicircle {
     public static void main(String[] args) 
  {


        System.out.println("Area of semi circle");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius");
        double radius=sc.nextDouble();
        double pi=3.14;
        double Area_of_semi_circle =pi*(radius*radius)/2;
        System.out.println("Area of semicircle is "+Area_of_semi_circle);
    }
    
}
    


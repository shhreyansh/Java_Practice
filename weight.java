
import java.util.Scanner;

public class weight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight of product in grams");
        int gram=sc.nextInt();
      int  kilogram=gram/1000;
      System.out.println("kilogram is: "+kilogram);
      double pound=gram*0.00220462;
      System.out.println("Pound is: "+pound);
    }
    
}

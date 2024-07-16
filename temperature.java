
import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in celsius");
        double celsius=sc.nextInt();
        double Fahrenheit=(celsius*(9/5.0))+32;
        System.out.println("after converting celsius to fahrenhiet: "+Fahrenheit);
    }
}

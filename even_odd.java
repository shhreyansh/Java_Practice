
import java.util.Scanner;


public class even_odd {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number: ");
    int number=sc.nextInt();
    if(number%2==0){
        System.out.println("It is Even");
    }
    else{
        System.out.println("It is Odd");
    }
}
    
}
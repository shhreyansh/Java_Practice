
import java.util.Scanner;

public class divisible_by_or {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number: ");
          int number= sc.nextInt();

 if(number%2==0||number%3==0){
    System.out.println("the number is divisible by 2 and 3");
 }
 else{
    System.out.println("the number is not divisible");
 }
 
        }
    
}


import java.util.Scanner;

public class about {
    public static void main(String[] args) {
        System.out.println("About students \n\n\n");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name=sc.nextLine();
        System.out.print("Enter your father's name: ");
        String Fathers_name=sc.nextLine();
        System.out.print("Enter your Mother's name: ");
        String Mothers_name=sc.nextLine();
        System.out.print("Enter your Age: ");
        String Age=sc.nextLine();
        System.out.print("Enter your Hobbies : ");
        String Hobbies=sc.nextLine();
        System.out.println();
        System.out.println();
        System.out.println("Your name is :" +name);
        System.out.println("Your fathers_name is : " +Fathers_name);
        System.out.println("Your Mothers_name is: " +Mothers_name);
        System.out.println("Your age is: "+Age);
        System.out.println("Your hobbies is: "+Hobbies);
    }
}
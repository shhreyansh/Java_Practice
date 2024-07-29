
import java.util.Scanner;

public class loopfact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int fact_num=sc.nextInt();
        System.out.println();
        int i=1;
        for(i=1;i<=fact_num;i=i+1){
            if(fact_num%i==0){
                System.out.println(i);
            }
        }
    }
}

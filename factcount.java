
import java.util.Scanner;

public class factcount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int fact_num = sc.nextInt();
        System.out.println();

        int factors_count = 0;

        for (int i = 1; i <= fact_num; i++) {
            if (fact_num % i == 0) {
                System.out.println(i);
                factors_count += 1;
            }
        }
        if(factors_count==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime");
        }


    }
}

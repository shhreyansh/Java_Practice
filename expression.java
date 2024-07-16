
import java.util.Scanner;



public class expression {
    public static void main(String[] args) {
        System.out.println("Solve the equation\n\n");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Y : ");
        int Y=sc.nextInt();
        System.out.print("Enter the A : ");

        int A=sc.nextInt();
        System.out.print("Enter x :  ");

int x=sc.nextInt();
System.out.print("Enter the b : ");

int B=sc.nextInt();
System.out.print("Enter the c: ");

    int C=sc.nextInt();
    int zz=(A*x*2)+(B*x)+C;
    System.out.println("print the solution: "+zz);
if(Y==zz){
    System.out.println("solution is same");
}
else{
    System.out.println("not same solution");
}

}
    
}

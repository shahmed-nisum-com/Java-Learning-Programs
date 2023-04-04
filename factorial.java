import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter number on which you want factorial!");
        int a=in.nextInt();
        int fact=1;
        for (int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+a+" is "+fact);
    }
}

import java.util.Scanner;

public class Example22 {
    public static void main(String[] args) {

        int n;
        Scanner input=new Scanner(System.in);
        while (true){
            System.out.println("Enter a number");
            n=input.nextInt();

            if(n!=0){
                System.out.println("You entered "+n);
                continue;
            }
            else {
                break;
            }
        }
    }
}

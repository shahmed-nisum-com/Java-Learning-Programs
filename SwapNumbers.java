import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        int x,y,temp;

        System.out.println("Enter value in x and y");
        Scanner in=new Scanner(System.in);

        x=in.nextInt();
        y=in.nextInt();

        System.out.println("Before swapping x and y");

        temp=x;
        x=y;
        y=temp;
        System.out.println("After swapping x and y");
    }
}

import java.util.Scanner;

public class marksheet {
    public static void main(String[] args) {
        int passMarks=40;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter marks to enter");
        int obtainMarks=in.nextInt();
        if (obtainMarks>40){
            System.out.println("You are passed!!!");
        }
        else {
            System.out.println("You are failed!!!");
        }
    }
}

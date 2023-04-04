import java.util.Scanner;

public class CheckOddEvenNumber {
    public static void main(String[] args) {
        System.out.println("Enter value in it");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();

        if (a%2==0){
            System.out.println(a+ " is even");
        }
        else {
            System.out.println(a+ " is odd");
        }
    }
}

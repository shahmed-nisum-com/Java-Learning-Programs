import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        int i;
        String s;
        float f;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter integer values");
        i=scanner.nextInt();
        System.out.println("values of i  "+i);

        System.out.println("Enter float values");
        f=scanner.nextFloat();
        System.out.println("values of f  "+f);

        System.out.println("Enter String values");
        s=scanner.nextLine();
        System.out.println("values of S  "+s);




    }
}

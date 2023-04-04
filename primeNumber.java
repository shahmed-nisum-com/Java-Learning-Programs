import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        int number;
        Scanner in=new Scanner(System.in);
        number=in.nextInt();
        boolean b=false;

        for (int i=2;i<number;i++){
            if (number%i==0){
                b=true;
            }
        }
        if (b==true){
            System.out.println("Number is not prime");
        }
        else {
            System.out.println("Number is prime");
        }

    }
}

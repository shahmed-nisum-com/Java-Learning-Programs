import java.util.Scanner;



public class ArmStrongNumbber {
    public static void main(String[] args) {
//        int number=153;
//        int a,b,c;
//        a=number%10;
//        number=number%10;
//        b=number%10;
//        number=number%10;
//        c=number%10;
//        for (int i=1;i<=3;i++){
//            a=a*i;
//            b=b*i;
//            c=c*i;
//        }
//        System.out.println("Sum is  "+ (a+b+c));

        int n,sum=0,temp,reminder,digits=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Input a number to check if it is armstrong");
        n=in.nextInt();

        temp=n;
        while (temp!=0){
            digits++;
            temp=temp/10;
        }
        temp=n;

        while (temp!=0){
            reminder=temp%10;
            sum= (sum+power(reminder,digits));
            temp=temp/10;
        }

        if (n==sum)
            System.out.println(n +"is an Armstrong number. ");
        else
            System.out.println(n + "is not an Armstrong number.");

    }
    static int power(int n,int r){
        int c,p=1;
        for (c=1;c<=r;c++){
            p=p*n;
        }
        return p;
    }
}

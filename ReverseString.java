import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String origional, reverse="";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first String");
//        System.out.println("Enter first String");
        origional=in.nextLine();

        int len=origional.length();
        for (int i=len-1;i>=0;i--){
            reverse=reverse+origional.charAt(i);
        }

        System.out.println("Reverse strings are "+reverse);



    }
}

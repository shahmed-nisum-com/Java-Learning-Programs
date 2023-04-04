import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {

        String str,sub;
        int i,c,length;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string to print it's substring");
        str=in.nextLine();

        length=str.length();
        System.out.println("substring of ");
        for (c=0;c<length;c++){
            for (i=1;i<=length-c;i++){
                sub=str.substring(c,c+i);
                System.out.println(sub);
            }
        }
    }
}

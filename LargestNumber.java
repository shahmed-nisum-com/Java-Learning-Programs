import java.sql.SQLOutput;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        int x,y,z;
        System.out.println("Enter three intger");
        Scanner in=new Scanner(System.in);

        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();

        if (x>y && x>z){
            System.out.println("Largest value is  "+x);
        }
        else if(y>x && y>z){
            System.out.println("Largest value is  "+y);
        }
        else if(z>x && z>y){
            System.out.println("Largest value is  "+z);
        }


    }
}

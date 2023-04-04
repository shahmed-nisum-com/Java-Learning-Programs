import java.util.Scanner;

public class gradeMarksheet {
    public static void main(String[] args) {
        int passMarks=40;

        Scanner in=new Scanner(System.in);
        System.out.println("Enter your marks to see your grade!!!");
        int obtainMarks=in.nextInt();

        if (obtainMarks>passMarks){
            if (obtainMarks>90){
                System.out.println("You got A grade");
            }
            else if (obtainMarks>80){
                System.out.println("You got B grade");

            }
            else if (obtainMarks>70){
                System.out.println("You got C grade");
            }
            else if (obtainMarks>60){
                System.out.println("You got D grade");
            }
            System.out.println("You are passed!");
        }
        else if (obtainMarks<passMarks){
            System.out.println("You are failed!!!");
        }
    }
}

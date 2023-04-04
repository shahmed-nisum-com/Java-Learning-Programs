import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        int table;
        System.out.println("Enter values for table");
        Scanner input=new Scanner(System.in);
        table=input.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(table+"  *  "+i+" = "+i*table);
        }

    }
}

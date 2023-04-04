import java.util.ArrayList;
import java.util.Iterator;

public class Exercise86 {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<String>();
        list.add("Shakeel");
        list.add("Ahmed");
        list.add("Jameel");

        Iterator itr= list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

import java.util.HashMap;
import java.util.Map;

public class HashSet<S> {

    public static void main(String[] args) {

       Map<Integer,String> map=new HashMap<Integer, String>() ;
       map.put(100,"Shakeel");
       map.put(101,"Jameel");
       map.put(102,"Ahmed");

       for (Map.Entry m: map.entrySet()){
           System.out.println(m.getKey()+"  "+m.getValue());
       }



    }
}

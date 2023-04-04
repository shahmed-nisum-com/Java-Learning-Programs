import java.util.LinkedList;


public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList I =new LinkedList();
        I.add("Hello");
        I.add(true);
        I.add(4.5F);
        I.add(12);
        I.add(null);

        System.out.println("  "+I);

        boolean b= I.isEmpty();
        System.out.println("Is empty    " +b);
        System.out.println("Size is  "+I.size());

        I.remove();
        System.out.println("After removed operation "+I);
        I.add(0,"Shakeel");
        I.add(4,'A');
        System.out.println("After Adding operation "+I);
        I.remove(4);
        System.out.println("After removing index operation "+I);


    }
}

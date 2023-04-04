
interface  info{
    static final String language="java";
    public void display();
}
public class SimpleJava implements info {

    public static void main(String[] args) {

        SimpleJava obj=new SimpleJava();
        obj.display();


    }

    @Override
    public void display() {
        System.out.println("language "+language);
    }
}

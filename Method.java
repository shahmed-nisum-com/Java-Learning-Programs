public class Method {

    Method(){
        System.out.println("Constroctor method is called when an object of it's class is created");
    }


    static void staticMethod(){
        System.out.println("static method can be called without creating object");
    }

    void nonStaticMethod(){
        System.out.println("Non static method must be called by creating an object");
    }
    public static void main(String[] args) {
        staticMethod();
        Method method=new Method();
        method.nonStaticMethod();
    }
}

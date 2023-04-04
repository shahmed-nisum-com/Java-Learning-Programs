public class Language {

    String name;

    Language(){
        System.out.println("Constructor method called...");
    }

    Language (String t){
        name=t;
    }

    void setName(String t){
        name=t;
    }

    void getName(){
        System.out.println("Language name "+name);
    }

    public static void main(String[] args) {
        Language cpp=new Language();
        Language java=new Language("Java");
        cpp.setName("C++");
        java.getName();
        cpp.getName();
    }
}

public class TestThrow {

    static void validate(int age){
        if (age<18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("Welcome to vote on technolamror ");
    }
    public static void main(String[] args) {
        validate(19);
        System.out.println("rest of the code...");
    }
}

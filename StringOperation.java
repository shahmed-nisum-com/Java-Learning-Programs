public class StringOperation {
    public static void main(String[] args) {

        String s1="Hello";
        String s2="hello";
        String s3="meklo";
        String s4="hemlo";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));


        System.out.println("End with values");
        String str="Java by TechnoLamror";
        System.out.println(str.endsWith("r"));
        System.out.println(str.endsWith("Lamror"));
        System.out.println(str.endsWith("lamror"));

        System.out.println("Index of function");

        String s12="this is index of example";
        int index1=s12.indexOf("is");
        int index2=s12.indexOf("index");

        System.out.println(index1 +" "+index2);

        int index3=s12.indexOf("is",4);
        System.out.println(index3);

        int index4=s12.indexOf('s');
        System.out.println(index4);

        String replacementString=s12.replaceAll("is","was");
        System.out.println("Replacement String  "+replacementString);


    }
}

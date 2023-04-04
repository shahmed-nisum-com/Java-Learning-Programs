public class GarbageCollector {

    public static void main(String[] args) {

        Runtime rs=Runtime.getRuntime();
        System.out.println("Free memory in JVM before Garage collection"+rs.freeMemory());

        rs.gc();
        System.out.println("Free memory in JVM after Garage collection"+rs.freeMemory());


    }
}

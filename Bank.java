public class Bank {

    int getRateOfInterest(){
        return 0;
    }

}
 class SBI extends Bank{
     int getRateOfInterest(){
         return 0;
     }
 }

 class ICICI extends Bank{
     int getRateOfInterest(){
         return 0;
     }
 }

 class AXIS extends Bank{
     int getRateOfInterest(){
         return 0;
     }
 }
 class Test2{
     public static void main(String[] args) {
         SBI s=new SBI();
         ICICI i=new ICICI();
         AXIS a=new AXIS();
         System.out.println("SBI rate of interest"+s.getRateOfInterest());
         System.out.println("ICCIC rate of interest"+i.getRateOfInterest());
         System.out.println("AXIS rate of interest"+a.getRateOfInterest());

     }
 }

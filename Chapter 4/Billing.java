
public class billin {
   public static void  main (String[]args){

   
  
   computeBill(23.2);
   computeBill(24.4,2);
   computeBill(38.4518, 2, 6);
  
   }
   public static void computeBill(double price){
    
        double Total = price * 1.08;
        System.out.printf("The total price of the bill is: $%.10f\n", Total);
   
   }
  
   public static void computeBill(double price, int quantity){
    
     double Total = price * quantity * 1.08;
     System.out.println("The total price of the bill is: $"+ Total);

   }
   public static void computeBill(double price, int quantity, int coupon){
     
     double Total = (price * quantity - coupon) * 1.08;
     System.out.println("The total price of the bill is: $"+ Total);

   }
}

import java.util.Scanner;
   public class SammysRentalPrice {
      public static void main (String [] args) {
      Scanner s = new Scanner(System.in);
    
      System.out.print("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS" + "\nS Sammy's makes it fun in the sun. S" + "\nSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

      System.out.print("\n\nEnter Number of Minutes: ");
      int Min = s.nextInt();
      if(Min < 60){
             System.out.printf("Rental Cost:$40");    
      }else {
        int Rent = ( Min / 60 * 40) + ( Min % 60 * 1);
        System.out.printf("Rental Cost:$%d", Rent);
      } 
     }
   }
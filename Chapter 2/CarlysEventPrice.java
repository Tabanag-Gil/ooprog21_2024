import java.util.Scanner;
public class CarlysEventPrice {
   public static void main (String [] args) {
   Scanner s = new Scanner(System.in);
   int Total;
   System.out.print("*************************************" + "\n* Carly's makes the food that makes *" + "\n* \t\t\t\t it a party. \t\t\t\t *" + "\n*************************************");
   System.out.print("\nEnter Number Of Guests: ");
   int Guest = s.nextInt();
   System.out.print("Price Per Guest: $35 ");
   
   Total = Guest * 35;
   System.out.printf("\nTotal Cost: $%d", Total);
   if(Guest >= 50) {
   System.out.print("\nLarge Event: True");
   }else {
   System.out.print("\nLarge Event: False");
      } 
   }
}
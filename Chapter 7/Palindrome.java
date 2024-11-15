import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input String: ");
        String palin = s.nextLine();
        String reversed = new StringBuilder(palin).reverse().toString();

        if(palin.equalsIgnoreCase(reversed)){
       System.out.println("palindrome");
    }else{
        System.out.println("Not a palindrome");
    }
}
}
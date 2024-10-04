import java.util.Scanner;

public class BloodData {
    private static String bloodType; 
    private static String rhFactor;   

    public static void collectInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Blood Type: ");
        bloodType = s.nextLine().toUpperCase();
        System.out.println("Enter Rh Factor (- or +): ");
        rhFactor = s.nextLine();

        
        if (bloodType.isEmpty() || 
            !(bloodType.equals("A") || bloodType.equals("B") || bloodType.equals("AB") || bloodType.equals("O")) ||
            rhFactor.isEmpty() || !(rhFactor.equals("-") || rhFactor.equals("+"))) {
            defaultPatient();
        }
        
       
    }
    public static void defaultPatient() {
        bloodType = "A"; 
        rhFactor = "-"; 
        System.out.println("Invalid input detected. Default values set:");
    }

    public static void displayBloodInfo() {
        System.out.println("Your blood type is: " + bloodType);
        System.out.println("Your Rh factor is: " + rhFactor);
    }
}

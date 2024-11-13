import java.util.Scanner;

class SpoonerismGenerator {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter First Word: ");
        String firstWord = s.nextLine();
        char firstLet = firstWord.charAt(0); 
        System.out.println("Enter Second Word: ");
        String secondWord = s.nextLine();
        
        if ("aeiou".indexOf(firstLet) != -1) {
            System.out.println(firstWord + " and " + secondWord + " are not good words to spoonerize.");
        } else {
           
            int firstVowelIndex1 = findFirstVowelIndex(firstWord);
            int firstVowelIndex2 = findFirstVowelIndex(secondWord);

       
            if (firstVowelIndex1 == -1 || firstVowelIndex2 == -1) {
                System.out.println(firstWord + " and " + secondWord + " are not good words to spoonerize.");
            } else {
               
                String spoonerized1 = secondWord.substring(0, firstVowelIndex2) + firstWord.substring(firstVowelIndex1);
                String spoonerized2 = firstWord.substring(0, firstVowelIndex1) + secondWord.substring(firstVowelIndex2);

                System.out.printf("%s and %s spoonerized are %s %s", firstWord, secondWord, spoonerized1, spoonerized2);
            }
        }
    }

   
    public static int findFirstVowelIndex(String word) {
        String vowels = "aeiou";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1; 
    }
}

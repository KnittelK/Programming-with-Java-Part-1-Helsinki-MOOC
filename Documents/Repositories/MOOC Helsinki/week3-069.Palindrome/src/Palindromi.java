import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String lower = text.toLowerCase();
        String reverse = "";
        int i = text.length();
        while (i != 0) {
            reverse += lower.charAt(i-1);
            i--;
        }
        return (lower.equals(reverse));
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}

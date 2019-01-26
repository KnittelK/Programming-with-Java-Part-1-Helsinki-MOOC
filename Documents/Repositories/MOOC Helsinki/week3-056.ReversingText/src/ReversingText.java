
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int i = text.length();
        String rev = "";
        while (i != 0 ) {
            rev += text.charAt(i-1);
            i--;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}

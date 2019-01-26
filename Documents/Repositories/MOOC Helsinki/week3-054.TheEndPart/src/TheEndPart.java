import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.println("length of the first part: ");
        int len = reader.nextInt();
        System.out.println("Result: " + word.substring(word.length()-len));
    }
}

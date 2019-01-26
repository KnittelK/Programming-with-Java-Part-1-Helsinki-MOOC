
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        
        boolean playing = true;
        int guesses = 0;
        
        while (playing) {
            System.out.print("Guess a number: ");
            int guess = reader.nextInt();
            guesses++;
            if (guess > numberDrawn) {
                System.out.println("The number is lesser, guesses made " + guesses);
            } else if (guess < numberDrawn) {
                System.out.println("The number is greater, guesses made " + guesses);
            } else {
                playing = false;
                System.out.println("Congratulations, your guess is correct!");
            }
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}

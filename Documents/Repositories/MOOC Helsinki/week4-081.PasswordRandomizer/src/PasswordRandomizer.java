import java.util.Random;

public class PasswordRandomizer {
   private int passlength;
   private Random random;

    public PasswordRandomizer(int length) {
        this.passlength = length;
        this.random = new Random();
    }

    public String createPassword() {
        String password = "";
        int count = 0;
        while (count != this.passlength) {
            char alpha = "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(26));
            password += alpha;
            count++;
        }
        return password;
    }
}

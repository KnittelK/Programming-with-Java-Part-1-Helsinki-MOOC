
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LyyraCard Pekka = new LyyraCard(20);
        LyyraCard Brian = new LyyraCard(30);
        Pekka.payGourmet();
        Brian.payEconomical();
        System.out.print("Pekka: ");
        System.out.println(Pekka);
        System.out.print("Brian: ");
        System.out.println(Brian);
        Pekka.loadMoney(20);
        Brian.payGourmet();
        System.out.print("Pekka: ");
        System.out.println(Pekka);
        System.out.print("Brian: ");
        System.out.println(Brian);
        Pekka.payEconomical();
        Pekka.payEconomical();
        Brian.loadMoney(50);
        System.out.print("Pekka: ");
        System.out.println(Pekka);
        System.out.print("Brian: ");
        System.out.println(Brian);
    }
}

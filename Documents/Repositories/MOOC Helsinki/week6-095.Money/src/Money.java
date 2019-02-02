
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }
    
    public Money plus(Money added) {
        return new Money(euros() + added.euros(), cents() + added.cents());
    }
    
    public boolean less(Money compared) {
        if (euros() < compared.euros()) {
            return true;
        } else if (euros() == compared.euros()) {
            if (cents() < compared.cents()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    public Money minus(Money decremented) {
        int convertedToCents = euros()*100 + cents();
        int decrementToCents = decremented.euros()*100 + decremented.cents();
        
        if (convertedToCents > decrementToCents) {
            int remainder = convertedToCents - decrementToCents;
            int newCents = remainder%100;
            int newEuros = (remainder-newCents)/100;
            return new Money(newEuros, newCents);
        } else {
            return new Money(0, 0);
        }
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}

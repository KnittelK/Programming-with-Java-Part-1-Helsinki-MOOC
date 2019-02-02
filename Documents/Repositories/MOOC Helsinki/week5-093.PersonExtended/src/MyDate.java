
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differneceInYears(MyDate compared) {
        int first = this.year*365 + (this.month-1)*30 + this.day;
        int second = compared.year*365 + (compared.month-1)*30 + compared.day;
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        int diff = Math.abs(first-second);
        System.out.println("diff: "+diff);
        if (diff > 364) {
            System.out.println("entered if.");
            return (int) Math.floor(diff/365.);
        } else {
            return 0;
        }
    }

  
}

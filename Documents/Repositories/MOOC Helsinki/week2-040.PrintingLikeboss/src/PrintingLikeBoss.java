public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while (amount != 0){
            System.out.print("*");
            amount--;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int repeat = amount;
        while (repeat != 0) {
            System.out.print(" ");
            repeat--;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int counter = size-1;
        int repeat = 0;
        while (repeat != size) {
            printWhitespaces(counter-repeat);
            printStars(repeat+1);
            repeat++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int first_star = 1;
        int white_spaces = height-1;
        int beginning = 0;
        while (beginning != height) {
            printWhitespaces(white_spaces-beginning);
            printStars(first_star + (beginning * 2));
            beginning++;
        }
        int begin_center = height - 2;
        int base_size = 2;
        while (base_size != 0) {
            printWhitespaces(begin_center);
            printStars(3);
            base_size--;
        }
        
        
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}

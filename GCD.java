/**
 * Created by igoro on 10/24/2016.
 */
import java.util.Scanner;

public class GCD {
    // determine the Greater Common Divider function
    private long gcd(long a, long b) {
        while (true) {
            // process visualization
            System.out.println(a + " " + b);
            if (a == 0) return b;
            if (b == 0) return a;
            if (a >= b) {
                a %= b;
            } else {
                b %= a;
            }
        }

    }

    //running function and printing the result + check time
    private void run() {
        //reading numbers from reading line
        long a, b;
        System.out.println("Enter two number to find their Greatest Common Divider: ");
        Scanner in = new Scanner(System.in);
        a = in.nextLong();
        b = in.nextLong();

        //finding GCD and time
        long startTime = System.currentTimeMillis();
        System.out.println("The GCD = "+gcd(a,b));
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");
    }

    // main function - entrance to the program
    public static void main(String[] args) {
        new GCD().run();
    }
}

/**
 * Created by igoro on 10/24/2016.
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci_no_cache {

    //Fibonacci generation without any cache
    private BigInteger fibonacci(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        for (int i = 0; i < n; i++){
            BigInteger c = a.add(b);
            a = b;
            b = c;
        }
        return a;
    }
    //function for printing the result and time check
    private void run() {
        // reading n from reading line
        int n;
        System.out.println("Enter a number to calculate the Fibonacci: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        //calculating fibo number and check time
        long startTime = System.currentTimeMillis();
        System.out.println(fibonacci(n));
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");
    }

    //main function - program starting point
    public static void main(String[] args) {
        new Fibonacci_no_cache().run();
    }
}

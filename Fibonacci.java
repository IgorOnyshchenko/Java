/**
 * Created by igoro on 10/24/2016.
 */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class Fibonacci {
    // cache with Fibonacci numbers
    List<BigInteger> cache = new ArrayList<>();
    {
        cache.add(BigInteger.ZERO);
        cache.add(BigInteger.ONE);
    }

    // Fibonacci function
    private BigInteger fibonacci(int n){
        // from 0 to cache.size - 1
        for (int i = cache.size(); i <= n; i++) {

            BigInteger res = cache.get(i - 1).add(cache.get(i - 2));
            cache.add(res);
        }
        return cache.get(n);
    }

    // result output function
    private void run(int n) {
        System.out.println(fibonacci(n));
    }

    //main function and time check
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new Fibonacci().run(100);
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");
    }
}

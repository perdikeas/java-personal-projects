public class Fibonacci {

    public static void main(String args[]) {
        System.out.printf("the maximum long representable in Java is: %d\n", Long.MAX_VALUE);
        for (int i = 1; i < 100; i++) {
            final long v1 = fibClosedFormula(i);
            final long v2 = fibRecursion(i);
            if (v1!=v2) {
                System.out.printf("weird: while computing the %d-th Fib term: %d!=%d", i, v1, v2);
                break;
            } else
                System.out.printf("fib(%d) = %d\n", i, v1);
        }
    }

    static long fibClosedFormula(int n) {
        // https://fabiandablander.com/r/Fibonacci.html
        final double phi = (1 + Math.sqrt(5))/2;
        final double v =  Math.pow(phi, n) / Math.sqrt(5) ;
        if (v >= Long.MAX_VALUE)
            return -1;
        else
            return Math.round( Math.pow(phi, n) / Math.sqrt(5));
    }

                                        
    static long fibRecursion(int n) {
        if (n<=0) {
            System.out.printf("please enter a number >= 1");
            return -1;
        } else {
            if ((n==1) || (n==2))
                return 1;
            else
                return fibRecursion(n-1)+fibRecursion(n-2);
        }
    }

}

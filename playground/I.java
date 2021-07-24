public class I {

    public static void main(String args[]) {
        final int N = 5;
        System.out.printf("final result fib(%d) = %d\n", N, fib(N));
    }

    static int fib(int n) {
        int v;
        if (n<=2)
            v = 1;
        else
            v = fib(n-1)+fib(n-2);
        System.out.printf("fib(%d) returning %d\n", n, v);
        return v;
    }

    static int fib2(int n) {
        if (n<=2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }    
}

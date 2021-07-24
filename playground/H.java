public class H {

    public static void main(String args[]) {
        final int n = 4;
        final int a = 5;
        System.out.printf("%d * %d = %d\n", n, a, mul(n, a));
    }

    static int mul(int n, int a) {
        System.out.printf("entering mul(%d, %d)\n", n, a);
        if (n==0) {
            final int v = 0;
            System.out.printf("mul(%d, %d) returning %d\n", n, a, v);
            return v;
        } else {
            final int v = mul(n-1, a) + a;
            System.out.printf("mul(%d, %d) returning %d\n", n, a, v);
            return v;
        }
    }
}

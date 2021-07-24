public class F {

    public static void main(String args[]) {

        final int[] a = new int[10];
        foo(a);
        for (int i = 0; i < a.length; i++)
            System.out.printf("the value of cell #%d is: %d\n", i, a[i]);

    }

    static void foo(int[] b) {
        b[0] = 42;
        b = new int[100];
    }

}

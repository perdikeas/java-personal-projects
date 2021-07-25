public class J {

    public static void main(String args[]) {
        System.out.printf("the minimum int in Java is: %d\n", Integer.MIN_VALUE);
        int a[] = {100,2,3,88, 4,5};
        System.out.printf("the maximum value in a is: %d\n", max2(a));
    }

    private static int max(int[] x) {
        int v = x[0];

        for (int i = 1; i < x.length ; i++) {
            if (x[i] > v)
                v = x[i];
        }
        return v;
    }

    private static int max2(int[] x) {
        int v = Integer.MIN_VALUE;

        for (int i = 0; i < x.length ; i++) {
            if (x[i] > v)
                v = x[i];
        }
        return v;
    }    
}


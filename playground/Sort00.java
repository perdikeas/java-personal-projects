public class Sort00 {

    // sorts an array of natural numbers!
    // -1 is a special value and should not appear in the data
    public static void main(String args[]) {
        int a[] = {100, 2, 3, 88, 4, 5, 0};
        int[] a_sorted = sort(a);
        System.out.printf("The unsorted array is:\n");
        print(a);
        System.out.printf("The sorted array is:\n");
        print(a_sorted);
    }

    // does not mutate the original array; returns
    // a sorted _copy_ of it.
    private static int[] sort(int[] u) {
        final int[] u2 = copy(u);
        final int N = u2.length;
        int[] s = new int[N];
        for (int i = 0; i < N ; i++) {
            final int[] min_and_idx = findMinAndIndex(u2);
            s[i] = min_and_idx[0];
            u2[ min_and_idx[1] ] = -1;
        }
        return s;
    }

    private static int[] copy(final int a[]) {
        final int N = a.length;
        final int[] a_copy = new int[N];
        for (int i = 0; i < N ; i++)
            a_copy[i] = a[i];
        return a_copy;
    }

    private static int[] findMinAndIndex(int[] a) {
        int min = a[0];
        int min_idx = 0;
        int [] rv = new int[2];
        for (int i = 1; i < a.length ; i++) {
            if (a[i] == -1)
                continue;
            if (a[i] < min) {
                min = a[i];
                min_idx = i;
            }
        }
        rv[0] = min;
        rv[1] = min_idx;
        return rv;
    }
                                        

    private static void print(int[] a) {
        System.out.printf("[");
        for (int i = 0; i < a.length ; i++) {
            String mask = "%d, ";
            if (i == a.length - 1)
                mask = "%d";
            System.out.printf(mask, a[i]);
        }
        System.out.printf("]\n");
    }

}


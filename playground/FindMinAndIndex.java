public class FindMinAndIndex {

    // The minimum value is 2 at index 1
    public static void main(String args[]) {
        int a[] = {100, 2, 3, 88, 4, 5};
        int rv[] = findMinAndIndex(a);
        System.out.printf("The minimum value is %d at index %d\n", rv[0], rv[1]);
    }

    private static int[] findMinAndIndex(int[] a) {
        int min = a[0];
        int min_idx = 0;
        int [] rv = new int[2];
        for (int i = 1; i < a.length ; i++) {
            if (a[i] < min) {
                min = a[i];
                min_idx = i;
            }
        }
        rv[0] = min;
        rv[1] = min_idx;
        return rv;
    }
}


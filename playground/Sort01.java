public class Sort01 {

    // sorts an array of integers in place
    // (mutates the original array)
    public static void main(String args[]) {
        int a[] = {100, 2, 3, 88, 4, 5, 0};
        System.out.printf("the unsorted array is:\n");
        print(a);
        sort(a);
        System.out.printf("the sorted array is:\n");
        print(a);
    }

    private static void sort(int[] a) {
        final int N = a.length;
        for (int i = 0; i < N; i++) {
            final int min_idx = findIndxOfMin(a, i);
            swap(a, i, min_idx);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int v = a[i];
        a[i] = a[j];
        a[j] = v;
    }

    private static int findIndxOfMin(int[] a, int j) {
        int min = a[j];
        int min_idx = j;
        int [] rv = new int[2];
        for (int i = j+1; i < a.length ; i++) {
            if (a[i] < min) {
                min = a[i];
                min_idx = i;
            }
        }
        return min_idx;
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


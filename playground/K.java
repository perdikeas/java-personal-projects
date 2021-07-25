public class K {

    public static void main(String args[]) {
        int a[] = {100,2,3,88, 4,5};
        int[] a_sorted = sort(a);
        System.out.printf("The sorted array is:\n");
        print(a_sorted);
    }

    private static int[] sort(int[] x) {
        int[] v = new int[x.length];
        return v;
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


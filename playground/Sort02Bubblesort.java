import java.util.Random;

public class Sort02Bubblesort {

    static long outerLoops = 0;
    static long countOfWorkUnits = 0;

    // bubblesort
    public static void main(String args[]) {
        final Random r = new Random();
        int a[] = new int[1000];
        for (int i = 0; i < a.length ; i++) {
            a[i] = r.nextInt();
        }
        System.out.printf("the unsorted array is:\n");
        print(a);
        bubbleSort(a);
        System.out.printf("the sorted array is:\n");
        print(a);
        System.out.printf("%d work units in %d outer loops\n", countOfWorkUnits, outerLoops);
    }

    private static void bubbleSort(int[] a) {
        final int N = a.length;
        for (int i=0; i<N; i++){
            outerLoops ++;
            boolean flipHappened = false;
            for (int j=0; j<N-1-i; j++){
                countOfWorkUnits++;
                if (a[j]>a[j+1]) {
                    final int c = a[j];
                    a[j] = a[j+1];
                    a[j+1] = c;
                    flipHappened = true;
                }
            }
            if (! flipHappened)
                break;
        }
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


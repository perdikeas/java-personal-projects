public class D {

    public static void main(String args[]) {
        
        final int[] a = new int[10];
        for (int i = 0 ; i < a.length ; i++) {
            a[i] = i*i*i;
        }

        for (int i = 0; i < a.length ; i++)
            System.out.printf("the value in cell #%d is: %d\n", i, a[i]);
    }
}

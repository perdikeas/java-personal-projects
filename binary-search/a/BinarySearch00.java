package a;
public class BinarySearch00 {

  public static int find(final int [] a, final int x){
      int first = 0;
      int last = a.length;
      // we are looking at the interval [i, j)
      while (first < last) {
        final int m = (int) Math.floor((first + last) / 2);
        if (a[m] == x) {
          return m;
        } else if (a[m] > x) {
          last = m;
        } else {
          first = m +1;
        }
      }
      return -1;
  }

  public static void main(String[] args){
    final int[] a = {5,10,15,20,25,30,35};
    final int x = 10;
    final int idx = find(a, x);
    System.out.printf("The value %d is found at index %d \n", x, idx);
  }
}

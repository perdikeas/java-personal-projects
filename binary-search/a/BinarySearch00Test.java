package a;
import a.BinarySearch00;
import java.util.Arrays;
public class BinarySearch00Test {

  public static void main(String[] args) {
    final int N = 1000000;
    for (int i = 0; i < N; i++) {
      System.out.printf(".");
      final int MaxSize = 50000;
      final int size = 1 + (int) (Math.random()*MaxSize);
      final int[] a = createArray(size);
      final boolean arrayIncludesValue = Math.random() > 0.1;
      int pos, posFound;
      if (arrayIncludesValue) {
        pos = (int) (Math.random()*size);
        final int x = a[pos];
        posFound = BinarySearch00.find(a, x);
      } else {
        pos = -1;
        posFound = BinarySearch00.find(a, -1);
      }
      boolean bugFound=false;
      if ((pos==-1)&&(posFound==-1)){
        continue;
      } else if ((pos==-1)&&(posFound!=-1)){
        bugFound=true;
      } else if ((pos!=-1)&&(posFound==-1)) {
        bugFound=true;
      } else if(posFound>=a.length){
        bugFound=true;
      } else if (a[pos]!=a[posFound]) {
        bugFound=true;
      }
      if (bugFound){
        System.out.println("Bug found");
        System.exit(1);
      }
    }
    System.out.printf("\n%d test cases ran successfully.\n", N);
  }

  private static int[] createArray(final int size) {
    final int[] a = new int [size];
    for (int i = 0; i < size; i++) {
        a[i] = (int) (Math.random()*1e9);
    //    System.out.println("The test array is: "+ a);
    }
    Arrays.sort(a);
    return a;
  }
}

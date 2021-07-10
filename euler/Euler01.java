/*
Problem 1 - Multiples of 3 and 5

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/


public class Euler01 {
  public static void main(String[] args) {
    int result=0;
    for (int i=0; i<1000; i++){
      if (isMul(i,5) || isMul(i,3))
        result+=i;
    }
  System.out.printf("%d",result);
  }
  static boolean isMul(final int a, final int b){
    return a%b==0;
  }

}

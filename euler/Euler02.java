/*
  Problem 2 - Even Fibonacci numbers

  Each new term in the Fibonacci sequence is generated by adding the previous two terms.
  By starting with 1 and 2, the first 10 terms will be:

  1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

  By considering the terms in the Fibonacci sequence whose values do not exceed
  four million, find the sum of the even-valued terms.
*/

public class Euler02 {
    public static void main(String[] args) {
        final int answer1 = solution1();
        final int answer2 = solution2();
        if (answer1==answer2)
            System.out.printf("the answer is [%d]\n", answer1);
        else
            System.out.printf("ERROR! I got two different answers: %d and %d\n", answer1, answer2);
    }

    private static int solution1() {
        final int LIMIT = 4*1000*1000;
        int sum = 0;
        int i = 1;
        int fibvalue = fib(i);
        while (fibvalue <= LIMIT) {
            if (fibvalue %2 == 0)
                sum += fibvalue;
            i++;
            fibvalue = fib(i);
        }
        return sum;
    }

    private static int solution2() {
        final int LIMIT = 4*1000*1000;
        int sum = 0;
        for (int i = 1; fib(i)<=LIMIT; i++) {
            final int fibvalue = fib(i);
            if (fibvalue % 2 == 0)
                sum += fibvalue;
        }
        return sum;
    }

    static int fib(int n) {
        if (n<=2)
            return n;
        else
            return fib(n-1)+fib(n-2);
    }
}

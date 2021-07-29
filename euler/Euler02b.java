//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

public class Euler02b {
  public static void main(String[] args){
    int n=1;
    int rv=0;
    int N=4000000;
    while (Fib(n)<=N){
        if (IsEven(Fib(n))){
          rv+=Fib(n);
        }
        n+=1;
    }
    System.out.printf("The answer is %d /n",rv);
  }
  static int Fib(int n){
    if(n<=2)
      return n;
    else
      return Fib(n-2)+Fib(n-1);
    }

  static boolean IsEven(int n){
    return (n%2==0);
    }

}

//What is the largest prime factor of the number 600851475143
public class Euler03 {

    public static void main2(String[] args) {
        for (long i = 0; i < 100; i++)
            if (isPrime(i))
                System.out.printf("%d ", i);
        System.out.printf("\n");
    }

    public static void main3(String[] args) {
        for (long i = 0 ; i < 10; i++) {
            long answer = findLargestPrimeFactor(i);
            if (answer == -1)
                System.out.printf("number %d has no prime factors at all\n", i);
            else
                System.out.printf("The largest prime factor of %d is %d\n", i, answer);
        }
    }

    public static void main(String[] args) {
        final long N = 600851475L; // 600851475143L takes far too long
        System.out.printf("The largest prime factor of %d is %d\n"
                          , N
                          , findLargestPrimeFactor(N));
        
    }

    public static long findLargestPrimeFactor(final long N) {
        long rv = -1;
        for (long i=1; i<=N; i++) {
            if (isDiv(i,N) && isPrime(i) && (i>rv)) {
                rv=i;
            }
        }
        return rv;
    }

    static boolean isDiv(long a ,long b) {
      return (b%a==0);
    }
    
    static boolean isPrime(long a) {
      if (a<2){
        return false;
      } else {
        for (long i=2; i<=Math.ceil(Math.sqrt(a)); i++) {
            if (isDiv(i,a) && (i!=a)) {
                return false;
            }
        }
        return true;
      }
    }
}

//Find the sum of all the multiples of 3 or 5 below 1000.

public class Euler01b {

    public  static void main (String[] args){
        int rv=0;
        for (int i=1; i<1000; i++){
            if (isMul(i,3) | isMul(i,5)){
              rv+=i;
            }
          }
        System.out.printf("The answer is: %d",rv);
        }

    static boolean isMul(int a, int b){
      return (a%b==0);
    }

}

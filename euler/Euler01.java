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

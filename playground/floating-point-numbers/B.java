public class B {
  public static void main(String[] args) {
    final float f = 3;
    int i = f; // compile time error 
    System.out.printf("The value of i is: %d\n", i);
  }
}

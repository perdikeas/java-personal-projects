public class A {
  static int counter=0;
  public static void main(String[] args) {
    foo();
  }
  static void foo(){
    if (counter>1000)
      return;
    counter+=1;
    System.out.printf("x");
    foo();
  }
}

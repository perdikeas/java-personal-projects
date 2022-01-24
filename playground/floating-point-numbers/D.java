public class D {
  public static void main(String[] args) {
    float f = 9e22f;
    float f0=f;
    f0=f0+1f;
    System.out.printf("f0==f? %b\n",f0==f);
  }
}

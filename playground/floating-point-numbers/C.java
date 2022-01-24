public class C {
  public static void main(String[] args) {
    float f = (float) Math.random() ;
    float f0=f;
    float g =(float) Math.random() ;
    f=(f+2)*g;
    f=f/g-2;
    System.out.printf("f0==f? %b\n",f0==f);
  }
}

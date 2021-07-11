public class B {
    static int i = 0;
    public static void main(String[] args) {
        System.out.printf("entering main\n");
        foo();
        System.out.printf("exiting main\n");
    }
    static void foo(){
        i++;
        System.out.printf("recursion depth of [%d] reached\n", i);
        foo();
    }
}

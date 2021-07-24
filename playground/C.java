public class C {

    public static void main(String args[]) {
        int a = 1;
        int b = 2;
        int c = add(incr(a), incr(b));
        System.out.printf("the sum of %d and %d is: %d\n", a, b, c);
    }

    static int incr(int a) {
        System.out.printf("incr(%d)\n", a);
        return a+1;
    }

    static int add(int a, int b) {
        System.out.println("add");
        return a+b;
    }




}

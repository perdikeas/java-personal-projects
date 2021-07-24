public class E {

    public static void main(String[] args) {
        System.out.printf("The program was called with %d command-line arguments\n", args.length);
        System.out.printf("These were:\n");
        for (int i = 0; i < args.length ; i++)
            System.out.printf("the value of the command-line argument #%d is: %s\n", i, args[i]);

    }


}

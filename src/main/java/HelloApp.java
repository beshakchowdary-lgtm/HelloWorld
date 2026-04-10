public class HelloApp {
    public static void main(String[] args) {
        // args[0] is the first word typed after the command
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Hello World");
        }
    }
}
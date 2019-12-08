public class S {
    public static final int KONSTANTA = 1;
    private static int prop = 1;
    private static int func () {
        return 1;
    }

    S() {
        this.demo();
    }

    void demo() {
        // st const, non st ctx
        System.out.println(KONSTANTA);
        // st var, non st ctx
        System.out.println(prop);
        // st meth, non st ctx
        System.out.println(func());
    }

    public static void main(String[] args) {
        new S();
    }
}

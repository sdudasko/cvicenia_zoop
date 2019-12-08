//: c07:PrivateOverride.java
// Abstract classes and methods.

public class PrivateOverride {
    private static Test monitor = new Test();
    private void f() {
        System.out.println("private f()");
    }
    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
        monitor.expect(new String[] {
                "private f()"
        });
    }
}

class Derived extends PrivateOverride {
    public void f() {
        System.out.println("public f()");
    }
} ///:~
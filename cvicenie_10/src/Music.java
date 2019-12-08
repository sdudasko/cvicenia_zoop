//: c07:music:Music.java
// Inheritance & upcasting.

public class Music {
    private static Test monitor = new Test();
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // Upcasting
        monitor.expect(new String[] {
                "Wind.play() Middle C"
        });
    }
} ///:~

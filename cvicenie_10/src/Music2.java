public class Music2 {
    private static Test monitor = new Test();
    public static void tune(Wind i) {
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Stringed i) {
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Brass i) {
        i.play(Note.MIDDLE_C);
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute); // No upcasting
        tune(violin);
        tune(frenchHorn);


        monitor.expect(new String[] {
                "Wind.play() Middle C",
                "Stringed.play() Middle C",
                "Brass.play() Middle C"
        });
    }
} ///:~
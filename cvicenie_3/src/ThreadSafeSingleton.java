public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() { // TODO - co to je ? V prednaske okolo toho vela nebolo
        if (instance == null) {
            return new ThreadSafeSingleton();
        }
        return instance;
    }
}

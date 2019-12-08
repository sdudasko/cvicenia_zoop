public class PrivateConstruct {
    private static PrivateConstruct instance = new PrivateConstruct();

    private PrivateConstruct() {
        instance = getInstance();
    }

    public static PrivateConstruct getInstance() {
        return instance;
    }
}

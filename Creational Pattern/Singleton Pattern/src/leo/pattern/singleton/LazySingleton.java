package leo.pattern.singleton;

public class LazySingleton {

    private static LazySingleton lazyInstance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (lazyInstance == null) {
            lazyInstance = new LazySingleton();
        }
        return lazyInstance;
    }
}

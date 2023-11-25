package leo.pattern.singleton;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (threadSafeSingleton == null) {
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }
}

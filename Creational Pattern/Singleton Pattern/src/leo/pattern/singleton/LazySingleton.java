package leo.pattern.singleton;

import java.security.SecureRandom;

public class LazySingleton {

    private static LazySingleton lazyInstance;
    private int index;

    private LazySingleton(int index) {
        this.index = index;
    }

    public static LazySingleton getInstance() {
        if (lazyInstance == null) {
            lazyInstance = new LazySingleton(new SecureRandom().nextInt());
        }
        return lazyInstance;
    }

    public String getLog() {
        return "It is instance " + this.index;
    }
}

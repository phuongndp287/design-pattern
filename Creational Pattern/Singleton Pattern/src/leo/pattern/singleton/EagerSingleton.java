package leo.pattern.singleton;

import java.security.SecureRandom;

/**
 * Luôn khởi tạo instance ngay khi cả không dùng tới.
 */
public class EagerSingleton {
    private static final EagerSingleton EAGER_SINGLETON = new EagerSingleton(new SecureRandom().nextInt());
    private int index;

    // Để private Constructor để ngăn chặn client use Constructor
    private EagerSingleton(int index) {
        this.index = index;
    }

    public static EagerSingleton getInstance() {
        return EAGER_SINGLETON;
    }
    public String getLog() {
        return "It is instance " + this.index;
    }
}

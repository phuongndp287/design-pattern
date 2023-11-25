package leo.pattern.singleton;

/**
 * Luôn khởi tạo instance ngay khi cả không dùng tới.
 */
public class EagerSingleton {
    private static final EagerSingleton EAGER_SINGLETON = new EagerSingleton();

    // Để private Constructor để ngăn chặn client use Constructor
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return EAGER_SINGLETON;
    }
}

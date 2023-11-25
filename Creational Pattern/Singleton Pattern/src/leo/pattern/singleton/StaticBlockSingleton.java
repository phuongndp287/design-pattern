package leo.pattern.singleton;

public class StaticBlockSingleton {
    private static final StaticBlockSingleton STATIC_BLOCK_SINGLETON;

    // Để private Constructor để ngăn chặn client use Constructor
    private StaticBlockSingleton() {
    }

    static {
        STATIC_BLOCK_SINGLETON = new StaticBlockSingleton();
    }

    public static StaticBlockSingleton getInstance() {
        return STATIC_BLOCK_SINGLETON;
    }
}

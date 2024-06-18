package leo.pattern.singleton;

public enum EnumSingleton {
    INSTANCE;
    private int index;

    private EnumSingleton() {
        System.out.println("Instance created");
    }

    public static void main(String[] args) {
        //enum fields are compile time constants,
        //but they are instances of their enum type. And, they're constructed when the enum type is referenced for the first time.
        System.out.println(EnumSingleton.INSTANCE);
    }
}

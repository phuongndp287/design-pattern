package leo.pattern.singleton;

import java.security.SecureRandom;

public class BillPughSingleton {

    private int index;

    private BillPughSingleton(int index) {
        this.index = index;
    }

    public static BillPughSingleton getInstance() {
        return SingletonNestedClass.INSTANCE;
    }

    private static class SingletonNestedClass {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton(new SecureRandom().nextInt());
    }

    public String getLog() {
        return "It is instance " + this.index;
    }
}

import leo.pattern.singleton.EagerSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton1 = null;

        // Trong quá trình runtime thì khi dùng thuộc tính setAccessible có thể
        //enable access to private members, members with default (package) access, protected instance members, or protected constructors when the declaring class is in a different module to the caller and the package containing the declaring class is not open to the caller's module.
        Constructor<?>[] constructors = EagerSingleton.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            eagerSingleton1 = (EagerSingleton) constructor.newInstance();
        }

        System.out.println("Singleton 1:" + eagerSingleton.hashCode());
        System.out.println("Singleton 2:" + eagerSingleton1.hashCode());
    }
}
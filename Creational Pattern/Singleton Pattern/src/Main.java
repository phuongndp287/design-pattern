import leo.pattern.singleton.BillPughSingleton;
import leo.pattern.singleton.EagerSingleton;
import leo.pattern.singleton.LazySingleton;
import leo.pattern.singleton.ThreadSafeSingleton;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, InterruptedException {

        //EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        //EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();;

/*        // Trong quá trình runtime thì khi dùng thuộc tính setAccessible có thể
        //enable access to private members, members with default (package) access, protected instance members, or protected constructors when the declaring class is in a different module to the caller and the package containing the declaring class is not open to the caller's module.
        Constructor<?>[] constructors = EagerSingleton.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            eagerSingleton1 = (EagerSingleton) constructor.newInstance();
        }*/

        Thread[] threads = new Thread[10000];
        for (int i = 0; i < 10000; i++) {

            int finalI = i;
            threads[i] = new Thread(() -> {
                BillPughSingleton instance = BillPughSingleton.getInstance();
                System.out.println("Thread " + finalI + ": " + instance.getLog());
            });
        }

        long startTime = System.nanoTime();
        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Time taken Synchronized: " + duration + " nanoseconds.");
    }
}
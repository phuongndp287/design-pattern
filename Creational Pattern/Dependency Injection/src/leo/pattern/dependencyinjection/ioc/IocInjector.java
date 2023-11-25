package leo.pattern.dependencyinjection.ioc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class IocInjector {
    private static final String IOC_INIT_FILE_NAME = "ioc.properties";

    private IocInjector() {
    }

    public static Object getInstance(String key) {
        try {
            InputStream inputStream = new FileInputStream(IOC_INIT_FILE_NAME);
            Properties properties = new Properties();
            properties.load(inputStream);
            String className = properties.getProperty(key);
            return Class.forName(className).newInstance();
        } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}

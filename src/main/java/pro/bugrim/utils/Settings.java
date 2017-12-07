package pro.bugrim.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Настройки.
 * @author Бугримов Александр.
 * @version 0.1
 */
public class Settings {
    private final Properties properties;
    private final String fileName;

    public Settings(String fileName) {
        this.properties = new Properties();
        this.fileName = fileName.concat(".properties");
    }

    /**
     * Получить значение по ключу.
     * @param key Ключ.
     * @return Значение по ключу.
     */
    public String value(String key) {
        String value = "";

        try (InputStream inputStream = getClass().getResourceAsStream(fileName)) {
            properties.load(inputStream);
            value = properties.getProperty(key);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return value;
    }
}

package com.qa.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream fis = new FileInputStream(
                "src/test/resources/config.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static String getBrowserName() {
        return getProperty("browser").toLowerCase();
    }

    public static String getBaseUrl() {
        return getProperty("baseUrl");
    }

    public static String getAPIBaseUrl() {
        return getProperty("apiBaseUrl");
    }

    public static long getImplicitWait() {
        return Long.parseLong(getProperty("implicitWait"));
    }
}

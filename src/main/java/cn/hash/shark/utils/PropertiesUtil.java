package cn.hash.shark.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

    private Logger logger = LoggerFactory.getLogger(PropertiesUtil.class);

    private Properties properties;

    private InputStream inputStream;

    public PropertiesUtil(String filePath) {
        properties = new Properties();
        try {
            inputStream = this.getClass().getClassLoader().getResourceAsStream(filePath);
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            logger.error("装载文件失败");
            e.printStackTrace();
        }
    }

    /**
     * 重载方法，读取key-value
     * @param key
     * @return
     */
    public String getValue(String key) {
        if (properties.containsKey(key)) {
            return properties.getProperty(key);
        } else {
            return "";
        }
    }

    /**
     * 重载方法，读取key-value
     * @param fileName
     * @param key
     * @return
     */
    public String getValue(String fileName, String key) {
        String value = "";
        try {
            inputStream = this.getClass().getClassLoader().getResourceAsStream(fileName);
            properties.load(inputStream);
            inputStream.close();

            if (properties.containsKey(key)) {
                return properties.getProperty(key);
            } else {
                return "";
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * 根据指定的资源文件路径加载单个资源文件
     * @param filePath
     * @return
     */
    public static Properties loadPropertiesFile(String filePath) {
        Properties properties = new Properties();
        InputStream is = null;
        try {
            try {
                is = new FileInputStream(filePath);
                properties.load(is);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (is != null) {
                    is.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            properties = null;
        }
        return properties;
    }


}

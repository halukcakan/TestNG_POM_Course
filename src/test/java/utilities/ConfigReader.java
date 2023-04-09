package utilities;

import org.apache.commons.io.FileUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;

    static {

        String dosyaYolu = "configuration.properties";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            // fis dosya yolunu tanimladigimiz  con.pro dosyasini okudu

            properties = new Properties();
            properties.load(fis);       // fis'in okudugu bilgileri buraya yukledi

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    bu method test sirasinda girdigimiz deger "amazon"
    bizim configuration da bulunan "amazon" un value degerini
    bize getirmesi icin kullandigimiz method
     */

    public static String getProperty (String key){

        return properties.getProperty(key);
    }
}

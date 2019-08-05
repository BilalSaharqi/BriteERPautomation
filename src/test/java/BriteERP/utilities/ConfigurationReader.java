package BriteERP.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {


    private static Properties confiFile;

    static {

        try {
            String path = "configuration.properties";
            System.out.println(path);

            FileInputStream input = new FileInputStream(path);
            confiFile = new Properties();
            confiFile.load(input);
            input.close();
        }catch (Exception e){
            e.printStackTrace();



        }
    }

    public static String getProperty(String key){
        return confiFile.getProperty(key);
    }


}

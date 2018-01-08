package com.srujanika.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
    private static  PropertiesUtil instance=null;
    private static Properties properties=null;
    private PropertiesUtil(){
        this.properties = readproperties();

    }
    public static PropertiesUtil getInstance(){
        if(instance==null){
            instance=new PropertiesUtil();
        }
        return  instance;
    }

    //read properties here

    private Properties readproperties(){
        Properties properties=new Properties();
        try {
            properties.load(new FileInputStream("conf/matrimony.properties"));
            //properties.(new FileOutputStream("conf/matrimony.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(properties.get("profile_image_path"));
        return properties;

    }
     public String getProperty(String propertyName){
        return properties.getProperty(propertyName);
     }


}

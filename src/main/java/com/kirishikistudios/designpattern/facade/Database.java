package com.kirishikistudios.designpattern.facade;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author yamadanaoyuki
 */
public class Database {
    private Database(){
    }

    public static Properties getProperties(String dbname){
        String filename = dbname + ".txt";
        Properties properties = new Properties();
        try{
            properties.load(ClassLoader.getSystemResourceAsStream(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

}

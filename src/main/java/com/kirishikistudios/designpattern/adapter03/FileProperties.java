package com.kirishikistudios.designpattern.adapter03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author yamadanaoyuki
 */
public class FileProperties extends Properties implements FileIO {
    @Override
    public void readFromFile(String filename) throws IOException {
        load(ClassLoader.getSystemResourceAsStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        store(new FileOutputStream(filename), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key, "");
    }
}

package com.kirishikistudios.designpattern.adapter03;

import java.io.IOException;

/**
 * @author yamadanaoyuki
 */
public interface FileIO {
    public void readFromFile(String filename) throws IOException;
    public void writeToFile(String filename) throws IOException;
    public void setValue(String key, String value);
    public String getValue(String key);
}

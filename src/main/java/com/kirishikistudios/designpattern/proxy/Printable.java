package com.kirishikistudios.designpattern.proxy;

/**
 * @author yamadanaoyuki
 */
public interface Printable {
    public abstract void setPrinterName(String name);
    public abstract String getPrinterName();
    public abstract void print(String string);
}

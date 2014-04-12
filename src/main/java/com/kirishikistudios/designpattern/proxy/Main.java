package com.kirishikistudios.designpattern.proxy;

/**
 * @author yamadanaoyuki
 */
public class Main {
    public static void main(String[] args){
        Printable p = new PrinterProxy("Alice");
        System.out.println("名前は現在" + p.getPrinterName() + "です。");
        p.setPrinterName("Bob");
        System.out.printf("名前は現在" + p.getPrinterName() + "です。");
        p.print("Hello, World.");
    }
}

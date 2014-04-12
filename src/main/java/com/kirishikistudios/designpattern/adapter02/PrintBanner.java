package com.kirishikistudios.designpattern.adapter02;

/**
 * @author yamadanaoyuki
 */
public class PrintBanner extends Print {
    private Banner banner;
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }
    public void printWeak() {
        banner.showWithParen();
    }
    public void printStrong() {

    }
}

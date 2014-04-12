package com.kirishikistudios.designpattern.adapter02;

import com.kirishikistudios.designpattern.adapter.Print;
import com.kirishikistudios.designpattern.adapter.PrintBanner;

/**
 * @author yamadanaoyuki
 */
public class Main {
    public static void main(String[] args){
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}

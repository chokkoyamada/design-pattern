package com.kirishikistudios.designpattern.decorator;

/**
 * @author yamadanaoyuki
 */
public abstract class Border extends Display {
    protected Display display;
    protected Border(Display display){
        this.display = display;
    }
}

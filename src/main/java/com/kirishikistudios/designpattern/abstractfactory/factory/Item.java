package com.kirishikistudios.designpattern.abstractfactory.factory;

/**
 * @author yamadanaoyuki
 */
public abstract class Item {
    protected String caption;
    public Item(String caption){
        this.caption = caption;
    }

    public abstract String makeHTML();
}

package com.kirishikistudios.designpattern.prototype.framework;

/**
 * @author yamadanaoyuki
 */
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createClone();
}

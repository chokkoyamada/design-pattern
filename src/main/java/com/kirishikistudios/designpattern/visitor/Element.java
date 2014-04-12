package com.kirishikistudios.designpattern.visitor;

/**
 * @author yamadanaoyuki
 */
public interface Element {
    public abstract void accept(Visitor v);
}

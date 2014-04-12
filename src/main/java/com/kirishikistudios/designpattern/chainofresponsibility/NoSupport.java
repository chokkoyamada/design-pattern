package com.kirishikistudios.designpattern.chainofresponsibility;

/**
 * @author yamadanaoyuki
 */
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}

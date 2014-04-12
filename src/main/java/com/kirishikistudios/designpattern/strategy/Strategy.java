package com.kirishikistudios.designpattern.strategy;

/**
 * @author yamadanaoyuki
 */
public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}

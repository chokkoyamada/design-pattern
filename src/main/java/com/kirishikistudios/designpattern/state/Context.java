package com.kirishikistudios.designpattern.state;

/**
 * @author yamadanaoyuki
 */
public interface Context {
    public abstract void setClock(int hour);
    public abstract void changeState(State state);
    public abstract void callSecurityCenter(String msg);
    public abstract void recordLog(String msg);
}

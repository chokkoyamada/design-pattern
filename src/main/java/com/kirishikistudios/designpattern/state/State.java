package com.kirishikistudios.designpattern.state;

/**
 * @author yamadanaoyuki
 */
public interface State {
    public abstract void doClock(Context context, int hour);
    public abstract void doUse(Context context);
    public abstract void doAlarm(Context context);
    public abstract void doPhone(Context context);
}

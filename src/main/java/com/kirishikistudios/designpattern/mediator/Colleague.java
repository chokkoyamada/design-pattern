package com.kirishikistudios.designpattern.mediator;

/**
 * @author yamadanaoyuki
 */
public interface Colleague {
    public abstract void setMediator(Mediator mediator);
    public abstract void setColleagueEnabled(boolean enabled);
}

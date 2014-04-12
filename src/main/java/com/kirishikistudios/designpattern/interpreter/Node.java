package com.kirishikistudios.designpattern.interpreter;

import java.text.ParseException;

/**
 * @author yamadanaoyuki
 */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}

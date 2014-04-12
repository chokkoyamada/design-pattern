package com.kirishikistudios.designpattern.interpreter;

import java.text.ParseException;

/**
 * @author yamadanaoyuki
 * //<repeat command> ::= repeat <number> <command list>
 */
public class RepeatCommandNode extends Node {
    private int number;
    private Node commandListNode;

    @Override
    public String toString() {
        return "RepeatCommandNode{" +
                "number=" + number +
                ", commandListNode=" + commandListNode +
                '}';
    }

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }
}

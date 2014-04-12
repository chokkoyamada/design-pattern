package com.kirishikistudios.designpattern.interpreter;

import java.text.ParseException;

/**
 * @author yamadanaoyuki
 * //<command> ::= <repeat command> | <primitive command>
 */
public class CommandNode extends Node {
    private Node node;

    @Override
    public String toString() {
        return "CommandNode{" +
                "node=" + node +
                '}';
    }

    @Override
    public void parse(Context context) throws ParseException {
        if(context.currentToken().equals("repeat")){
            node = new RepeatCommandNode();
            node.parse(context);
        } else {
            node = new PrimitiveCommandNode();
            node.parse(context);
        }
    }
}

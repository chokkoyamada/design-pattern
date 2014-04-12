package com.kirishikistudios.designpattern.interpreter;

import java.text.ParseException;
import java.util.ArrayList;

/**
 * @author yamadanaoyuki
 * //<command list> ::= <command>* end
 */
public class CommandListNode extends Node {
    private ArrayList list = new ArrayList();

    @Override
    public String toString() {
        return "CommandListNode{" +
                "list=" + list +
                '}';
    }

    @Override
    public void parse(Context context) throws ParseException {
        while(true){
            if(context.currentToken() == null){
                throw new ParseException("Missing 'end'", 1);
            } else if(context.currentToken().equals("end")){
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }
}

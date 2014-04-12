package com.kirishikistudios.designpattern.abstractfactory.listfactory;

import com.kirishikistudios.designpattern.abstractfactory.factory.Item;
import com.kirishikistudios.designpattern.abstractfactory.factory.Tray;
import com.kirishikistudios.designpattern.iterator.Iterator;

/**
 * @author yamadanaoyuki
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }
    public String makeHTML(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        Iterator it = (Iterator) tray.iterator();
        while(it.hasNext()){
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}

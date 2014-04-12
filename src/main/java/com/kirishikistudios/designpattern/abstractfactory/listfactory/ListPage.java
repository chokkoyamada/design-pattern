package com.kirishikistudios.designpattern.abstractfactory.listfactory;

import com.kirishikistudios.designpattern.abstractfactory.factory.Item;
import com.kirishikistudios.designpattern.abstractfactory.factory.Page;
import com.kirishikistudios.designpattern.iterator.Iterator;

/**
 * @author yamadanaoyuki
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    protected String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<ul>\n");
        Iterator it = (Iterator) content.iterator();
        while(it.hasNext()){
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>" + author + "</address");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}

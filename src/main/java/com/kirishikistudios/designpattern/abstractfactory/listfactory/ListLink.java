package com.kirishikistudios.designpattern.abstractfactory.listfactory;

import com.kirishikistudios.designpattern.abstractfactory.factory.Link;

/**
 * @author yamadanaoyuki
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }
    public String makeHTML(){
        return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}

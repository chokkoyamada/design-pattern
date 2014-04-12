package com.kirishikistudios.designpattern.abstractfactory.listfactory;

import com.kirishikistudios.designpattern.abstractfactory.factory.Factory;
import com.kirishikistudios.designpattern.abstractfactory.factory.Link;
import com.kirishikistudios.designpattern.abstractfactory.factory.Page;
import com.kirishikistudios.designpattern.abstractfactory.factory.Tray;

/**
 * @author yamadanaoyuki
 */
public class ListFactory extends Factory{

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}

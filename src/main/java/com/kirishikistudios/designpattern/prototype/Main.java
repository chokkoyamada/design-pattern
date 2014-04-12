package com.kirishikistudios.designpattern.prototype;

import com.kirishikistudios.designpattern.prototype.framework.Manager;
import com.kirishikistudios.designpattern.prototype.framework.Product;

/**
 * @author yamadanaoyuki
 */
public class Main {
    public static void main(String[] args){
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox messageBox1 = new MessageBox('*');
        MessageBox messageBox2 = new MessageBox('/');
        manager.register("strong message", underlinePen);
        manager.register("warning box", messageBox1);
        manager.register("slash box", messageBox2);

        Product p1 = manager.create("strong message");
        p1.use("Hello, World");
        Product p2 = manager.create("warning box");
        p2.use("Hello, World");
        Product p3 = manager.create("slash box");
        p3.use("Hello, World");
    }
}

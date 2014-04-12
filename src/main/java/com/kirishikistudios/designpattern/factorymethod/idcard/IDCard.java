package com.kirishikistudios.designpattern.factorymethod.idcard;

import com.kirishikistudios.designpattern.factorymethod.framework.Product;

/**
 * @author yamadanaoyuki
 */
public class IDCard extends Product{
    private String owner;
    private int serial;
    IDCard(String owner, int serial){
        System.out.println(owner + "(" + serial + ")" + "のカードを作ります。");
        this.owner = owner;
        this.serial = serial;
    }
    public void use() {
        System.out.println(owner + "(" + serial + ")" + "のカードを使います。");
    }

    public int getSerial() {
        return serial;
    }

    public String getOwner(){
        return owner;
    }
}

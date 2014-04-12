package com.kirishikistudios.designpattern.memento.game;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yamadanaoyuki
 */
public class Memento {
    int money;
    ArrayList fruits;
    public int getMoney(){
        return money;
    }

    public Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruit(String fruit){
        fruits.add(fruit);
    }

    List getFruits(){
        return (List)fruits.clone();
    }
}

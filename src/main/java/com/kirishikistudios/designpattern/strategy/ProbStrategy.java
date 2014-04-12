package com.kirishikistudios.designpattern.strategy;

import javafx.scene.control.RadioMenuItem;

import java.util.Random;

/**
 * @author yamadanaoyuki
 */
public class ProbStrategy implements Strategy {
    private Random random;
    private int prevHandValue = 0;
    private int currentHandValue = 0;

    private int[][] history = {
            {1, 1, 1,},
            {1, 1, 1,},
            {1, 1, 1,},
    };

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));
        int handvalue = 0;
        if(bet < history[currentHandValue][0]) {
            handvalue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]){
            handvalue = 1;
        } else {
            handvalue = 2;
        }
        prevHandValue = currentHandValue;
        currentHandValue = handvalue;
        return Hand.getHand(handvalue);
    }

    private int getSum(int handValue) {
        int sum = 0;
        for (int i = 0; i < 3; i++){
            sum += history[handValue][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if(win){
            history[prevHandValue][currentHandValue]++;
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}

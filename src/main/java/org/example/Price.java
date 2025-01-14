package org.example;

import javax.swing.*;

public class Price {

    private int cost = 3;

    public float calculatePrice(int start, int end){
        float price = 0;
        for(int i = start; i < end; i++){
            if(i >= hour(8) && i <= hour(17)){
                price += cost;
            }
        }
        return price / 60;
    }

    public int hour(float h){
        return (int) (h * 60);
    }
}

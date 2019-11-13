package com.company;

public class Die {
    private int NumDots;

    public Die (int n){
        NumDots = n;
    }
    public int getNumDots(){
        return NumDots;
    }
    public void roll(){
       int s = (int) (Math.random()*6 + 1);
       NumDots = s;
    }
}
